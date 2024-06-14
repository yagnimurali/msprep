package com.cgi.orderservice.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// to hold the code related to our end points 
@RequestMapping("/order")
public class OrderController {
	
	@GetMapping
	public ResponseEntity<?> getOrderDetails(){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("order1", "order 1 placed");
		map.put("order2", "order 2 placed");
		map.put("order3", "order 3 placed");
		
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}

}
