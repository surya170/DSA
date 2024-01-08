import java.util.HashSet;

public class Hashing03_SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 6, 13, 3, -1 };
        int n = arr.length;
        int target = 22;

        boolean flag = false;
        HashSet<Integer> h = new HashSet<Integer>();
        int pre_sum = 0;
        for (int x : arr) {
            pre_sum += x;
            if (pre_sum == target) {
                flag = true;
                break;
            }
            if (h.contains(pre_sum-target)) {
                flag = true;
            }
            h.add(pre_sum);
        }
     System.out.println(flag);

    } // main
} // class
