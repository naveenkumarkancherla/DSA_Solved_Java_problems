package searchings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class createTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        List<Integer> result = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
           result.add(index[i],nums[i]);
       }
        for(int j = 0 ; j < nums.length;j++){
            nums[j] = result.get(j);
        }
        return nums;
    }

}
