package com.springboot.LearnRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.controllers","com.student"})
@EntityScan(basePackages = { "com.student" })
@EnableJpaRepositories(basePackages = { "com.student" })
public class LearnRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnRestApplication.class, args);
	}

}
