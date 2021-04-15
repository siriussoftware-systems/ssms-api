package br.com.siriussoftware.notification.infra.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.siriussoftware.library.base.service.exception.BusinessException;
import br.com.siriussoftware.library.notification.ui.model.NotificacaoVO;
import br.com.siriussoftware.notification.domain.notificacao.Notificacao;
import br.com.siriussoftware.notification.service.notificacao.NotificacaoService;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class NotificacaoReceiverMessage {

	@Autowired
	private NotificacaoService notificacaoService;

	@Autowired
	private NotificacaoFalhaProducerMessage notificacaoFalhaProducerMessage;

	@RabbitListener(queues = { "${sirius-notificacao.rabbitmq.queue}" })
	public void receiveMessage(@Payload NotificacaoVO notificacaoVO) {
		try {
			notificacaoService.save((Notificacao) notificacaoVO.toEntity(Notificacao.class));
		} catch (BusinessException e) {
			notificacaoFalhaProducerMessage.sendMessage(notificacaoVO);
			log.error(e.getMessage(), e);
		}
	}

}