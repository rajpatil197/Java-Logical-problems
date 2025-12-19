package com.raj.forloop;

import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number For Knowing Factorial");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("Factorial of "+num+":");
		for(int i=1; i<=num;i++) {
			if(num % i ==0) {
				System.out.print(i +" ");
			}
		}
	}

}
