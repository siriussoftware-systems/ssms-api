/*
 * Copyright (c) 2003, 2019, Sirius Software Ltda and/or its affiliates. All rights reserved.
 * SIRIUS SOFTWARE LTDA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.siriussoftware.notification.domain.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.siriussoftware.library.base.domain.AbstractDomainEntity;

/**
 * The Class UnidadeEmpresarialVO.
 */
@Entity
@Table(name = "TBNOT_UNIEMP")
public class UnidadeEmpresarial extends AbstractDomainEntity {
	private static final long serialVersionUID = 1L;

	/** The nome. */
	@Column(name = "DSNOM", length = 120, precision = 0, insertable = true, updatable = true)
	@NotBlank
	@Size(min = 2, max = 120)
	private String nome;

}