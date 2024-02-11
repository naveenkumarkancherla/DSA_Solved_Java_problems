package recursionNaveen;

public class countNoOfZeros {
    public static void main(String[] args) {
        int n = 10089002;
        int ans = zeros(n);
        System.out.println(ans);
    }
    public static int zeros(int n){
        int count = 0;
        return helper(n, count);
    }

    public static int helper(int n,int count){
        if(n == 0){
            return count;
        }
        int remainder = n % 10;
        if(remainder == 0){
            count++;
        }
        return helper(n/10,count);
    }
}
