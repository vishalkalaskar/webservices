package com.example.ms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustController
{
	 @GetMapping("/display")
	 public String displayData()
	 {
		 return "(Customer) Custorme rInfo Will be Displayed here.. Welcome Call Center";
	 }

}
