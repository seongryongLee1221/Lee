package com.home.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.service.elenService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/*")
public class elenController {

	@Autowired
	private elenService service;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/Login")
	public String Login() {
		return "Login";
	}

	@GetMapping("/Q&A") 
	public String QA(Model model){ 
		model.addAttribute("list", service.getList());
		return "Q&A";
	}
}