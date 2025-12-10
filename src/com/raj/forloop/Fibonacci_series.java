package com.raj.forloop;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		System.out.println("Enter Number For Fibonacci Series");
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int num1=0;
		int num2=1;
		int sum=0;
		
		for(int i =1;i<=num;i++) {
			
			sum=num1+num2;
			
			System.out.print(" "+sum);
			
			num1=num2;
			num2=sum;
		}

	}

}
