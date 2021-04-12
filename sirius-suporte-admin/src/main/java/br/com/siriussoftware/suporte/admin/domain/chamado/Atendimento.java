package br.com.siriussoftware.suporte.admin.domain.chamado;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Atendimento extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private String id;
	private Calendar inicio;
	private Calendar termino;
	private Atendente atendente;
	private Chamado chamado;
	private List<Solucao> solucoes;
	private boolean diaUtil;
	private BigDecimal totalRealizado;
	private Long totalAFaturar;
	private BigDecimal valorAFaturar;
}
