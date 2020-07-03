package com.camila.strategy.controller;


import com.camila.strategy.model.Trip;

public class Travel {
	Trip trip;
	
	public Travel(Trip trip) {
		super();
		this.trip = trip;
	}
	
	public Double calculteDuration(ITransportation tranportationStrategy) {
		return tranportationStrategy.calculateDuration(trip.getDistance());
	}
	
}
