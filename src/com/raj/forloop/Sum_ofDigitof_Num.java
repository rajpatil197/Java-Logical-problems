package com.raj.forloop;

import java.util.Scanner;

public class Sum_ofDigitof_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter A number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum=0;
		
		while(num >0) {
			int rem=num%10;
			sum = rem+sum;
			num = num/10;
		}
		System.out.println("Sum Of Digit is :"+ sum);
		
	}

}
