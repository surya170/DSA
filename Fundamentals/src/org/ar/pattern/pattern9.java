package org.ar.pattern;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1;r<=n;r++) {
            int count = n;
        	for(int c=1;c<=n;c++) {
        		if(r == n-c+1)
        			System.out.print("*"+" ");
        		else
        		    System.out.print(count+" ");
        		count--;
        	}
        	System.out.println();
        }
	}

}
