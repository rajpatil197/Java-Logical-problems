package com.raj.array_string;

import java.util.Scanner;

public class Reverse_Array {

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
		
		int start =0;
		int end = n-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
