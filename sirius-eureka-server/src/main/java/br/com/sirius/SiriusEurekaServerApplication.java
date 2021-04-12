package br.com.sirius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SiriusEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiriusEurekaServerApplication.class, args);
	}
}