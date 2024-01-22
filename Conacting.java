package com.girmiti.assignment;

import java.util.Scanner;

public class Conacting {

	interface concat{
		void string(String str1, String str2);
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("String 1 :");
		 String str1 = sc.nextLine();
		 System.out.println("String 2 :");
		 String str2 = sc.nextLine();
         
		 concat c = (a,b) -> {
			System.out.println("Conacted :"+ a+b); 
		 };
		 
		 c.string(str1, str2);
	}

}
