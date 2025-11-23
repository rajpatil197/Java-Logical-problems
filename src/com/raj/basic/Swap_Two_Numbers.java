package com.raj.basic;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 19;
		int temp;
		
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
		
		num1= num1+num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Num1:"+num1+"\nNum2:"+num2);
		
	}

}
