package com.test;

public class Hello {

	public static void main(String[] args) {

		System.out.println("Hello pasindu");
		addVariablesAndPrint(5,10);
		addVariablesAndPrint(6,10);
		printName("warnasooriya");
		decimalDemo();
		addOperation(30, 25);
		substarctOperation(50, 15);
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
	
	public static void decimalDemo() {
		double a = 133;
		
		double b = a/2;
		
		System.out.println(b);
	}
	
	public static void addOperation(int num1, int num2) {
		int tot = num1 + num2;
		
		System.out.println("total = " +tot);
	}
	
	public static void substarctOperation(int num1, int num2) {
		int tot = num1 - num2;
		System.out.println("total = " +tot);
	}
	
}