package br.com.siriussoftware.suporte.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SiriusSuporteAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiriusSuporteAdminApplication.class, args);
	}

}
