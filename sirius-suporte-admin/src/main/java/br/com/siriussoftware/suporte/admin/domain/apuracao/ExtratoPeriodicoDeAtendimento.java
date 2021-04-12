package br.com.siriussoftware.suporte.admin.domain.apuracao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.suporte.admin.domain.chamado.Chamado;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.domain.cliente.Software;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ExtratoPeriodicoDeAtendimento extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private Calendar dataApuracao;
	private PeriodoReferencia referencia;
	private Cliente cliente;
	private Software software;
	private List<Chamado> chamado;
	private Long totais;
	private Long abertos;
	private Long encerrados;
	private Long finalizados;
	private Long duplicados;
	private BigDecimal horasTotaisDeAtendimento;
	private BigDecimal horasMediasPorAtendimento;
	private Long cobrados;
	private Long naoCobrados;
	private Long faturados;
	private BigDecimal totalCobrado;
	private BigDecimal totalFaturado;
}
