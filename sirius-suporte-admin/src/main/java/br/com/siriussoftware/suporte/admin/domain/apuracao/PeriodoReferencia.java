package br.com.siriussoftware.suporte.admin.domain.apuracao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import br.com.siriussoftware.library.suporte.ui.model.apuracao.SituacaoPeriodoReferenciaEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_PERREF")
@Data
@EqualsAndHashCode(callSuper = true)
public class PeriodoReferencia extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, nullable = false, insertable = true, updatable = false)
	private String nome;

	@Column(name = "DSDES", length = 300, nullable = false, insertable = true, updatable = false)
	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHINI", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar inicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DHTER", length = 30, nullable = false, insertable = true, updatable = false)
	private Calendar termino;

	@Enumerated(EnumType.STRING)
	@Column(name = "ICSITPERREF", length = 30, nullable = false, insertable = true, updatable = false)
	private SituacaoPeriodoReferenciaEnum situacaoPeriodo;

	@Column(name = "ICABE", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean aberto;

	@Column(name = "ICFAT", length = 1, nullable = false, insertable = true, updatable = false)
	private boolean faturado;
}
