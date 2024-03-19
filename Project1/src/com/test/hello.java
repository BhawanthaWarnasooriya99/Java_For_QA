package com.test;

public class hello {

	public static void main(String[] args) {

		System.out.println("Hello pasindu");
		addVariablesAndPrint(5,10);
		addVariablesAndPrint(6,10);
		printName("warnasooriya");
	}
	
	//a = 10
	//b = 5
	//I need a method to add two variables and print it
	
	public static void addVariablesAndPrint(int a, int b) {
		
		int tot = a + b;
		
		System.out.println("tot = " +tot);
	}
	
	public static void printName(String name) {
		System.out.println(name);
	}
	
}