package com.raj.forloop;

import java.util.Scanner;

public class Multiplication_table_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter A number for tables");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print((i*j)+"\t");
			}
			System.out.println();
		}
	}

}
