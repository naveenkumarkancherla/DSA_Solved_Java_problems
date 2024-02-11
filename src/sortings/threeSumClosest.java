package sortings;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int ans = threeSumClosest(nums, target);
        System.out.println(ans);
    }

    public static int threeSumClosest(int[] nums,int target) {
    Arrays.sort(nums);
    int closest  = nums[0] + nums[1] + nums[2];
    for(int i = 0 ; i < nums.length - 2; i++){
        int low = i + 1, high = nums.length - 1;
        while(low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if(Math.abs(sum - target) < Math.abs(closest - target)){
                closest = sum;
            }else if(sum < target){
                low++;
            }
            else{
                high--;
            }
        }
    }
    return closest;
    }
}