package br.com.siriussoftware.oauthserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

	@Value("${oauth.client.name}")
	private String clientName;

	@Value("${oauth.client.secret}")
	private String clientSecret;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private JwtAccessTokenConverter accessTokenConverter;

	@Autowired
	private JwtTokenStore tokenStore;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient(clientName).secret(passwordEncoder.encode(clientSecret)).scopes("read", "write")
				.authorizedGrantTypes("password").accessTokenValiditySeconds(86400);
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager).tokenStore(tokenStore)
				.accessTokenConverter(accessTokenConverter);
	}

//	
//	
//	private static PasswordEncoder encoder;
//
//	/** Injeta as propriedades definidas anteriormente no arquivo sirius-auth-server.yml **/
//	@Value("${security.oauth2.client.client-id}")
//	private String clientId;
//
//	@Value("${security.oauth2.client.authorized-grant-types}")
//	private String[] authorizedGrantTypes;
//
//	@Value("${security.oauth2.client.resource-ids}")
//	private String resourceIds;
//
//	@Value("${security.oauth2.client.scope}")
//	private String[] scopes;
//
//	@Value("${security.oauth2.client.client-secret}")
//	private String secret;
//
//	@Value("${security.oauth2.client.access-token-validity-seconds}")
//	private Integer accessTokenValiditySeconds;
//
//	@Autowired
//	DataSource dataSource;
//
//	@Autowired
//	@Qualifier("authenticationManagerBean")
//	private AuthenticationManager authenticationManager;
//
//	@Bean
//	public JdbcTokenStore tokenStore() {
//		return new JdbcTokenStore(dataSource);
//	}
//
//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//		// Define o gerenciador de autenticação do AuthorizationEndpoint
//		endpoints.authenticationManager(this.authenticationManager).tokenStore(tokenStore());
//	}
//
//	@Override
//	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//		// Registra um Client, segundo as configurações que definimos.
//		clients.jdbc(dataSource).withClient(clientId).authorizedGrantTypes(authorizedGrantTypes).authorities(EnumPerfil.names()).resourceIds(resourceIds).scopes(scopes).secret(secret)
//				.accessTokenValiditySeconds(accessTokenValiditySeconds);
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		if (encoder == null) {
//			encoder = new BCryptPasswordEncoder();
//		}
//		return encoder;
//	}
}