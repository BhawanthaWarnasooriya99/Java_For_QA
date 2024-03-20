package com.test;

public class WhileLoop {

	public static void main(String[] args) {

		int myArray[] = {1, 2, 4, 5, 2, 7, 4, 1, 9, 5};

		System.out.println("Array Length " +myArray.length);
		
		int index = 0;

		while(index < myArray.length) {
			
			System.out.println(index + " Value of the element : " +myArray[index]);

			index = index + 1;

		}
	}
}
