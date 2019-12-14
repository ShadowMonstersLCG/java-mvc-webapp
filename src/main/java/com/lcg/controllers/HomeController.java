package com.lcg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

	public HomeController() {
		
	}
	
	@GetMapping("/shadow-monsters")
	public String showHomePage(){		
		return "home";
	}
	
	@PostMapping("/userAunthentication")
	public String userAunthentication(@RequestParam("user") String user,@RequestParam("pass") String pass){
		System.out.println("User : " +user + " Pass : " +pass);
		RestTemplate restTemplate =new RestTemplate();
		String isValidUser = restTemplate.getForObject("http://localhost:8081/userLogin/"+user+"/"+pass, String.class);		
		System.out.println("isValidUser :" +isValidUser);
		return "userDashboard";
	}
	
	@PostMapping("/userRegistration")
	public String userRegistration(){		
		return "userRegistration";
	}

}
