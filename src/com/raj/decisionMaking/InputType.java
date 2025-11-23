package com.raj.decisionMaking;

import java.util.Scanner;

public class InputType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		
		char ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
			System.out.println("Character is Alphabet");
		}
		else if(ch >= '0' && ch <= '9') {
			System.out.println("Character is Numeric");
		}else {
			System.out.println("Character is Symbol");
		}
	}

}
