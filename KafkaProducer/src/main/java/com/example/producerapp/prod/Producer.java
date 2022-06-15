package com.example.producerapp.prod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> template;		
	
	@Value("${kafka-topic-name}")
	private String topicName;
	
	public void send(String message) {
		for(int i=1;i<100000;i++)
			template.send(topicName,message+":"+i);
	}
}
