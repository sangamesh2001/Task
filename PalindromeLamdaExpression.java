package com.girmiti.assignment;

import java.util.Scanner;

public class PalindromeLamdaExpression {
	
	interface pal{
		boolean isPalindrome(String str);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	       pal p =  s -> {
	    	   for(int i=0;i<=str.length()/2;i++) {
	    		   if(s.charAt(i) != s.charAt(s.length()-1 -i))
	    			   return false;
	    	   }
	    	   return true;
	       };
        System.out.println( p.isPalindrome(str));
	}

}
