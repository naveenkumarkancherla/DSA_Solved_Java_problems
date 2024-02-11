package searchings;

public class numberIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

     static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i < j && nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
