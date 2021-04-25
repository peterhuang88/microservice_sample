package com.example.sample_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer	// Enable eureka server
public class SampleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleMicroserviceApplication.class, args);
	}

}
