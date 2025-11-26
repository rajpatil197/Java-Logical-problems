package com.raj.decisionMaking;

import java.util.Scanner;

public class Absoulte {

	public static void main(String args[]) {
		
				System.out.println("ENter a Number");
				Scanner sc = new Scanner(System.in);
		        int num = sc.nextInt();

		        int absValue = 0 ;
		        if (num < 0) {
		            absValue = -num;  
		        } else {
		            absValue = num;  
		        }

		        System.out.println("Absolute value: " + absValue);

	}
}
