package com.holly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean //connects to rest guest service
	public RestTemplate restTemplate1(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean //connect to soap room service
	public RestTemplate restTemplate2() {
		final String BASE_URL = "http://localhost:8081/soap-service"; //service port
		DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(BASE_URL);
		RestTemplate restTemplate2 = new RestTemplate();
		restTemplate2.setUriTemplateHandler(uriBuilderFactory);
		return restTemplate2;  
	}
}
