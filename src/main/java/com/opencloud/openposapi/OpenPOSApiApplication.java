package com.opencloud.openposapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.opencloud.openposapi.services", "com.opencloud.openposapi.controllers"})
@EnableJpaRepositories(basePackages = {"com.opencloud.openposapi.repositories"})
@EntityScan(basePackages = {"com.opencloud.openposapi.entities"})
public class OpenPOSApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenPOSApiApplication.class, args);
	}
}
