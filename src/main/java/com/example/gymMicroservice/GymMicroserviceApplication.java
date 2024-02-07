package com.example.gymMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymMicroserviceApplication.class, args);
		System.out.println("Gym Microservice");
	}

}
