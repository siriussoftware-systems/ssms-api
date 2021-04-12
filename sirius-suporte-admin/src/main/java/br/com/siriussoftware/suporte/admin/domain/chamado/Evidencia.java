package br.com.siriussoftware.suporte.admin.domain.chamado;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Evidencia extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	private String conteudo;
	private Solucao solucao;
}
