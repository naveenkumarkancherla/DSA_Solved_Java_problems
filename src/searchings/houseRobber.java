package searchings;

public class houseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int ans = rob(nums);
        System.out.println(ans);
    }

     static int rob(int[] nums) {
        int n= nums.length;
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return nums[0];
        }

        int[] ans = new int[n];
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < n; i++){
            ans[i] = Math.max(ans[i -1],nums[i] + ans[i - 2]);
        }
        return ans[n - 1];
    }
}
