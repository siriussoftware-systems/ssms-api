package br.com.siriussoftware.oauthserver.infra.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.siriussoftware.oauthserver.domain.User;

@Component
@FeignClient(name = "sirius-authentication-server", url = "http://localhost:8000/api/authentication/user")
public interface UserFeignClient {

	@GetMapping(value = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);	
}
