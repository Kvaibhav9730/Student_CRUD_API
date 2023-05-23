package com.springboot.SpringStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.boot.controller")
@EnableJpaRepositories(basePackages = "com.example.repository")
@EntityScan(basePackages = {"com.example.entity"})
public class SpringStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentApplication.class, args);
	}

}
