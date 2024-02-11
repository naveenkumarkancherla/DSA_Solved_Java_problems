package searchings;

import java.util.Arrays;

public class productExceptSelfNumber {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];

        prefixProduct[0] = 1;
        for(int i = 1; i < nums.length; i++){
            prefixProduct[i] = prefixProduct[i - 1]  * nums[i - 1];
        }

        suffixProduct[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            suffixProduct[i] = suffixProduct[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < n; i++ ){
            nums[i] = prefixProduct[i] * suffixProduct[i];
        }
        return nums;
    }
}
