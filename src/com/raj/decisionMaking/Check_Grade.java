package com.raj.decisionMaking;

import java.util.Scanner;

public class Check_Grade {

	public static void main(String[] args) {
		System.out.println("Enter Your Marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if (marks >= 80) {
			System.out.println("You Paasing With A Grade");
		}else if (marks >= 60) {
			System.out.println("You Paasing With B Grade");
		}else if (marks >= 36) {
			System.out.println("You Paasing With c Grade");
		}else{
			System.out.println("You are Fail");
		}

	}

}
