//Abstraction

package com.test5;

public class MainFour {

	public static void main(String[] args) {
		
		Vehicle vehicleBus = new Bus();
		
//		vehicleBus.driveTheVehicle();
//		vehicleBus.breakTheVehicle();
			
		Vehicle vehicleCar = new Car();
		
//		vehicleCar.driveTheVehicle();
//		vehicleCar.breakTheVehicle();
		
		MainFour mainFour = new MainFour();
		
		mainFour.vehicleFunctionality(vehicleBus);
		mainFour.vehicleFunctionality(vehicleCar);
	}
	
	
	private void vehicleFunctionality(Vehicle vehicle)
	{
		vehicle.driveTheVehicle();
		vehicle.breakTheVehicle();
	}
	
}
