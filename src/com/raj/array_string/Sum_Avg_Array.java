package com.raj.array_string;

import java.util.Scanner;

public class Sum_Avg_Array {

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
		int sum =0;
		
		for(int i =1;i<n;i++) {
			sum = sum+arr[i];
		}
		int avg = sum / n;
		
		System.out.println("Sum of Array is:"+ sum);
		
		System.out.println("Avg of Array is :"+ avg);
	}

}
