package com.example.producerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.producerapp.prod.Producer;

@RestController
public class ProducerRestController {
	
	@Autowired
	private Producer producer;

	@GetMapping("/send")
	public String sendMessage(@RequestParam String message) {
		producer.send(message);
		return "sent successfully";
	}
}
