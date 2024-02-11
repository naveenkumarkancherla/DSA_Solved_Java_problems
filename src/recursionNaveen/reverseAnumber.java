package recursionNaveen;

public class reverseAnumber {
    public static void main(String[] args) {
        int n = 2345;
        System.out.println(reverse(n));
        int ans = rev(n);
        System.out.println(ans);
    }
    static int sum = 0;
    private static int rev(int n) {
        if(n <= 1){
            return sum;
        }
        int digit = n % 10;
        sum = sum * 10 + digit;
        return rev(n/10);
    }
    public static int reverse(int n){
        if(n <= 1){
            return n;
        }
        System.out.print(n%10);
        return reverse(n/10);
    }


}
