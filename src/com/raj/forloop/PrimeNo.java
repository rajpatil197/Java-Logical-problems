	package com.raj.forloop;
	
	import java.util.Scanner;
	
	public class PrimeNo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			System.out.println("Enter A Number");
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			int count;
			 
//			while(count<=num) {
//				if(num%count==0) {
//					break;
//				}
//				count++;
//			}
			for(count=2;count<=num;count++) {
				if(num%count==0) {
					break;
				}
			}
			if(count==num) {
				System.out.println("Number is Prime");
			}
			else {
				System.out.println("number is not prime");
			}
		}
	
	}
