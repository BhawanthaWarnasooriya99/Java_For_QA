package com.test4;

public class Car {

	private String color;
	private int numberOfSeats;
	private int engineCapacity;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	private void doSomething() {
		numberOfSeats = 4;
	}
	
}
