package patternsInJava;

public class pattern18 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < 2*i; j++){ // for spaces
                System.out.print(" ");
            }
            for (int k = 0; k < n-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int  i = n - 1; i >= 0; i--){
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
