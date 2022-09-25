package com.sample.jenkinsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsspringbootApplication.class, args);
	}

	@GetMapping("welcome")
	public String showmessage() {
		return "Welcome to the test application";
	}

}
