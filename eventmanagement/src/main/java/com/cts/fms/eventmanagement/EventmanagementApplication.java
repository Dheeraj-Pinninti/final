package com.cts.fms.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
/**This Project
 * To launch a Spring Boot Application
 * 
 * 
 * 
 */

@SpringBootApplication

public class EventmanagementApplication {
/**
 * Main Method Driver Class
 * @param args
 */
	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApplication.class, args);
	}

}
