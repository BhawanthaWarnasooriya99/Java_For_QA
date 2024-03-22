package com.test2;

public class Main {

	private static String name = "Kamal";

	public static void main(String[] args) {

		Pencil pencil1 = new Pencil();
 
		System.out.println("Pencil one : " +pencil1.colorOfPencil);

		//=========================================================
		
		pencil1.colorOfPencil = "Green";
		
		System.out.println("Pencil one : " +pencil1.colorOfPencil);
		

		Pencil pencil2 = new Pencil();

		System.out.println("Pencil two : " +pencil2.colorOfPencil);
		
		Pencil pencil3 = new Pencil("Red");
		
		//pencil1.drow();
		
		pencil1.draw("Image of a bus");

	}

	public  void printName() {

		System.out.println("The name is : " +name);
	}
}
