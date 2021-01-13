package com.matheuscarvalho.springbootrabbitmq.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.matheuscarvalho.springbootrabbitmq.model.Person;

@Component
public class PersonListener {

	@RabbitListener(queues = { "${queue.person.name}" })
	public void receive(@Payload Person person) {
		System.out.println(person);
	}
}
