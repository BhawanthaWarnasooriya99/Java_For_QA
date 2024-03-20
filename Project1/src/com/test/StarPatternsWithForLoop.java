package com.test;

public class StarPatternsWithForLoop {

	public static void main(String[] args) {
		
		//**********
		//**********
		//**********
		//**********
		//**********
		
		
//		for(int r = 0; r < 5; r++) {
//			for(int c = 0; c < 10; c++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
//		**********
		
		
//		for(int r = 1; r <= 10; r++) {
//			for(int c = 0; c < r; c++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		******
//		*****
//		****
//		***
//		**
//		*
		
		
		
		for(int r = 1; r <= 7; r++) {
			for(int c = 0; c < r; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int rr = 7 - 1; rr >= 1; rr--) {
			for(int cc = 1; cc <= rr; cc++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
	}
}
