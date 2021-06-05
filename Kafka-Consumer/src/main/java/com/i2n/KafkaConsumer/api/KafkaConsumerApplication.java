package com.i2n.KafkaConsumer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaConsumerApplication {

	List<String> messages = new ArrayList<String>();

	User userFromTopic = null;

	@GetMapping("/consumeStringMessage")
	public List<String> consumeMessage() {
		return messages;
	}

	@GetMapping("/consumeJsonMessage")
	public List<String> consumeJsonMessage() {
		return messages;
	}

	@KafkaListener(groupId = "i2nkafka-1", topics = "i2nkafka", containerFactory = "kafkaListenerContainerFactory")
	public List<String> getMsgFromTopic(String data) {
		messages.add(data);
		return messages;

	}

	@KafkaListener(groupId = "i2nkafka-2", topics = "i2nkafka", containerFactory = "userKafkaListenerContainerFactory")
	public User getJsonFromTopic(User user) {
		userFromTopic = user;
		return userFromTopic;

	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
