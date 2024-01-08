import java.util.Arrays;
import java.util.Scanner;

public class Hashing05_PreFixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 3, 1, 6, 5, 7, 3, 2 };
        int n = arr.length;
        System.out.println("Enter The  number of test cases ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int prefix[] = new int[n + 1];
            Arrays.fill(prefix, 0);

            prefix[0] = arr[0];
            ///System.out.print(prefix[0]+" ");
            for (int j = 1; j < n; j++) {
                prefix[j] = prefix[j - 1] + arr[j];
               // System.out.print(prefix[j]+" ");
            }

            System.out.println("Enter The  number of Queries ");
            int q = sc.nextInt();
            while (q-- > 0) {
                System.out.println("Enter Left index:");
                int l = sc.nextInt();
                System.out.println("Enter The Right Index:");
                int r = sc.nextInt();
                 l--;
                 r--;
                System.out.println(prefix[l] + " " + prefix[r]);
            }
        }

    }
}
