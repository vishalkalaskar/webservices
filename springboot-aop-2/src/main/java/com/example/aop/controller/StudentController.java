package com.example.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.model.StudentModel;
import com.example.aop.service.StudentService;

@RestController
public class StudentController 
{

	@Autowired
	private StudentService students;
	//http://localhost:8013/addStudent?fname=vinesh&lname=patil
	@GetMapping("/addStudent")
	public Object addstudenMethod(@RequestParam("fname") String fname,@RequestParam("lname") String lname)
	{
		
		return students.addStudent(fname, lname);
	}
	
	@GetMapping("/addS")
	public StudentModel addstudenM(@RequestParam("fname") String fname,@RequestParam("lname") String lname)
	{
		
		return students.addStudent(fname, lname);
	}
	
}
