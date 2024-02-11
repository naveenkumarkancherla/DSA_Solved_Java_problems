package searchings;

import java.util.Arrays;

public class findRightInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}};
        int[] ans = findRightInterval(intervals);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findRightInterval(int[][] intervals){
        int n = intervals.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int minIndex = -1;
            int minStart = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (j != i && intervals[j][0] >= intervals[i][1] && intervals[j][0] < minStart) {
                    minStart = intervals[j][0];
                    minIndex = j;
                }
            }

            ans[i] = minIndex;
        }

        return ans;
    }

    public static class buildArrayFromPermutations {
        public static void main(String[] args) {
            int[] nums = {5,0,1,2,3,4};
            int[] ans = buildArray(nums);
            System.out.println(Arrays.toString(ans));
        }

         static int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
    }
}
