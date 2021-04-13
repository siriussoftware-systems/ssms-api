package br.com.siriussoftware.zuulserver.config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class JwtConfig {

//	@Value("${jwt.secret}")
//	private String jwtSecret;
//	
//	@Bean
//	public JwtAccessTokenConverter accessTokenConverter() {
//		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
//		tokenConverter.setSigningKey(jwtSecret);
//		return tokenConverter;
//	}
//	
//	@Bean
//	public JwtTokenStore tokenStore() {
//		return new JwtTokenStore(accessTokenConverter());
//	}
}
