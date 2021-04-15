package br.com.siriussoftware.suporte.admin.domain.chamado;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_SOL")
@Data
@EqualsAndHashCode(callSuper = true)
public class Solucao extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	private String resumo;

	@Column(name = "DSDES", length = 50, insertable = true, updatable = true, nullable = false)
	private String descricao;

	@OneToMany(fetch = FetchType.EAGER, targetEntity = Evidencia.class, orphanRemoval = true, cascade = { CascadeType.REFRESH, CascadeType.REMOVE })
	private List<Evidencia> evidencias;

}
