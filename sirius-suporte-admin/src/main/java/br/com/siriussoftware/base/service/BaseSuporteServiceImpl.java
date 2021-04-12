/*
 * Copyright (c) 2003, 2019, Sirius Software Ltda and/or its affiliates. All rights reserved.
 * SIRIUS SOFTWARE LTDA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.siriussoftware.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.siriussoftware.library.base.domain.DomainEntity;
import br.com.siriussoftware.library.base.domain.SistemaEnum;
import br.com.siriussoftware.library.base.domain.SituacaoEntidadeEnum;
import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.library.base.service.BaseServiceImpl;
import br.com.siriussoftware.library.base.service.BusinessException;
import br.com.siriussoftware.library.base.service.ExclusionNotPermitedException;
import br.com.siriussoftware.library.notification.domain.enumeration.OrigemNotificacaoEnum;
import br.com.siriussoftware.library.notification.domain.enumeration.TipoNotificacaoEnum;
import br.com.siriussoftware.library.notification.ui.model.EmpresaVO;
import br.com.siriussoftware.library.notification.ui.model.NotificacaoVO;
import br.com.siriussoftware.suporte.admin.infra.message.NotificacaoProducerMessage;

@Service
public abstract class BaseSuporteServiceImpl<E extends DomainEntity, R extends BaseRepository<E, ID>, ID>
		extends BaseServiceImpl<E, R, ID> {

	@Autowired
	private NotificacaoProducerMessage notificacaoProducerMessage;

	/**
	 * @param entidade
	 * @return
	 * @throws BusinessException
	 */
	public E save(E entidade) throws BusinessException {
		final E entidadeSalva = super.save(entidade);
		this.sendNotification("CREATE", entidade);
		return entidadeSalva;
	}

	/**
	 * @param entidade
	 * @throws Exception
	 */
	public void update(E entidade) throws BusinessException {
		super.save(entidade);
		this.sendNotification("UPDATE", entidade);
	}

	/**
	 * @see br.com.siriussoftware.sgo.base.service.BaseService#excluir(java.io.Serializable)
	 */
	public void delete(ID id) throws BusinessException, ExclusionNotPermitedException {
		E entidade = this.findById(id);
		super.delete(id);
		this.sendNotification("DELETE", entidade);
	}

	/**
	 * @param operacao
	 * @param entidade
	 */
	private void sendNotification(String operacao, E entidade) {
		EmpresaVO empresaVo = new EmpresaVO();
		empresaVo.setId("1");
		empresaVo.setRazaoSocial("Renovias");
		empresaVo.setSituacao(SituacaoEntidadeEnum.ATIVO);

		NotificacaoVO vo = new NotificacaoVO();
		vo.setContaUsuario("jossemar");
		vo.setDestinatario("jossemaravilamorais@gmail.com");
		vo.setEmpresa(empresaVo);
		vo.setMensagem(operacao + " [" + entidade.toJson() + "]");
		vo.setNome("CREATE entidade");
		vo.setOrigemNotificacao(OrigemNotificacaoEnum.SUPORTE);
		vo.setSistema(SistemaEnum.SGO);
		vo.setSituacao(SituacaoEntidadeEnum.ATIVO);
		vo.setTipoNotificacao(TipoNotificacaoEnum.EMAIL);

		notificacaoProducerMessage.sendMessage(vo);
	}
}
