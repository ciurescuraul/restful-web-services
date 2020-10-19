package com.computaris.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * REpresentational State Transfer Web Services
 * Create a User - POST /users
 * Delete a User - DELETE /users/1
 * Get all User - GET /users
 * Get one User - GET /users/1
 */

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
