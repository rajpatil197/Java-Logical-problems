package com.raj.forloop;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int reverse=0;
		
		while(num != 0) {
			int temp =num%10;
			reverse=reverse*10+temp;
			num=num/10;
		}
		System.out.println("Reverse Number is :"+ reverse);
	}

}
