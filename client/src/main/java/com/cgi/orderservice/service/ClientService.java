package com.cgi.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {
	
	// 
	@Autowired
	private RestTemplate restTemplate;
	
	public String callOtherService() {
		String url = "http://order-service/order";
		return restTemplate.getForObject(url, String.class);
	}

}
