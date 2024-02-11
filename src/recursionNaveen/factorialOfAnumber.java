package recursionNaveen;

public class factorialOfAnumber {
    public static void main(String[] args) {
        int n = 0;
        int ans = factorial(n);
       System.out.println(ans);
    }

    private static int factorial(int n) {
        if(n <= 1){
            return 1;
        }
        return n * factorial(n- 1);
    }
}
