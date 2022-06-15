package com.example.consumerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
		System.out.println("Hello world");
		System.out.println("ADDED THIS LINE IN GIT AND THEN WILL TRY TO PULL IT");
	}
	

}
