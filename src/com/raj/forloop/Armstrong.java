package com.raj.forloop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter A Number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int temp = num;
		
		while(num>0) {
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Number is Armstrong : "+ sum);
		}
		else {
			System.out.println("Number is not Armstrong :"+sum);
		}
	}

}
