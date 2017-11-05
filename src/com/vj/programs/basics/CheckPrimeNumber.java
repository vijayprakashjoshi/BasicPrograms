package com.vj.programs.basics;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		int randomNumber=1218934259;
		int divisibleBy=2;
		boolean isPrime=true;
		
		if (randomNumber%divisibleBy == 0) { 
			isPrime=false;
		} else {
			divisibleBy=3;
			do {
				
				if (randomNumber%divisibleBy == 0) { 
					isPrime=false;
					break;
				}
				divisibleBy += 2;
				
			} while (divisibleBy < randomNumber/2);
		}
		
		if (isPrime) {
			System.out.println("Number: "+randomNumber+" is Prime !!"); 
		} else {
			System.out.println("Number: "+randomNumber+" is not Prime !!");
		}
		
	}
}
