package com.raj.decisionMaking;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		System.out.println("Enter A Number ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("Number Is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}

}
