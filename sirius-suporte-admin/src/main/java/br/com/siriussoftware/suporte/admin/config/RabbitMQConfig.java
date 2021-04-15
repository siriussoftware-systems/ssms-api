package br.com.siriussoftware.suporte.admin.config;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Value("${sirius-notificacao.rabbitmq.exchange}")
	String exchange;

	@Value("${spring.rabbitmq.host}")
	String hostRabbit;

	@Bean
	public Exchange delcareExchange() {
		return ExchangeBuilder.topicExchange(exchange).durable(true).build();
	}

	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

}
