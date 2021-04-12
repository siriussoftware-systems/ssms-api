package br.com.siriussoftware.suporte.admin.domain.apuracao;

import java.util.Calendar;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PeriodoReferencia extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private String nome;

	private String descricao;

	private Calendar inicio;

	private Calendar termino;

	@Enumerated(EnumType.STRING)
	private SituacaoPeriodoReferenciaEnum situacaoPeriodo;

	private boolean aberto;

	private boolean faturado;
}
