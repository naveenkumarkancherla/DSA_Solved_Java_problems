package strings;

public class nextGreaterElement {
    public static void main(String[] args) {
        int n = 12;
        int ans = nextGreaterElement(n);
        System.out.println(ans);
    }
    public static int nextGreaterElement(int n){
        int i = 0,rev = 0;

        while(n > 0){
            int remainder = n % 10;
            rev += remainder * 10;
            n /= 10;
        }
        return rev;
    }
}
