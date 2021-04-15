package br.com.siriussoftware.authentication.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Profile({ "!prod" })
public class SwaggerConfig extends WebMvcConfigurationSupport {

	@Value("${server.servlet.context-path}")
	private String contextPath;

	private static final String TITLE = "AUTHENTICATION";

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
			.host("")
			.pathMapping(contextPath)
			.select()
			.apis(RequestHandlerSelectors.basePackage("br.com.siriussoftware"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(buildApiInfo());
	}

	private ApiInfo buildApiInfo() {
		String empresa = "Sirius Software Ltda";
		String url = "https://www.siriussoftware.com.br";
		String email = "jossemar.avila@siriussoftware.com.br";
		Contact contact = new Contact(empresa, url, email);

		return new ApiInfoBuilder()
			.title(SwaggerConfig.TITLE + " Rest API")
			.description("REST API para " + SwaggerConfig.TITLE + " Services")
			.contact(contact)
			.version("1.0.0")
			.license("SaaS License Agreement")
			.licenseUrl("https://www.siriussoftware.com.br/licenca.html")
			.termsOfServiceUrl("https://www.siriussoftware.com.br/termosDeUso.html")
			.build();
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

}