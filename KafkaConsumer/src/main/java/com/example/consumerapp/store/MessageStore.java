package com.example.consumerapp.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {

	private List<String> data=new ArrayList<>();
	
	public void addMessages(String mess) {
		data.add(mess);
	}
	
	public String showData() {
		return "consumer message reading started :"+data.toString();
	}
}
