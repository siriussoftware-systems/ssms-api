package br.com.siriussoftware.suporte.admin.domain.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_SOC")
@Data
@EqualsAndHashCode(callSuper = true)
public class Solicitante extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String nome;

	@Column(name = "IDCLI", length = 120, insertable = true, updatable = true, nullable = false)
	private String cliente;

}
