package com.graycat.consul.consulmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulmicroserviceApplication.class, args);
	}
}
