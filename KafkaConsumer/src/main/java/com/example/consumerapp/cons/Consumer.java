package com.example.consumerapp.cons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.consumerapp.store.MessageStore;

@Component
public class Consumer {
	
	@Autowired
	private MessageStore store;

	@KafkaListener(topics = "${kafka-topic-name}",groupId="13116414")
	public void addData(String mess) {
		store.addMessages(mess);
		System.out.println("In console :-"+mess);
	}
}
