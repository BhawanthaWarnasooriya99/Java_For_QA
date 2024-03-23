package com.test5;

public class Car implements Vehicle{

	@Override
	public void driveTheVehicle() {
		System.out.println("Drive Car");
		
	}

	@Override
	public void breakTheVehicle() {
		System.out.println("Break Car");
		
	}

}
