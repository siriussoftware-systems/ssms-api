package br.com.siriussoftware.suporte.admin.domain.chamado;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_ATD")
@Data
@EqualsAndHashCode(callSuper = true)
public class Atendimento extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DHINI", insertable = true, updatable = true, nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar inicio;

	@Column(name = "DHTER", insertable = true, updatable = true, nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar termino;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Atendente.class)
	@JoinColumn(name = "IDATE", referencedColumnName = "ID")
	private Atendente atendente;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Chamado.class)
	@JoinColumn(name = "IDCHA", referencedColumnName = "ID")
	private Chamado chamado;

	@OneToMany(fetch = FetchType.EAGER, targetEntity = Solucao.class, orphanRemoval = true, cascade = { CascadeType.REFRESH, CascadeType.REMOVE })
	private List<Solucao> solucoes;

	@Column(name = "ICDIAUTI", precision = 1, insertable = true, updatable = true, nullable = false)
	private boolean diaUtil;

	@Column(name = "NUTOTREA", insertable = true, updatable = true, nullable = false)
	private BigDecimal totalRealizado;

	@Column(name = "NUTOTFAT", insertable = true, updatable = true, nullable = false)
	private Long totalAFaturar;

	@Column(name = "VLVALFAT", insertable = true, updatable = true, nullable = false)
	private BigDecimal valorAFaturar;
}
