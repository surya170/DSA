package org.ar.pattern;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       for(int r=1;r<=n;r++) {
	    	   for(int c=1;c<=r;c++) {
	    		   System.out.print("*");
	    	   }
	    	   System.out.println();
	       }
	       for(int r=1;r<=n-1;r++) {
	    	   for(int c=1;c<=n-r;c++) {
	    		   System.out.print("*");
	    	   }
	        System.out.println();
	       }
	       
	}

}
