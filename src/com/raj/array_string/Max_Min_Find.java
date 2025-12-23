package com.raj.array_string;

import java.util.Scanner;

public class Max_Min_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Size of Array");
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int []arr = new int[n];
		
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1;i<n;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		
		System.out.println("Maximum Number is:"+ max);
		System.out.println("Minimum Number is:"+ min);
	}

}
