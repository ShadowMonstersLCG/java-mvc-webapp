package com.lcg.javamvcwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan("com.*")
public class JavaMvcWebappApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(JavaMvcWebappApplication.class, args);
	}

}
