package com.camila.strategy.controller;

public class TransportationImpl implements ITransportation{
	
	protected Integer speed;
	protected Integer maxDistance;
	protected Integer stopDuration;

	public TransportationImpl(Integer speed, Integer maxDistance, Integer stopDuration) {
		super();
		this.speed = speed;
		this.maxDistance = maxDistance;
		this.stopDuration = stopDuration;
	}

	@Override
	public Double calculateDuration(Double distance) {
		Double duration = distance*speed;
		if(distance <= maxDistance ) {
			return distance*speed;
		}else {
			Integer stopCount = (int) Math.floor(distance/maxDistance) ;
			Double restDistance = distance - (stopCount*maxDistance);
			return duration*stopCount + stopCount*maxDistance  + restDistance*speed;
		}
		
	}

}
