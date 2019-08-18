package com.saein.URL_Shortening.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.saein.URL_Shortening.dao.UrlRepository;
import com.saein.URL_Shortening.service.Base62;
import com.saein.URL_Shortening.vo.Url;

@Controller
public class MainController {
	
	@Autowired
	UrlRepository urlRepository;
	
	@GetMapping
	public String main(ModelMap modelMap) {
		modelMap.addAttribute("vo", new Url());
		return "hello";
	}
	
	@PostMapping
	public String createUrl(ModelMap modelMap, Url url) {
		if(urlRepository.findByOriginUrl(url.getOriginUrl()) == null) {
			urlRepository.save(url);
		}
		
		url = urlRepository.findByOriginUrl(url.getOriginUrl());
		int key = url.getKey();
	 	url.setShortUrl("http://localhost/" + Base62.encode(key));
	 	modelMap.addAttribute("vo", url);
	 	return "hello";
	}
	
	@GetMapping("/{shortUrl}")
	public RedirectView  move(@PathVariable("shortUrl") String path) throws Exception {
		RedirectView redirectView = new RedirectView();
		
		Integer key = Base62.decoding(path);
		Optional<Url> urlO = urlRepository.findById(key);
		if (urlO.isPresent()) {
			Url url = urlO.get();
			redirectView.setUrl(url.getOriginUrl());
			return redirectView;
		} else {
			throw new Exception("매칭되는 url이 없습니다.");
		}
	}
}
