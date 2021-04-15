package br.com.siriussoftware.suporte.admin.domain.cliente;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHINI", length = 30, nullable = false, insertable = true, updatable = false)
	@NotNull
	private Calendar inicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHTER", length = 30, nullable = false, insertable = true, updatable = false)
	@NotNull
	private Calendar termino;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Cliente.class)
	@JoinColumn(name = "IDSOF", referencedColumnName = "ID")
	private Software software;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "contrato", orphanRemoval = true, cascade = { CascadeType.REFRESH, CascadeType.REMOVE })
	private List<CustoDeAtendimento> custosDeAtendimento;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Cliente.class)
	@JoinColumn(name = "IDCLI", referencedColumnName = "ID")
	private Cliente cliente;

	@Enumerated(EnumType.STRING)
	@Column(name = "ICTIP", length = 30, nullable = false, insertable = true, updatable = false)
	private TipoContratoEnum tipo;

	@Enumerated(EnumType.STRING)
	@Column(name = "ICSITCON", length = 30, nullable = false, insertable = true, updatable = true)
	private SituacaoContratoEnum situacaoContrato;

}
