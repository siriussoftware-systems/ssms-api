package br.com.siriussoftware.suporte.admin.domain.chamado;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.suporte.admin.domain.apuracao.PeriodoReferencia;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.domain.cliente.Software;
import br.com.siriussoftware.suporte.admin.domain.cliente.Solicitante;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Chamado extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private String id;
	private String numero;
	private PeriodoReferencia periodoReferencia;
	private Cliente cliente;
	private Solicitante solicitante;
	private Software software;
	private Calendar abertura;
	private Calendar encerramento;
	private Calendar inicioAtendimento;
	private Calendar terminoAtendimento;
	private Calendar finalizacao;
	private List<Atendimento> atendimentos;
	private List<Anexo> anexos;
	private List<Tag> tags;
	private SituacaoChamadoEnum situacaoChamado;
	private boolean atendimentoConcluido;
	private boolean encerrado;
	private boolean finalizado;
	private boolean duplicado;
	private BigDecimal totalHorasDeAtendimento;
	private BigDecimal valorCobrado;
	private String motivoFinalizacao;
	private List<Chamado> chamadosDuplicados;

	private boolean cobrar;
	private String justificativaParaNaoCobrar;

	private boolean faturado;
	private BigDecimal valorFaturado;
}
