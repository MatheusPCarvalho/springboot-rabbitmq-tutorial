package com.matheuscarvalho.springbootrabbitmq.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {
	
	String name;

	String lastName;

	String email;

	Integer age;
}
