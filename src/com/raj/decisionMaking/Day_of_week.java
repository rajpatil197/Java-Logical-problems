package com.raj.decisionMaking;

import java.util.Scanner;

public class Day_of_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day ,like 1 for Monday");
		int cho = sc.nextInt();
		
		String dayName ;
		
		switch(cho) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName ="Wedsday";
			break;
		case 4:
			dayName = "Thrusday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
			
		default:
			dayName="Invalid Day Number";
			break;
		}
		System.out.println("Day of Week is "+ dayName);
	}

}
