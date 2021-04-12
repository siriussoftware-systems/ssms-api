package br.com.siriussoftware.notification.service.notificacao;

import java.util.Calendar;
import java.util.List;

import javax.mail.internet.InternetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.library.base.service.BaseServiceImpl;
import br.com.siriussoftware.library.base.service.BusinessException;
import br.com.siriussoftware.library.notification.domain.enumeration.SituacaoNotificacaoEnum;
import br.com.siriussoftware.library.notification.domain.enumeration.TipoNotificacaoEnum;
import br.com.siriussoftware.notification.domain.configuracao.ConfiguracaoNotificacao;
import br.com.siriussoftware.notification.domain.notificacao.Notificacao;
import br.com.siriussoftware.notification.infra.mail.MailService;
import br.com.siriussoftware.notification.infra.repository.notificacao.NotificacaoRepository;
import br.com.siriussoftware.notification.service.configuracao.ConfiguracaoNotificacaoService;

@Service
public class NotificacaoService extends BaseServiceImpl<Notificacao, NotificacaoRepository, String> {

	/** instâncias para repositorios */
	@Autowired
	private NotificacaoRepository repository;

	/** instâncias para serviços */
	@Autowired(required = true)
	private MailService mailService;

	@Autowired
	private ConfiguracaoNotificacaoService configuracaoNotificacaoService;

	/**
	 * @see br.com.siriussoftware.sgo.base.service.BaseServiceImpl#getRepository()
	 */
	public NotificacaoRepository getRepository() {
		return this.repository;
	}

	public List<Notificacao> buscarNotificacoesNaoEnviadas() {
		return this.getRepository().findBySituacaoNotificacao(SituacaoNotificacaoEnum.NAO_ENVIADA);
	}

	public List<Notificacao> buscarNotificacoesDoUsuario(String destinatarioEmail) {
		return this.getRepository().findByDestinatario(destinatarioEmail);
	}

	/**
	 * Realiza o envio de notificações através de email
	 */
	public void enviarNotificacoes() {
		try {
			List<Notificacao> notificacoesNaoEnviadas = this.buscarNotificacoesNaoEnviadas();
			for (Notificacao notificacao : notificacoesNaoEnviadas) {
				ConfiguracaoNotificacao configuracao = configuracaoNotificacaoService
						.findBySistemaAndEmpresa(notificacao.getSistema(), notificacao.getEmpresa());
				if (configuracao != null && configuracao.isAtivarRoboEmail()) {
					if (notificacao.getTipoNotificacao().equals(TipoNotificacaoEnum.BANNER)
							|| notificacao.getTipoNotificacao().equals(TipoNotificacaoEnum.TWITTER)) {
						notificacao.setSituacaoNotificacao(SituacaoNotificacaoEnum.NAO_SUPORTADA);
					} else {
						notificacao.setSituacaoNotificacao(SituacaoNotificacaoEnum.EM_ENVIO);
						this.getRepository().save(notificacao);

						try {
							notificacao = this.enviarEmailNotificacao(notificacao, configuracao);
							notificacao.setDataEnvio(Calendar.getInstance());
							notificacao.setSituacaoNotificacao(SituacaoNotificacaoEnum.ENVIADA);
						} catch (BusinessException e) {
							notificacao.setDataUltimaTentativaEnvio(Calendar.getInstance());
							notificacao.setMotivoNaoEnvio(e.getMessage());
							notificacao.setSituacaoNotificacao(SituacaoNotificacaoEnum.NAO_ENVIADA);
						}

						this.getRepository().save(notificacao);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Realiza o envio de notificações ao usuário
	 * 
	 * @param notificacao  - objeto com as informações de notificação
	 * @param configuracao - configurações utilizada para envio de email
	 * 
	 * @return Objeto de Notificação
	 * 
	 * @throws BusinessException - exception lançada quando ocorre erro na regra de
	 *                           negócio
	 */
	private Notificacao enviarEmailNotificacao(Notificacao notificacao, ConfiguracaoNotificacao configuracao)
			throws BusinessException {
		try {
			String[] emails = notificacao.getDestinatario().split(";");

			String toMail = emails[0];

			InternetAddress[] addressCc = new InternetAddress[emails.length - 1];
			for (int i = 1; i < emails.length; i++) {
				addressCc[i - 1] = new InternetAddress(emails[i]);
			}

			// Seta as informações no email
			String de = notificacao.getContaUsuario();
			String assunto = notificacao.getNome();
			String para = toMail;
			String conteudo = notificacao.getMensagem();

			mailService.enviarEmail(notificacao.getSistema(), notificacao.getEmpresa(), de, para, assunto, conteudo,
					false, null);
		} catch (Exception e) {
			throw new BusinessException(e);
		}

		return notificacao;
	}

}
