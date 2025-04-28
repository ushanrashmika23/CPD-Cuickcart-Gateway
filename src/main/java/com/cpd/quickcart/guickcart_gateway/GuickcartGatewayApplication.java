package com.cpd.quickcart.guickcart_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GuickcartGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuickcartGatewayApplication.class, args);
	}

}
