package com.raj.basic;

import java.util.Scanner;

public class Celsius_To_Fahrenheit {

	public static void main(String[] args) {
		System.out.println("Enter celsius");
		Scanner sc = new Scanner(System.in);
		float celsius = sc.nextInt();
		float fahrenheit = (celsius * 9/5) + 32;
		System.out.println("Fahrenheit is "+ fahrenheit +" F");
	}

}
