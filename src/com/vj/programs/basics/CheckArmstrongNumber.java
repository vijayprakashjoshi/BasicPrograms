package com.vj.programs.basics;

public class CheckArmstrongNumber {
	
	public static void main(String[] args) {
		
		int number = 22;
		int n=number;
		int sum = 0;
		
		while(n>0) {
		
			int r = n % 10;
			sum += Math.pow(r,3) ;
			n = n/10;
		}
		
		if (sum == number) {
			System.out.println("Number: "+number+" is Armstong Number");
			
		} else {
			System.out.println("Number: "+number+" is not an Armstong Number");
			
		}
		
	}

}
