package com.raj.forloop;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}	
		}
		
		if(sum==num) {
			System.out.println(num +":is a Perfect number");
		}
		else {
			System.out.println(num +":is Not a Perfect number");
		}
	}

}
