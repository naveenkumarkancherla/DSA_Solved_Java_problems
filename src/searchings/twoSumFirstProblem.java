package searchings;

public class twoSumFirstProblem {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target) ;
        System.out.println("["+ans[0]+","+ans[1]+"]");
    }

     static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length;j++){
                if(i != j && nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
