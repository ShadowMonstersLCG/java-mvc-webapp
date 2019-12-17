package com.lcg.javamvcwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

import com.sun.glass.ui.Application;

@SpringBootApplication
@ComponentScan("com.*")
public class JavaMvcWebappApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
	    //System.setProperty("server.servlet.context-path", "/java-mvc-webapp");
		SpringApplication.run(JavaMvcWebappApplication.class, args);
	}

}
