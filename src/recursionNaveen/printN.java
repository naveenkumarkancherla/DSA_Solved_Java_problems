package recursionNaveen;

public class printN {
    public static void main(String[] args) {
        int n = 5;
        //printRev(n);
        print(n);
    }
    public static void print(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        print(n - 1);
        System.out.println(n);// if you want both reverse and forward printing...
    }
    public static void printRev(int n){
        if(n == 0){
            return;
        }
        printRev(n - 1);
        System.out.println(n);
    }
}
