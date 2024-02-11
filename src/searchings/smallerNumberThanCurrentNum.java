package searchings;

import java.util.Arrays;

public class smallerNumberThanCurrentNum {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] > nums[j]){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
