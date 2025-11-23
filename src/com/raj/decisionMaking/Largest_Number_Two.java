package com.raj.decisionMaking;

import java.util.Scanner;

public class Largest_Number_Two {

	public static void main(String[] args) {
		
		System.out.println("Enter Two Numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 +" "+ " "+ num2);
		
		if(num1>num2) {
			System.out.println("Largest Number :"+ num1);
		}
		else {
			System.out.println("Largest Number :"+ num2);
		}
	}

}
