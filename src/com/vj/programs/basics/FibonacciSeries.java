package com.vj.programs.basics;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int i=0;
		int j=1;
		int counter=0;
		int totalNumbers=10;
		
		do {
			if(counter==0) {
				System.out.print(i);
			} else {
				int temp=i;
				i=i+j;
				j=temp;
				System.out.print(", "+i);
			}
			counter++;
			
		} while(counter < totalNumbers);
		
		
		
	}
	
	
}
