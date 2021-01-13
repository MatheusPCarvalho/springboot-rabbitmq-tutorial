package com.matheuscarvalho.springbootrabbitmq.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.matheuscarvalho.springbootrabbitmq.model.Person;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonSender {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Autowired
	private Queue personQueue;

	public void send(Person person) {
		this.rabbitTemplate.convertAndSend(this.personQueue.getName(), person);
	}
}
