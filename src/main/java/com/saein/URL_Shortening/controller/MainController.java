package com.saein.URL_Shortening.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author saein
 *
 */
@Controller
public class MainController {
	
	@GetMapping("/")
	public String hello(Model model) {
		return "hello";
	}
}
