package com.raj.decisionMaking;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
		System.out.println("Enter A Year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year % 400 ==0 )|| (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " Is Leap Year");
		}else {
			System.out.println(year + " Is Not Leap Year");
		}
	}

}
