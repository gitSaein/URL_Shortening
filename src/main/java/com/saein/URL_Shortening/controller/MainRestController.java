package com.saein.URL_Shortening.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		return "hello";
	}

}
