package br.com.siriussoftware.zuulserver.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableResourceServer
public class ResourceServerConfig {
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//
////	@Autowired
////	private JwtTokenStore tokenStore;
////	
////	private static final String[] PUBLIC = { "/hr-oauth/oauth/token" };
////	
////	private static final String[] OPERATOR = { "/hr-worker/**" };
////	
////	private static final String[] ADMIN = { "/hr-payroll/**", "/hr-user/**", "/actuator/**", "/hr-worker/actuator/**", "/hr-oauth/actuator/**" };
////	
////	@Override
////	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
////		resources.tokenStore(tokenStore);
////	}
////
////	@Override
////	public void configure(HttpSecurity http) throws Exception {
////		
////		http.authorizeRequests()
////		.antMatchers(PUBLIC).permitAll()
////		.antMatchers(HttpMethod.GET, OPERATOR).hasAnyRole("OPERATOR", "ADMIN")
////		.antMatchers(ADMIN).hasRole("ADMIN")
////		.anyRequest().authenticated();
////		
////		http.cors().configurationSource(corsConfigurationSource());
////	}
////	
////	@Bean
////	public CorsConfigurationSource corsConfigurationSource() {
////		CorsConfiguration corsConfig = new CorsConfiguration();
////		corsConfig.setAllowedOrigins(Arrays.asList("*"));
////		corsConfig.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "PATCH"));
////		corsConfig.setAllowCredentials(true);
////		corsConfig.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));
////		
////		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////		source.registerCorsConfiguration("/**", corsConfig);
////		return source;
////	}
////	
////	@Bean
////	public FilterRegistrationBean<CorsFilter> corsFilter() {
////		FilterRegistrationBean<CorsFilter> bean 
////			= new FilterRegistrationBean<>(new CorsFilter(corsConfigurationSource()));
////		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
////		return bean;
////	}
//	
	

//	@Value("${security.oauth2.client.resource-ids}")
//    private String RESOURCE_ID;
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) {
//        resources.resourceId(RESOURCE_ID);
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.requestMatchers()
//                .antMatchers("/**")
//                .and()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/**").access("#oauth2.hasScope('read')")
//                .antMatchers(HttpMethod.OPTIONS, "/**").access("#oauth2.hasScope('read')")
//                .antMatchers(HttpMethod.POST, "/**").access("#oauth2.hasScope('write')")
//                .antMatchers(HttpMethod.PUT, "/**").access("#oauth2.hasScope('write')")
//                .antMatchers(HttpMethod.PATCH, "/**").access("#oauth2.hasScope('write')")
//                .antMatchers(HttpMethod.DELETE, "/**").access("#oauth2.hasScope('write')")
//                .anyRequest()
//                .authenticated();
//    }
}
