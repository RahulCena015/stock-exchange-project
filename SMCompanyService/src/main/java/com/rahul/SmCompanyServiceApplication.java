package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmCompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmCompanyServiceApplication.class, args);
	}

}
