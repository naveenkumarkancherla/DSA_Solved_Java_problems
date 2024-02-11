package searchings;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k){

            int n = nums.length;
            k %= n;
            int[] ans = new int[n];

            System.arraycopy(nums,n - k,ans ,0, k);

            System.arraycopy(nums, 0, ans, k,n - k);

            System.arraycopy(ans,0, nums, 0, n );

        System.out.println(Arrays.toString(nums));
    }
}
