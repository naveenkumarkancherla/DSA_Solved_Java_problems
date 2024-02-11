package searchings;

import java.util.Arrays;

public class sortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {2,3};
        int[] ans = sortedArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] sortedArrayByParity(int[] nums) {
        int n = nums.length;
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int e = 0, o = 0;
        for(int i = 0 ; i < n; i++){
            if(nums[i] % 2 == 0){
                even[e++] = nums[i];
            }
            else{
                odd[o++] = nums[i];
            }
        }

        int k = 0,j = 0;
         for (int i = 0; i < n; i+=2) {

                 nums[i] = even[k++];
                 nums[i+1] = odd[j++];

         }
       return nums;
    }
}
