package searchings;

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

     static int[] shuffle(int[] nums, int n) {
     int i = 0;
     int[] ans = new int[2 * n];
     for(int j = 0; j < n ;j++){
         ans[i++] = nums[j];
         ans[i++] = nums[n + j];
     }
     return ans;
    }
}
