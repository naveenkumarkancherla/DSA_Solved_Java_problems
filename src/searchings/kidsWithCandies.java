package searchings;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] nums, int n) {
        List<Boolean> result = new ArrayList<>();

//        for (int i = 0; i < nums.length; i++) {
//            int sum = nums[i] + n;
//            int count = 0;
//            for (int num : nums) {
//                if (sum >= num) {
//                    count++;
//                }
//            }
//            if (count == nums.length) {
//                result.add(true);
//            } else {
//                result.add(false);
//            }
//        }
        int maxCandies = nums[0];
        for(int num : nums){
            maxCandies =  Math.max(num, maxCandies);
        }

        for(int num : nums){
            result.add(maxCandies <= num + n);
        }
        return result;
    }









}









