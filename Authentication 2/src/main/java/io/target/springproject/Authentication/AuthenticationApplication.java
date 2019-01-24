package io.target.springproject.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AuthenticationApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {
	 
	   @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(AuthenticationApplication.class);
	   }

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
		
		
	}
	 }
		

