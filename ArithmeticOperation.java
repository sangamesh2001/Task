package com.girmiti.assignment;

import java.util.Scanner;

public class ArithmeticOperation {
	
	interface arithmetic{
		
		int math(int a, int b);
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 
		 System.out.println("Choice :");
		 
		 int choice = sc.nextInt();  
		 
		 arithmetic ar = null;
		 switch (choice) {
		 case 1 : ar = (a,b)->a+b;
		 break;
		 case 2 : ar = (a,b)->a-b;
		 break;
		 case 3 : ar =(a,b)->a*b;
		 break;
		 case 4 : ar = (a,b)->a/b;
		 break;
		 case 5 : ar = (a,b)->a%b;
         break;		
		default:
			System.out.println("Invalid");
			System.exit(0);
		}
 		 System.out.println(ar.math(x,y));
 	
	}

}
