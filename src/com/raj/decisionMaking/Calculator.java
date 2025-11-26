package com.raj.decisionMaking;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		System.out.println("Enter a Two Numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("enter A 1.Addition /n 2.Multiplication /n 3.Subtraction /n4.Division");
	    int cha = sc.nextInt();
	    
	    switch(cha) {
	    case 1:
	       res =num1+num2;
	       System.out.println("Calculation is:"+ res);
	       break;
	    case 2:
		       res =num1*num2;
		       System.out.println("Calculation is:"+ res);
		       break;
	    case 3:
		       res =num1-num2;
		       System.out.println("Calculation is:"+ res);
		       break;
	    case 4:
		       res =num1/num2;
		       System.out.println("Calculation is:"+ res);
		       break;
	    default :
	    	System.out.println("Enter valid choice");
	    }
	    
	}

}
