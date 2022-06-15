package com.example.consumerapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumerapp.store.MessageStore;

@RestController
public class ConsumerRestController {
	
	@Autowired
	private MessageStore store;

	@GetMapping("/showAll")
	public String show() {
		return store.showData();
	}
}
