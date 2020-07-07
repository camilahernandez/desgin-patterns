package com.camila.observer.impl;

import com.camila.observer.interfaces.Observer;

public class EmailServices implements Observer{

	private String address;
	
	@Override
	public void update(String message) {
		System.out.println("Appointemt Confirmation Sent to:" + message);
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmailServices(String address) {
		super();
		this.address = address;
	}
	
	
}


