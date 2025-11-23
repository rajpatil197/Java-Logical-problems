package com.raj.decisionMaking;

import java.util.Scanner;

public class Positive_Or_Negative {

	public static void main(String[] args) {
		System.out.println("Enter A Number ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if(num1 > 0) {
			System.out.println("Number Is positive");
		}else if(num1 < 0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is Zero");
		}
	}

}
