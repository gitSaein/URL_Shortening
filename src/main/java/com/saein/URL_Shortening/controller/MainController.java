package com.saein.URL_Shortening.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping("/hello")
	public String hello(Model model) {	
		model.addAttribute("appName", appName);
		return "hello";
	}

}
