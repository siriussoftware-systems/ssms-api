package br.com.siriussoftware.suporte.admin.domain.cliente;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.base.domain.DomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = DomainEntity.SUFIXO_TABELAS + "CLI")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cliente extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String nome;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente", orphanRemoval = true, cascade = { CascadeType.REFRESH,
			CascadeType.REMOVE })
	private List<Solicitante> solicitantes;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", orphanRemoval = true, cascade = { CascadeType.REFRESH,
			CascadeType.REMOVE })
	private List<Contrato> contrato;

	// private List<SLA> slas;
}
