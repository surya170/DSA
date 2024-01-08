import java.util.HashMap;
import java.util.Scanner;

public class Hashing01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
       // System.out.println("Enter Query numbers ");
        //int q = sc.nextInt();
        
        int arr[] = new int[n+1];
        for(int i=0;i<n;i++) {
          arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> freqmap = new HashMap<>();
        //System.out.println(freqmap);
         for(int i =0;i<n;i++) {
            freqmap.put(arr[i],freqmap.getOrDefault(arr[i],0)+1);       
         }
        
         System.out.println(freqmap);

    }
}
