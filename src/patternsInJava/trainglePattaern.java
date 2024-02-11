package patternsInJava;

public class trainglePattaern {
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
        pattern3(n);
    }

    private static void pattern3(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void pattern2(int n){
        for(int i = n ; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*"+" ");

            }System.out.println();
        }
    }
}
