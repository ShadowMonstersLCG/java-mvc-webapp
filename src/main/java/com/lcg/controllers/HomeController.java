package com.lcg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/shadow-monsters")
	public String showHomePage(){
		System.out.println("In home page");
		return "home";
	}

}
