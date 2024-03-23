package com.test7;

public class Mother {

	private String hairColor;
	private String skinColor;
	private int height;
	
	public void speak() {
		System.out.println("Speak with mother voice");
		
		speakLoud("Bachi susan awasana mohotha mage");
	}
	
	public void speakLoud(String song) {
		System.out.println(song);
	}
	
	//method overloading
	public void speakLoud(String songType, int Length) {
		
	}
	
	public void walk() {
		System.out.println("Walk");
	}
	
	private void dance() {
		System.out.println("Dance");
	}
	
	
}
