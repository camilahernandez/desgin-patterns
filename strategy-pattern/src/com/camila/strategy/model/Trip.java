package com.camila.strategy.model;

public class Trip {
	private Point start;
	private Point end;
	
	public Trip(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}
	public Point getStart() {
		return start;
	}
	public void setStart(Point start) {
		this.start = start;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	
	public Double getDistance() {
	return Math.pow(Math.pow(start.x-end.x, 2) + Math.pow(start.y-end.y, 2) , 0.5d);	
	}
	
	
}
