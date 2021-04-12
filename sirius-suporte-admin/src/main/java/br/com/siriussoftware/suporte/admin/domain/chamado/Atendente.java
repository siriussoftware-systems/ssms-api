package br.com.siriussoftware.suporte.admin.domain.chamado;

import java.math.BigDecimal;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Atendente extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	private BigDecimal custoDisponibilidade;
	private BigDecimal comissaoSobreAtendimento;

}
