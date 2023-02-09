package com.example.ms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/welcome")
	public String weloome()
	{
		return "Welcome to the the MicroSerivces";
	}

}
