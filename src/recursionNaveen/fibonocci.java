package recursionNaveen;

public class fibonocci {
    public static void main(String[] args) {
        int n = 60;
        int ans = fibo(n);
        System.out.println(ans);
    }

    public static int fibo(int n) {
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
