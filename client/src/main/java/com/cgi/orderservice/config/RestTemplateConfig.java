package com.cgi.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	//RestTemplate : we can use this as a rest client.
	// 

	@Bean
	// will provide singleton object.
	
	@LoadBalanced
	// to manage the LB. n a Spring Cloud environment, 
	//the @LoadBalanced annotation is used 
	//to enable client-side load balancing with Ribbon
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
