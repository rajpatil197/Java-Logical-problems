package com.raj.forloop;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter A number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum =0;
		
		while(num !=0) {
			
			int rem = num%10;
			int fact =1;
			for(int i=1;i<=rem;i++) {
				fact= fact*i;
			}
			
			sum = sum + fact;
			num=num/10;
			
		}
		if(temp== sum) {
			System.out.println(sum +":is a Strong Number");
		}
		else {
			System.out.println(sum +":is Not a Strong Number");
		}
		
		
	}

}
