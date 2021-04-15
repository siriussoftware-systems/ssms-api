package br.com.siriussoftware.suporte.admin.domain.chamado;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_TAG")
@Data
@EqualsAndHashCode(callSuper = true)
public class Tag extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	private String nome;
}
