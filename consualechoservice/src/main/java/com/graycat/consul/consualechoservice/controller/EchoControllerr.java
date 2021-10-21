package com.graycat.consul.consualechoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoControllerr {
	
	@GetMapping("/echo")
	public String echo() {
		return "<h2>This is echo service from Consul</h2>";
	}
}
