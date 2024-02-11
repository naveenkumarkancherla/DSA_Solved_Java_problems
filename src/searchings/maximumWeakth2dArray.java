package searchings;

public class maximumWeakth2dArray {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

     static int maximumWealth(int[][] nums) {
        int wealth = 0;

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < nums[i].length; j++){
                sum += nums[i][j];
                if(sum > wealth){
                    wealth = sum;
                }
            }
        }
        return wealth;
    }
}
