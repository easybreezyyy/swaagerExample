package com.glk.swgr.config;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	  @Bean
	  public Docket Sample1Api(ServletContext servletContext) {
		  return new Docket(DocumentationType.SWAGGER_2)
			                .consumes(getConsumeContentTypes())
			                .produces(getProduceContentTypes())
			                .apiInfo(swaggerInfo("Sample1"))
			                .groupName("Sample1 Project")
			                .select()
			                .apis(RequestHandlerSelectors.basePackage("com.glk.swgr.sample1.controller"))
			                .paths(PathSelectors.ant("/**"))
			                .build()
			                .useDefaultResponseMessages(false);
	  }
	  
	  @Bean
	  public Docket Sample2Api(ServletContext servletContext) {
		  return new Docket(DocumentationType.SWAGGER_2)
				  .consumes(getConsumeContentTypes())
				  .produces(getProduceContentTypes())
				  .apiInfo(swaggerInfo("Sample2"))
				  .groupName("Sample2 Project")
				  .select()
				  .apis(RequestHandlerSelectors.basePackage("com.glk.swgr.sample2.controller"))
				  .paths(PathSelectors.ant("/**"))
				  .build()
				  .useDefaultResponseMessages(false);
	  }


	  private Set<String> getConsumeContentTypes() {
	      Set<String> consumes = new HashSet<>();
	      consumes.add("application/json;charset=UTF-8");
	      consumes.add("application/x-www-form-urlencoded");
	      return consumes;
	  }

	  private Set<String> getProduceContentTypes() {
	      Set<String> produces = new HashSet<>();
	      produces.add("application/json;charset=UTF-8");
	      return produces;
	  }

	  private ApiInfo swaggerInfo(String groupName) {
	    return new ApiInfoBuilder().title(groupName + " API Documentation")
	                .description(groupName + " description")
	                .version("1.0")
	                .build();
	  }
}
