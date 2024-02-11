package patternsInJava;

public class patternXII {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");


            if (i > 1) {
                for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i > 1) {
                for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
