package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRestTemplateApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringRestTemplateApplication.class, args);
	
		}
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
