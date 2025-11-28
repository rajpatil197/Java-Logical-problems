package com.raj.forloop;

import java.util.Scanner;

public class Sum_of_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter A number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int number=1;
		
		for(int i = 1; i <= num; i++) {
            sum += number;
            number += 2;
        }

		System.out.println(sum);
	}

}
