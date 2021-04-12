/*
 * Copyright (c) 2003, 2019, Sirius Software Ltda and/or its affiliates. All rights reserved.
 * SIRIUS SOFTWARE LTDA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.siriussoftware.notification.domain.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "TBNOT_EMP")
@Data
@EqualsAndHashCode(callSuper = true)
public class Empresa extends AbstractDomainEntity {
	private static final long serialVersionUID = -1L;

	/** The unidade empresarial. */
	@ManyToOne
	@JoinColumn(name = "IDUNIEMP", referencedColumnName = "ID")
	@JsonManagedReference
	@NotNull
	private UnidadeEmpresarial unidadeEmpresarial;

	/** The razao social. */
	@Column(name = "DSRAZSOC", insertable = true, updatable = true)
	@NotBlank
	private String razaoSocial;

}