package br.com.siriussoftware.notification.service.configuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.library.base.domain.SistemaEnum;
import br.com.siriussoftware.library.base.service.BaseServiceImpl;
import br.com.siriussoftware.notification.domain.configuracao.ConfiguracaoNotificacao;
import br.com.siriussoftware.notification.domain.empresa.Empresa;
import br.com.siriussoftware.notification.infra.repository.configuracao.ConfiguracaoNotificacaoRepository;

@Service
public class ConfiguracaoNotificacaoService
		extends BaseServiceImpl<ConfiguracaoNotificacao, ConfiguracaoNotificacaoRepository, String> {

	/** Instância para os repositórios */
	@Autowired
	private ConfiguracaoNotificacaoRepository repository;

	@Override
	public ConfiguracaoNotificacaoRepository getRepository() {
		return this.repository;
	}

	public ConfiguracaoNotificacao findBySistemaAndEmpresa(SistemaEnum sistema, Empresa empresa) {
		return this.getRepository().findBySistemaAndEmpresa(sistema, empresa);
	}

}