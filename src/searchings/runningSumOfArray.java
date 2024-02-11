package searchings;

import java.util.Arrays;

public class runningSumOfArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
            runningSum[i] = runningSum[i - 1] + nums[i];
            }
            else{
                runningSum[i] = nums[i];
            }
        }
        return runningSum;
    }
}
