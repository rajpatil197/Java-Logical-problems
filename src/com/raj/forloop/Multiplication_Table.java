package com.raj.forloop;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter A Number For Table");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int temp=num*i;
			System.out.println(temp);
		}
	}

}
