package br.com.siriussoftware.suporte.admin.domain.chamado;

import java.math.BigDecimal;
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

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.suporte.ui.model.chamado.SituacaoChamadoEnum;
import br.com.siriussoftware.suporte.admin.domain.apuracao.PeriodoReferencia;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.domain.cliente.Software;
import br.com.siriussoftware.suporte.admin.domain.cliente.Solicitante;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_CHA")
@Data
@EqualsAndHashCode(callSuper = true)
public class Chamado extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNUM", length = 30, nullable = false, insertable = true, updatable = false)
	private String numero;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PeriodoReferencia.class)
	@JoinColumn(name = "IDPERREF", referencedColumnName = "ID")
	private PeriodoReferencia referencia;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Cliente.class)
	@JoinColumn(name = "IDCLI", referencedColumnName = "ID")
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Solicitante.class)
	@JoinColumn(name = "IDSOL", referencedColumnName = "ID")
	private Solicitante solicitante;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Software.class)
	@JoinColumn(name = "IDSOF", referencedColumnName = "ID")
	private Software software;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHABE", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar abertura;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHENC", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar encerramento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHINIATE", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar inicioAtendimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHTERATE", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar terminoAtendimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHFIN", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar finalizacao;

	@OneToMany(fetch = FetchType.EAGER, targetEntity = Atendimento.class, orphanRemoval = true, cascade = { CascadeType.REFRESH, CascadeType.REMOVE })
	private List<Atendimento> atendimentos;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Anexo.class, orphanRemoval = true, cascade = { CascadeType.REFRESH, CascadeType.REMOVE })
	private List<Anexo> anexos;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Tag.class, orphanRemoval = true, cascade = { CascadeType.REFRESH, CascadeType.REMOVE })
	private List<Tag> tags;

	@Enumerated(EnumType.STRING)
	@Column(name = "ICSITCHA", length = 30, nullable = false, insertable = true, updatable = false)
	private SituacaoChamadoEnum situacaoChamado;

	@Column(name = "ICATECON", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean atendimentoConcluido;

	@Column(name = "ICENC", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean encerrado;

	@Column(name = "ICFIN", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean finalizado;

	@Column(name = "ICDUP", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean duplicado;

	@Column(name = "NUTOTHORATD", nullable = false, insertable = true, updatable = false)
	private BigDecimal totalHorasDeAtendimento;

	@Column(name = "VLVALCOB", nullable = false, insertable = true, updatable = false)
	private BigDecimal valorCobrado;

	@Column(name = "DSMOTFIN", length = 300, nullable = false, insertable = true, updatable = false)
	private String motivoFinalizacao;

	@Column(name = "ICCOB", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean cobrar;

	@Column(name = "DSJUSNAOCOB", length = 300, nullable = false, insertable = true, updatable = false)
	private String justificativaParaNaoCobrar;

	@Column(name = "ICFAT", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean faturado;

	@Column(name = "VLVALFAT", nullable = false, insertable = true, updatable = false)
	private BigDecimal valorFaturado;
}
