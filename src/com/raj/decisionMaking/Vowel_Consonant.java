package com.raj.decisionMaking;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main (String [] args) {
		
		System.out.println("Enter A String");
		Scanner sc = new Scanner(System.in);
		
		char str = sc.next().charAt(0);
		
		str = Character.toLowerCase(str);
		
		if(str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u') {
			System.out.println( str + "Is Vowel");
		}
		else if (str >= 'a' && str <= 'z') {
			System.out.println(str + "Is consonant");
		}else {
			System.out.println("Invalid Input");
		}
		
		sc.close();
	}
}
