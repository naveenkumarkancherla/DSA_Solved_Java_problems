package searchings;

import java.util.Arrays;

public class PerimeterOfLargestTriangle {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4};
        System.out.println(largestPerimeter(nums));
    }

     static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;
    for(int i = n - 1; i >= 2; i--){

        if(nums[i - 2] + nums[i - 1] > nums[i]){
            max = Math.max(max,nums[i-2] + nums[i-1] + nums[i]);
        }
    }
    return max;
    }
}
