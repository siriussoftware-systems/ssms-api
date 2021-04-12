/*
 * Copyright (c) 2003, 2019, Sirius Software Ltda and/or its affiliates. All rights reserved.
 * SIRIUS SOFTWARE LTDA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.siriussoftware.notification.infra.repository.notificacao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.library.notification.domain.enumeration.SituacaoNotificacaoEnum;
import br.com.siriussoftware.notification.domain.notificacao.Notificacao;

@Repository
public interface NotificacaoRepository extends BaseRepository<Notificacao, String> {

	List<Notificacao> findBySituacaoNotificacao(SituacaoNotificacaoEnum situacao);

	@Query("select n from Notificacao n where n.destinatario = ?1 order by n.dataEnvio desc ")
	List<Notificacao> findByDestinatario(String destinatarioId);

}
