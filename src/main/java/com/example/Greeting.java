package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Greeting {
	
	
	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return "Hello";
		
	}
	
	@RequestMapping("/warning")
	public @ResponseBody String warning() {
		return "This is a warning!";
	}

}
