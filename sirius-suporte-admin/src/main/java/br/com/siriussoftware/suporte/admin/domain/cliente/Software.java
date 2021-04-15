package br.com.siriussoftware.suporte.admin.domain.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_SOF")
@Data
@EqualsAndHashCode(callSuper = true)
public class Software extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String nome;
}
