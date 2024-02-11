package searchings;

import java.util.Arrays;

public class squaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
