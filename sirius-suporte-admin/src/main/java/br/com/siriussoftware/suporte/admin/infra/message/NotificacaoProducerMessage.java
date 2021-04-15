package br.com.siriussoftware.suporte.admin.infra.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.siriussoftware.library.notification.ui.model.AuditoriaVO;

@Component
public class NotificacaoProducerMessage {

	@Value("${sirius-notificacao.rabbitmq.exchange}")
	String exchange;

	@Value("${sirius-notificacao.rabbitmq.routingkey}")
	String routingkey;

	public final RabbitTemplate rabbitTemplate;

	@Autowired
	public NotificacaoProducerMessage(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendMessage(AuditoriaVO vo) {
		rabbitTemplate.convertAndSend(exchange, routingkey, vo);
	}

}