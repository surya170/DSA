package org.ar.Arrays;

public class Array1 {

	public static void main(String[] args) throws Exception {
       int ar[] = {-1,-2,-3,-10,-9};
       int max  = findMax(ar,5);
       System.out.println(max);
	}
	
	public static int findMax(int[] ar,int n) {
		int max = ar[0];
		for(int i=0;i<n;i++) {
			if(max<ar[i])
				max = ar[i];
		}
		return max;
	}

}
