package com.girmiti.assignment;

import java.util.Scanner;

public class MaxOfThree {
	
	interface Sum{
		int max(int n1, int n2, int n3);
}

	public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the first number: ");
       int n1 = sc.nextInt();
       System.out.println("enetr the second number");
       int n2 = sc.nextInt();
       System.out.println("enetr the Three number");
       int n3 = sc.nextInt();
       Sum s = (a,b,c)-> {
    	   int res=0;
    	   res = a>b? a:b;
    	   res = res > c? res : c;
    	   return res;
       };
       System.out.println("Max is : "+s.max(n1, n2, n3));
       
	}

}
