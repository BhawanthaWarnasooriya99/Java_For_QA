package com.test2;

public class Pencil {
	
	protected static String colorOfPencil = "Black";
	
	
	private boolean isPencilHasAnErracer = false; //true - yes, false - no
	private String bodyColor = "Yellow";
	

	public void drow() {
		System.out.println("Draw");
		
		draw("Image of a dog");
	}
	
	public void write() {
		System.out.println("Write");
	}
	
	//constructor
	public Pencil() {
		System.out.println("I am the constructor");
	}
	
	public Pencil(String color) {
		System.out.println("I am the constructor. The color is: " +color);
		System.out.println(bodyColor);
	}
	
	void draw(String image) {
		System.out.println(image);
	}
}
