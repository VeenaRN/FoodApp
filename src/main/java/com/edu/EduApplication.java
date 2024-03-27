package com.edu;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.edu.dao") 
public class EduApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduApplication.class, args);
		System.out.println("Working....");
	}

}
