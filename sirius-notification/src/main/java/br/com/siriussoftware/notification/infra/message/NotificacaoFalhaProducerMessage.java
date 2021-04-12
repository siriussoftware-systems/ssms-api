package br.com.siriussoftware.notification.infra.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.siriussoftware.library.notification.ui.model.NotificacaoVO;

@Component
public class NotificacaoFalhaProducerMessage {

	@Value("${sirius-notificacao-falha.rabbitmq.exchange}")
	String exchange;

	@Value("${sirius-notificacao-falha.rabbitmq.routingkey}")
	String routingkey;

	public final RabbitTemplate rabbitTemplate;

	@Autowired
	public NotificacaoFalhaProducerMessage(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendMessage(NotificacaoVO vo) {
		rabbitTemplate.convertAndSend(exchange, routingkey, vo);
	}

}