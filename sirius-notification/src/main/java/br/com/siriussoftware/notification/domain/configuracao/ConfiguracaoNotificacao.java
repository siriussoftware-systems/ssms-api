package br.com.siriussoftware.notification.domain.configuracao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.base.domain.SistemaEnum;
import br.com.siriussoftware.library.notification.domain.enumeration.ServidorEmailEnum;
import br.com.siriussoftware.notification.domain.empresa.Empresa;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "TBNOT_CFG")
@Data
@EqualsAndHashCode(callSuper = true)
public class ConfiguracaoNotificacao extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	/** The empresa. */
	@OneToOne
	@JoinColumn(name = "IDEMP", referencedColumnName = "ID")
	private Empresa empresa;

	@Column(name = "ICSIS")
	@Enumerated(EnumType.STRING)
	private SistemaEnum sistema;

	/** emailModel Administrador **/
	@Column(name = "DSEMAADM", length = 200)
	@NotBlank
	@Email
	private String emailAdministrador;

	/** flag utilizada para determinar se o robo está ativo ou inativo **/
	@Column(name = "ICATVROBEMA")
	private boolean ativarRoboEmail;

	/** flag utilizada para determinar autenticação smtp */
	@Column(name = "ICMAISMTAUT", nullable = true)
	private boolean mailSmtpsAuth;

	/** flag utilizada para determinar autenticação smtp está ativa */
	@Column(name = "ICMAISMTPSTATTSENA", nullable = true)
	private boolean mailSmtpsStarttsEnable;

	/** flag utilizada para determinar autenticação smtp em debug */
	@Column(name = "ICMAISMTDEB", nullable = true)
	private boolean mailSmtpsDebug;

	/** flag utilizada para determinar autenticação smtp encoding */
	@Column(name = "DSMAIDEFENC", nullable = true)
	@NotBlank
	private String mailDefaultEncoding;

	/** host do servidor de email */
	@Column(name = "DSMAIHOS", nullable = true)
	@NotBlank
	private String mailHost;

	/** porta do servidor de email */
	@Column(name = "NUMAIPOR", nullable = true)
	@NotNull
	private Long mailPort;

	/** protocolo do servidor de email */
	@Column(name = "DSMAIPRO", nullable = true)
	@NotBlank
	private String mailProtocol;

	/** usuário do servidor de email */
	@Column(name = "DSMAIUSR", nullable = true)
	@NotBlank
	private String mailUsername;

	/** senha do servidor de email */
	@Column(name = "DSMAIPWD", nullable = true)
	@NotBlank
	private String mailPassword;

	/** servidor de email **/
	@Column(name = "ICSRVEMA")
	@Enumerated(EnumType.STRING)
	private ServidorEmailEnum servidorEmail;

}