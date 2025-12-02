package com.raj.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter A numer");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int reverse=0;
		
		while(num != 0) {
			int rem =num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(temp == reverse) {
			System.out.println("number is Palindrome: "+ reverse );
		}
		else {
			System.out.println("number is Not Palindrome: " + reverse );
		}
	}

}
