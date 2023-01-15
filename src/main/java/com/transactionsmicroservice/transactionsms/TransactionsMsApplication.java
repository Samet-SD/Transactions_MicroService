package com.transactionsmicroservice.transactionsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class TransactionsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionsMsApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/transactions").allowedOrigins("http://localhost:8081",
						"http://localhost:8080","http://localhost:8083","https://d11vf7coyovn62.cloudfront.net/");
			}
		};

	}

}

//Origins of Frontend Port is 8080