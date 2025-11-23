package com.raj.decisionMaking;

import java.util.Scanner;

public class TriangleCheck {

	public static void main(String[] args) {
		System.out.println("Enter three side of triagnle");
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2) {
			System.out.println("Triangle is valid");
		}else {
			System.out.println("Triangle is invalid");
		}
	}

}
