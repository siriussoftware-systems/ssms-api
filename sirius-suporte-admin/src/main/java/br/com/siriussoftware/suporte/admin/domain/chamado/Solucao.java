package br.com.siriussoftware.suporte.admin.domain.chamado;

import java.util.List;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Solucao extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private String id;
	private String resumo;
	private String descricao;
	private List<Evidencia> evidencias;

}
