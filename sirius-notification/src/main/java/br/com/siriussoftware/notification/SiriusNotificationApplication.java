package br.com.siriussoftware.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SiriusNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiriusNotificationApplication.class, args);
	}

}
