package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmCustomerServiceApplication.class, args);
	}

}
