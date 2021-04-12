package br.com.siriussoftware.suporte.admin.domain.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.base.domain.DomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = DomainEntity.SUFIXO_TABELAS + "SOL")
@Data
@EqualsAndHashCode(callSuper = true)
public class Solicitante extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	@NotEmpty
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Cliente.class)
	@JoinColumn(name = "IDCLI", referencedColumnName = "ID")
	@NotNull
	private Cliente cliente;

}
