package com.camila.observer.interfaces;

public abstract class Topic {
	public abstract void notifySubscribers(String message);
	public abstract void addSubscriber(Observer observer);
}
