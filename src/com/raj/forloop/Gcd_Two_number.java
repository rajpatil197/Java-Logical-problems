package com.raj.forloop;

import java.util.Scanner;

public class Gcd_Two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Find GCD of Two Numbers");
		System.out.println("Enter a Number 1 :");
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		System.out.println("Enter a Number 2 :");
		int num2 = sc.nextInt();
		
		//Euclidean Algorithm
		// GCD (Greatest Common Divisor) is the largest positive integer that divides two or more numbers exactly, 
		//without leaving any remainder.
		while(num2 != 0) {
			int rem = num1%num2; // rem 6=18%12
			num1=num2;  // num1=12
			num2=rem; // num2=6
		}
		System.out.println("GCD is :" + num1);
		
	}

}
