package com.holly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
