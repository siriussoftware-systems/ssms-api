package br.com.siriussoftware.authentication.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "TBAUT_ROLE")
@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	private String nome;

}
