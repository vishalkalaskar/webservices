package com.example.ms2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeOperationController {
	
	@Value("${dbuser}")
	private String user;
	
	@Value("${dbpwd}")
	private String pwd;
	
	@GetMapping("/show")
	public String show()
	{
		return "Data collected through config Server ::"+user+"------"+pwd;
	}

}
