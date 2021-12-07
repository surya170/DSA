package org.ar.pattern;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		for(int r=1;r<=R;r++) {
			for(int c=1;c<=C;c++) {
				if(r == 1 || r == R  )
				System.out.print("*");
				else
					if(c==1 || c==C)
						System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}
	}

}
