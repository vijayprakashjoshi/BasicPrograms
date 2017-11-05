package com.vj.programs.basics;

public class Factorial {
	
	public static void main(String[] args) {
		
		int number = 6;
		int factorial = 1;
		for (int i=2; i<=number; i++) {
			factorial *= i; 
		}
		
		System.out.println("Factorial Of "+ number + " is: "+ factorial);
		
	}

}
