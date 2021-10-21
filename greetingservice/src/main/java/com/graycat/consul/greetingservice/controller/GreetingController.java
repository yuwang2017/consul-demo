package com.graycat.consul.greetingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/greeting")
	public String greeting() {
		return "<h2>Hello! This is greeting service with Consul</h2>";
	}
}
