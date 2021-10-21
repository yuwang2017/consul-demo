package com.graycat.consul.consulmicroservice.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	DiscoveryClient client;
	
	@GetMapping("/hello")
	public String hello() {
		
		URI service = client.getInstances("GREETING-SERVICE").stream()
				.map(si -> si.getUri()).findFirst().map(s -> s.resolve("/greeting")).get();
		System.out.println(service);
	
		return restTemplate.getForObject(service, String.class);
	}

	@GetMapping("/echo")
	public String echo() {
		
		URI service = client.getInstances("ECHO-SERVICE").stream()
				.map(si -> si.getUri()).findFirst().map(s -> s.resolve("/echo")).get();
		System.out.println(service);
	
		return restTemplate.getForObject(service, String.class);
	}
}
