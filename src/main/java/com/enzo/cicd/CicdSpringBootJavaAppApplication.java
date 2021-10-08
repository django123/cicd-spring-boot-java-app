package com.enzo.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdSpringBootJavaAppApplication {
	
	@GetMapping("/")
	public String home() {
		
		return " hello world from enzo kenza !";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdSpringBootJavaAppApplication.class, args);
	}

}
