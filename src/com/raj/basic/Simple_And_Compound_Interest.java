package com.raj.basic;

import java.util.Scanner;

public class Simple_And_Compound_Interest {

	public static void main(String[] args) {
		System.out.println("Enter ");
		Scanner sc = new Scanner(System.in);
		double P = sc.nextInt();
		double R = sc.nextInt();
		double T = sc.nextInt();
		double N = sc.nextInt();
		double Si = (P * R * T) /100;
//		double Ci = P *(1+R/N)^ N * T ;
		System.out.println("Simple Interest :"+ Si);
//		System.out.println("Compound Interest :"+ Ci);

	}
}
