package com.camila.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.camila.observer.interfaces.Observer;
import com.camila.observer.interfaces.Topic;

public class AppointmentTopic extends Topic{

	List<Observer> appointmentsSubs;
	
	
	
	public AppointmentTopic() {
		super();
		appointmentsSubs = new ArrayList<Observer>();
	}

	
	public List<Observer> getAppointmentsSubs() {
		return appointmentsSubs;
	}

	public void setAppointmentsSubs(List<Observer> appointmentsSubs) {
		this.appointmentsSubs = appointmentsSubs;
	}


	@Override
	public void notifySubscribers(String message) {
		for(Observer o : appointmentsSubs) {
			o.update(message);
		}
		
	}


	@Override
	public void addSubscriber(Observer observer) {
		appointmentsSubs.add(observer);
		
	}

	

}
