package com.example.ms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsondemoController
{
  @GetMapping("/demo")
  public String demomethod()
  {
	  return "successfully calling demo API	";
  }
}
