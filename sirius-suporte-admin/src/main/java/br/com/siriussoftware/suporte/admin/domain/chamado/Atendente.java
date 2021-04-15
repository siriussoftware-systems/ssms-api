package br.com.siriussoftware.suporte.admin.domain.chamado;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_ATE")
@Data
@EqualsAndHashCode(callSuper = true)
public class Atendente extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	private String nome;

	@Column(name = "VLCUSDIS", insertable = true, updatable = true, nullable = false)
	private BigDecimal custoDisponibilidade;

	@Column(name = "PCCOMATD", insertable = true, updatable = true, nullable = false)
	private BigDecimal comissaoSobreAtendimento;

}
