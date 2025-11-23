package com.raj.basic;

import java.util.Scanner;

public class Area_and_Circumference_of_Circle {

	public static void main(String[] args) {
		System.out.println("Enter Radius ");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt();
		double area = 3.14*(radius*radius);
		double perimeter = 2*3.14*radius ;
		System.out.println("Average is :"+ area +" Cm");
		System.out.println("Average is :"+ perimeter+" Cm");

	}
}
