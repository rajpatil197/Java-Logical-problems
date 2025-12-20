package com.raj.forloop;

import java.util.Scanner;

public class Lcm_Two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        int max = (a > b) ? a : b;

	      
	        for (int i = max; ; i++) {
	            if (i % a == 0 && i % b == 0) {
	                System.out.println("LCM = " + i);
	                break;
	            }
	}
	}
}

