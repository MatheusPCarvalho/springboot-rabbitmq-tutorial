package com.matheuscarvalho.springbootrabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheuscarvalho.springbootrabbitmq.model.Person;
import com.matheuscarvalho.springbootrabbitmq.queue.PersonSender;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping({ "person" })
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonController {

	@Autowired
	PersonSender personSender;

	@PostMapping
	public void register(@RequestBody Person person) {
		this.personSender.send(person);
	}
}
