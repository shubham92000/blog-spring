package com.example.blog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "spring boot app for blog",
				description = "spring boot app for blog docs for crud",
				version = "v1.0",
				contact = @Contact(
						name = "Shubham",
						email = "shubham@gmail.com",
						url = "https//mysite.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https//mysite.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "spring boot blog app docs",
				url = "https://github.com/shubham92000/blog-spring"
		)
)
public class BlogApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

//			System.out.println("Beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
		};
	}

}
