package com.raj.decisionMaking;

import java.util.Scanner;

public class Max_Number {

	public static void main(String[] args) {
		
		System.out.println("Enter Four Numbers ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int arr[]= {a,b,c,d};
		int max = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum number is :"+ max);
	}

}
