/*
 * Copyright (c) 2003, 2019, Sirius Software Ltda and/or its affiliates. All rights reserved.
 * SIRIUS SOFTWARE LTDA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.siriussoftware.base.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.library.base.domain.DomainEntity;
import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.library.base.service.BaseServiceImpl;
import br.com.siriussoftware.library.base.service.exception.BusinessException;
import br.com.siriussoftware.library.base.service.exception.ExclusionNotPermitedException;
import br.com.siriussoftware.library.notification.ui.model.AuditoriaVO;
import br.com.siriussoftware.suporte.admin.infra.message.AuditoriaProducerMessage;
import br.com.siriussoftware.suporte.admin.infra.message.NotificacaoProducerMessage;

@Service
public abstract class BaseSuporteServiceImpl<E extends DomainEntity, R extends BaseRepository<E, ID>, ID> extends BaseServiceImpl<E, R, ID> {

	@Autowired
	private NotificacaoProducerMessage notificacaoProducerMessage;

	@Autowired
	private AuditoriaProducerMessage auditoriaProducerMessage;

	/**
	 * @param entidade
	 * @return
	 * @throws BusinessException
	 */
	public E save(E entidade) throws BusinessException {
		final E entidadeSalva = super.save(entidade);
		String operacao = new Object() { }.getClass().getEnclosingMethod().getName();
		this.auditarNotificar(operacao.toUpperCase(), entidadeSalva);

		return entidadeSalva;
	}

	private void auditarNotificar(String operacao, E entidade) {
		AuditoriaVO auditoriaVO = this.createAuditVO(operacao, entidade);
		auditoriaProducerMessage.sendMessage(auditoriaVO);
		notificacaoProducerMessage.sendMessage(auditoriaVO);
	}

	/**
	 * @param entidade
	 * @throws Exception
	 */
	public E update(E entidade) throws BusinessException {
		final E entidadeAtualizada = super.save(entidade);
		String operacao = new Object() { }.getClass().getEnclosingMethod().getName();
		this.auditarNotificar(operacao.toUpperCase(), entidadeAtualizada);
		
		return entidadeAtualizada;
	}

	/**
	 * @see br.com.siriussoftware.sgo.base.service.BaseService#excluir(java.io.Serializable)
	 */
	public void delete(ID id) throws BusinessException, ExclusionNotPermitedException {
		E entidade = this.findById(id);
		super.delete(id);
		String operacao = new Object() { }.getClass().getEnclosingMethod().getName();
		this.auditarNotificar(operacao.toUpperCase(), entidade);
	}

	/**
	 * @param operacao
	 * @param entidade
	 */
	private AuditoriaVO createAuditVO(String operacao, E entidade) {
		AuditoriaVO vo = new AuditoriaVO();
		vo.setData(Calendar.getInstance());
		vo.setEntidade(entidade.getClass().getSimpleName());
		vo.setId(entidade.getId());
		vo.setOperacao(operacao);
		vo.setInformacao(entidade.toJson());

		return vo;
	}

}
