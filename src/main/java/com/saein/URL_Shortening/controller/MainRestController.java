package com.saein.URL_Shortening.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saein.URL_Shortening.vo.Url;
import com.saein.URL_Shortening.vo.Url2;

@RestController
public class MainRestController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		return "hello";
	}
	
	@PostMapping("/create")
	public Url2 createUrl(@ModelAttribute(value="url") Url2 url, BindingResult result, Model model) {
		System.out.println("create");
		return url;
	}

}
