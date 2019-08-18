package com.saein.URL_Shortening.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.saein.URL_Shortening.vo.Url;
/**
 * @author saein
 *
 */
@Controller
public class MainController {
	
	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("url", new Url());
		return "hello";
	}
}
