package br.com.siriussoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SiriusOauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiriusOauthServerApplication.class, args);
	}
}