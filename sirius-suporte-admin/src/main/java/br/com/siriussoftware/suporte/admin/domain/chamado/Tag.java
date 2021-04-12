package br.com.siriussoftware.suporte.admin.domain.chamado;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.base.domain.DomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = DomainEntity.SUFIXO_TABELAS + "TAG")
@Data
@EqualsAndHashCode(callSuper = true)
public class Tag extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String nome;
}