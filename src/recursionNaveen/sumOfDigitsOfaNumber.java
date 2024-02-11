package recursionNaveen;

public class sumOfDigitsOfaNumber {
    public static void main(String[] args) {
        int n = 12;
        int ans = sum(n);
        int mul = mul(n);
        System.out.println(ans);
        System.out.println(mul);
    }

    public static int mul(int n) {
        if(n <= 1){
            return n;
        }
        return (n%10) * (mul(n/10));
    }

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + (sum(n/10));
    }

}
