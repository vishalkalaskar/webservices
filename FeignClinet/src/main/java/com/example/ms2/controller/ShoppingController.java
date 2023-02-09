package com.example.ms2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms2.client.IBillingServiceRestController;

@RestController
@RequestMapping("/shoping/api")
public class ShoppingController
{

	@Autowired
	private IBillingServiceRestController consumer;
	
	@GetMapping("details")
	public String displayShoppingDetails()
	{
		System.out.println("shoppingController ::Client comp class name::"+consumer.getClass());
		return "diwali shopping for family.... "+consumer.fetchBillDetails();
		
	}
}
