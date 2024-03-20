package com.test;

public class ForLoop {

	public static void main(String[] args) {
		
		int myArray[] = {1, 2, 4, 5, 2, 7, 4, 1, 9, 5, 1, 2, 4, 5, 2, 7, 1, 4};
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(i + " Value of the element : " + myArray[i]);
		}
	}
}
