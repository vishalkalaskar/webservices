package com.example.ms2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billling-Service")
public interface IBillingServiceRestController 
{
	@GetMapping("/billing/api/info")
	public String fetchBillDetails();

}
