package br.com.siriussoftware.suporte.admin.domain.apuracao;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.suporte.admin.domain.chamado.Chamado;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.domain.cliente.Software;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_EXTPERATE")
@Data
@EqualsAndHashCode(callSuper = true)
public class ExtratoPeriodicoDeAtendente extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHENC", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar dataApuracao;

	@OneToOne
	@JoinColumn(name = "IDPERREF", referencedColumnName = "ID")
	private PeriodoReferencia referencia;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Cliente.class)
	@JoinColumn(name = "IDCLI", referencedColumnName = "ID")
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Software.class)
	@JoinColumn(name = "IDSOF", referencedColumnName = "ID")
	private Software software;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Chamado.class, cascade = { CascadeType.REFRESH })
	private List<Chamado> chamado;

	@Column(name = "NUTOT", length = 10, nullable = false, insertable = true, updatable = false)
	private Long totais;

	@Column(name = "NUABE", length = 10, nullable = false, insertable = true, updatable = false)
	private Long abertos;

	@Column(name = "NUENC", length = 10, nullable = false, insertable = true, updatable = false)
	private Long encerrados;

	@Column(name = "NUFIN", length = 10, nullable = false, insertable = true, updatable = false)
	private Long finalizados;

	@Column(name = "NUDUP", length = 10, nullable = false, insertable = true, updatable = false)
	private Long duplicados;

	@Column(name = "NUHORTOTATD", length = 10, nullable = false, insertable = true, updatable = false)
	private BigDecimal horasTotaisDeAtendimento;

	@Column(name = "NUHORMEDATD", length = 10, nullable = false, insertable = true, updatable = false)
	private BigDecimal horasMediasPorAtendimento;

	@Column(name = "NUCOB", length = 10, nullable = false, insertable = true, updatable = false)
	private Long cobrados;

	@Column(name = "NUNAOCOB", length = 10, nullable = false, insertable = true, updatable = false)
	private Long naoCobrados;

	@Column(name = "NUFAT", length = 10, nullable = false, insertable = true, updatable = false)
	private Long faturados;

	@Column(name = "VLTOTCOB", nullable = false, insertable = true, updatable = false)
	private BigDecimal totalCobrado;

	@Column(name = "VLTOTFAT", nullable = false, insertable = true, updatable = false)
	private BigDecimal totalFaturado;

	@Column(name = "VLCUSDIS", nullable = false, insertable = true, updatable = false)
	private BigDecimal valorCustoDisponibilidade;

	@Column(name = "VLTOTGER", nullable = false, insertable = true, updatable = false)
	private BigDecimal totalGeral;
}
