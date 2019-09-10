package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/*")
public class elenController {

	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/Login")
	public String Login() {
		return "Login";
	}
	@GetMapping("/Q&A")
	public String QA() {
		return "Q&A";
	}


}