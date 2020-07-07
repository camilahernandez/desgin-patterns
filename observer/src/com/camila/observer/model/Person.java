package com.camila.observer.model;

import com.camila.observer.interfaces.Topic;

public class Person {

	private String email;
	private Topic emailService;

	
	
	
	public Person() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
