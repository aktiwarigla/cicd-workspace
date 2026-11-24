package com.example.demo.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping
	public String home() {
		return "welcome to wipro wcf programe";
	}
	
	@GetMapping("/payload")
	public ResponseEntity<String> receiveJson(@RequestParam Map<String, Object> payload) {
		// Request Body: {"userId": 101, "active": true}
	    return ResponseEntity.ok("Received keys: " + payload);
	}


}
