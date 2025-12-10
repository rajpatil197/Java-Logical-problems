package com.raj.forloop;

public class PrimeNumbers_1_to_100 {

	public static void main(String []args) {
		
		int count;
		
		for(int i=1;i<=100;i++) {
			for(count=2;count<=i;count++) {
				
				if(i%count==0) {
					break;
				}
				
			}
			if(i==count) {
				System.out.print(","+ i);
			}
		}
	}
}
