package com.email.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
@CrossOrigin(origins = "https://stellar-griffin-0e8b5f.netlify.app/")
public class EmailWriterApplication {

	@RequestMapping("/")
	public String home() {
		return "Dockerizing Spring Boot Application";
	}


	public static void main(String[] args) {
		SpringApplication.run(EmailWriterApplication.class, args);
	}

}
