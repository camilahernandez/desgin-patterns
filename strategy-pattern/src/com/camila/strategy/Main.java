package com.camila.strategy;


import com.camila.strategy.controller.Driving;
import com.camila.strategy.controller.Travel;
import com.camila.strategy.controller.Walking;
import com.camila.strategy.model.Point;
import com.camila.strategy.model.Trip;

public class Main {

	public static void main(String[] args) {
		Trip toHome = new Trip(new Point(2,3),new Point(100,200));
		
		Travel travel = new Travel(toHome);
		
		Double byFoot = travel.calculteDuration(new Walking(10,5,20));
		Double takingMyCar = travel.calculteDuration(new Driving(50,100,10));
		
		System.out.println("The time you'll take walking is " + byFoot);
		System.out.println("The time you'll take using the car is " + takingMyCar);
	}

}
