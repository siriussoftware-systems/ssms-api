/*
 * Copyright(c) Sirius Software
 * 
 * Todos os direitos reservados. 
 * Este software é informação confidencial e de propriedade da Sirius Software. 
 * Sua divulgação e utilização somente devem ser feitas sob autorização expressa da Sirius Software.
 * 
 */
package br.com.siriussoftware.notification.domain.notificacao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.base.domain.SistemaEnum;
import br.com.siriussoftware.library.notification.domain.enumeration.OrigemNotificacaoEnum;
import br.com.siriussoftware.library.notification.domain.enumeration.SituacaoNotificacaoEnum;
import br.com.siriussoftware.library.notification.domain.enumeration.TipoNotificacaoEnum;
import br.com.siriussoftware.notification.domain.empresa.Empresa;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "TBNOT_NOT")
@Data
@EqualsAndHashCode(callSuper = true)
public class Notificacao extends AbstractDomainEntity {
	private static final long serialVersionUID = -1L;

	/** nome da mensagem a ser enviada ao usuário **/
	@Column(name = "DSNOM", length = 100)
	private String nome;

	/** mensagem a ser enviada ao usuário **/
	@Column(name = "DSMEN", insertable = true, updatable = true)
	@Lob
	private String mensagem;

	/** conta do usuário nas mídias sociais ou email do usuário **/
	@Column(name = "DSCONUSU", length = 300)
	private String contaUsuario;

	@Column(name = "DSDES", length = 500)
	private String destinatario;

	/**
	 * data em que o usuário realizou a abertura/leitura da mensagem. Aplicadas para
	 * mensagem do tipo {@see TipoNotificacaoEnum.MENSAGEM_PRIVADA}
	 **/
	@Column(name = "DHENV")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataEnvio;

	/** String contendo os nomes dos anexos separados por vírgula **/
	@Column(name = "DSATT")
	private String attachments;

	/**
	 * data em que o usuário realizou a abertura/leitura da mensagem. Aplicadas para
	 * mensagem do tipo {@see TipoNotificacaoEnum.MENSAGEM_PRIVADA}
	 **/
	@Column(name = "DHLEI")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataLeitura;

	/** tipo de notificação **/
	@Column(name = "ICTIPNOT")
	@Enumerated(EnumType.STRING)
	private TipoNotificacaoEnum tipoNotificacao;

	/** origem da notificação **/
	@Column(name = "ICORINOT")
	@Enumerated(EnumType.STRING)
	private OrigemNotificacaoEnum origemNotificacao;

	/** situação da notificação **/
	@Column(name = "ICSITNOT")
	@Enumerated(EnumType.STRING)
	private SituacaoNotificacaoEnum situacaoNotificacao;

	@Column(name = "ICSIS")
	@Enumerated(EnumType.STRING)
	private SistemaEnum sistema;

	/** descrição do motivo da notificação não ter sido enviada **/
	@Column(name = "DSMOT", insertable = true, updatable = true)
	@Lob
	private String motivoNaoEnvio;

	/** data e hora da última tentativa de envio da notificação **/
	@Column(name = "DHULTTENENV")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataUltimaTentativaEnvio;

	/** The empresa. */
	@ManyToOne
	@JoinColumn(name = "IDEMP", referencedColumnName = "ID")
	private Empresa empresa;

}