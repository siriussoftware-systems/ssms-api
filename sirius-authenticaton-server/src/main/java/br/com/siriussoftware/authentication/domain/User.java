package br.com.siriussoftware.authentication.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "TBAUT_USR")
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractDomainEntity  {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String email;
	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "TBAUT_USR_ROL", joinColumns = @JoinColumn(name = "IDUSR", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "IDROL", referencedColumnName = "ID"))
	private Set<Role> roles = new HashSet<>();

}
