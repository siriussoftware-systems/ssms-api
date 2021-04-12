/*
 * Copyright (c) 2003, 2019, Sirius Software Ltda and/or its affiliates. All rights reserved.
 * SIRIUS SOFTWARE LTDA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.siriussoftware.notification.infra.mail;

public class SendMailException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SendMailException(String message) {
		super(message);
	}
}
