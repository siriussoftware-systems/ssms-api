package br.com.siriussoftware.suporte.admin.domain.chamado;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "TBSUP_ANE")
@Data
@EqualsAndHashCode(callSuper = true)
public class Anexo extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "DSNOM", length = 50, insertable = true, updatable = true, nullable = false)
	private String nome;

	@Lob
	@Column(name = "DSCON")
	private String conteudo;

}
