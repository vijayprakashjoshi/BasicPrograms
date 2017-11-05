package com.vj.programs.basics;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		
		int randomNumber=132232231;
		int n=randomNumber;
		int sum = 0;
		
		while(n>0) {
			
			int r = n % 10;
			sum = sum*10 + r;
			n /= 10;
			
		}
		
		if (sum == randomNumber) {
			System.out.println("Number: "+randomNumber+" is Palindrome !!");
		} else {
			System.out.println("Number: "+randomNumber+" is not Palindrome !!");
		}
		
	}

}
