package com.lcg.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	public HomeController() {
		
	}
	
	//@RequestMapping(value = "/shadow-monsters", method = RequestMethod.GET)
	@GetMapping("/shadow-monsters")
	public String showHomePage(){		
		return "home";
	}
	
	//@RequestMapping(value = "/userAunthentication", method = RequestMethod.POST)
	@PostMapping("/userAunthentication")
	public String userAunthentication(@RequestParam("user") String user,@RequestParam("pass") String pass){
		System.out.println("User : " +user + " Pass : " +pass);
		RestTemplate restTemplate =new RestTemplate();
		//String isValidUser = restTemplate.getForObject("http://localhost:8080/user-login-service/userLogin/"+user+"/"+pass, String.class);	
		String isValidUser = restTemplate.getForObject("http://localhost:8081/userLogin/"+user+"/"+pass, String.class);
		System.out.println("isValidUser :" +isValidUser);
		if(isValidUser.equals("1"))
			return "userDashboard";
		if(isValidUser.equals("2"))
			return "researcherDashboard";
		else
			return "userRegister";
	}

	
	@PostMapping("/userRegistration")
	public String userRegistration(){		
		return "userRegistration";
	}
	
	@GetMapping(value = "/chat")
    public String chat() {
		return "chat";
    }
	
	/*@GetMapping("/snsnotification")
	public String sendMessage(){
		//AWS Authentication
		BasicAWSCredentials awsCreds = new BasicAWSCredentials("Access_Key","Secret_Access_Key");
		
		//Create SNS client
		
		
		return "sentMessage";
	}*/

}
