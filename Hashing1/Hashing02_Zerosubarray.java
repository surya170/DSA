import java.util.HashSet;

public class Hashing02_Zerosubarray {
     public static void main(String[] args) {
        int arr[] = {3,4,3,-1,1};
        
        boolean flag = false;
        HashSet<Integer> h = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i=0;i<arr.length;i++) {
            pre_sum += arr[i];
            if(h.contains(pre_sum)) {
             flag = true;
            }
            if(pre_sum == 0) 
             flag = true ; 
            h.add(pre_sum);
        }
        System.out.println(flag);
     }
}
