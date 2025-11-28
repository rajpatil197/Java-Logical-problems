package com.raj.forloop;

import java.util.Scanner;

public class Sum_of_Nnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter A number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
	}

}
