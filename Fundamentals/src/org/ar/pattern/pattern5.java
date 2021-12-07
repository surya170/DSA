package org.ar.pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1;r<=n;r++) {
        	
        	for(int c=1;c<=n-r+1;c++) {
        		System.out.print("*"+" ");
        	}
        	System.out.println();
        }
	}

}
