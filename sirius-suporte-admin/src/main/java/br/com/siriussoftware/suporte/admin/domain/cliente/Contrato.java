package br.com.siriussoftware.suporte.admin.domain.cliente;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.suporte.ui.model.cliente.SituacaoContratoEnum;
import br.com.siriussoftware.library.suporte.ui.model.cliente.TipoContratoEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_CON")
@Data
@EqualsAndHashCode(callSuper = true)
public class Contrato extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String nome;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHINI", length = 30, nullable = false, insertable = true, updatable = false)
	@NotNull
	private Calendar inicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHTER", length = 30, nullable = false, insertable = true, updatable = false)
	@NotNull
	private Calendar termino;

	@Column(name = "IDSOF", length = 120, insertable = true, updatable = true, nullable = false)
	private String software;

	@Column(name = "IDCLI", length = 120, insertable = true, updatable = true, nullable = false)
	private String cliente;

	@Enumerated(EnumType.STRING)
	@Column(name = "ICTIP", length = 30, nullable = false, insertable = true, updatable = false)
	private TipoContratoEnum tipo;

	@Enumerated(EnumType.STRING)
	@Column(name = "ICSITCON", length = 30, nullable = false, insertable = true, updatable = true)
	private SituacaoContratoEnum situacaoContrato;

}
