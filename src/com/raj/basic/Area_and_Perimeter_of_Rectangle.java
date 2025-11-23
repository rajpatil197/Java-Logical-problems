package com.raj.basic;

import java.util.Scanner;

public class Area_and_Perimeter_of_Rectangle {
	
	public static void main(String[] args) {
		System.out.println("Enter length and breadth ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int area = length * breadth;
		int perimeter = (length + breadth)*2 ;
		System.out.println("Average is :"+ area);
		System.out.println("Average is :"+ perimeter);

	}
}
