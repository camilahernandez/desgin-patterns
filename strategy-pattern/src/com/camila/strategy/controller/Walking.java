package com.camila.strategy.controller;

public class Walking extends TransportationImpl{

	public Walking(Integer speed, Integer maxDistance, Integer stopDuration) {
		super(speed, maxDistance, stopDuration);
	}

//	TODO
	public Integer caloriesBurnt() {
		return 0;
	}
	
}
