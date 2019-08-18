package com.saein.URL_Shortening.controller;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saein.URL_Shortening.vo.Url;

@RestController
public class MainRestController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		return "hello";
	}
	
	@PostMapping("/create")
	public Url createUrl(@ModelAttribute(value="url")@Valid Url url) {
		System.out.println("create");
		return url;
	}

}
