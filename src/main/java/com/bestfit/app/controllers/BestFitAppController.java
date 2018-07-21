package com.bestfit.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BestFitAppController {
	
	@RequestMapping("/")
	public String LandingPage(HttpServletRequest request) {		
		return "index";
	}
	
	

}
