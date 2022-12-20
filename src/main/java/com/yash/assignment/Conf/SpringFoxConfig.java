package com.yash.assignment.Conf;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Swagger API configuration for documentation
@Configuration
@EnableSwagger2
public class SpringFoxConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
	}
	//API metadata
	private ApiInfo apiDetails() {
	    return new ApiInfo(
	      "NatwestGameAssignment Microservice Api", 
	      "Rock Paper Scissors game microservice as an assignment for internship at Natwest", 
	      "v 1.0.0", 
	      "Free to use", 
	      new Contact("Yash Chandrani", "https://github.com/Yash-Chandrani", "yashbeskkc@gmail.com"), 
	      "License of API", "None", Collections.emptyList());
	}
	
}


