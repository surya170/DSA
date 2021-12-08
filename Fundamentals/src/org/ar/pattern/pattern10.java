package org.ar.pattern;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n  = sc.nextInt();
       int count = 1;
       for(int r=1;r<=n;r++) {
    	   char ch  = 'A';
    	   for(int c=1;c<=r;c++) {
    		  System.out.print(ch+" ");
    		  ch++;
    	   }
    	   ch--;
    	   for(int c=1;c<=r-1;c++) {
    		   System.out.print(--ch+" ");
    	   }
    	   System.out.println();
       }
	}

}
