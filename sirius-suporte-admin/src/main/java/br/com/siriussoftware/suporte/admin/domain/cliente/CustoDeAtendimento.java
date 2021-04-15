package br.com.siriussoftware.suporte.admin.domain.cliente;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_CUSATE")
@Data
@EqualsAndHashCode(callSuper = true)
public class CustoDeAtendimento extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String nome;

	@Column(name = "ICDIAUTI", length = 1, insertable = true, updatable = true, nullable = false)
	private boolean diaUtil;

	@Column(name = "DSHORINI", length = 5, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String inicio;

	@Column(name = "DSHORFIM", length = 5, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String fim;

	@Column(name = "VLVAL", insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private BigDecimal valor;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Contrato.class)
	@JoinColumn(name = "IDCON", referencedColumnName = "ID")
	private Contrato contrato;

}
