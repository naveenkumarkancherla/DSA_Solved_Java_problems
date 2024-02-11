package patternsInJava;

public enum equilateralRevereseTriangle {
    ;

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n) {
        for(int i = 1; i <= 2*n; i++){
            int colsInRow = i > n ? 2 * n - i : i;
            for(int j = 1; j <= colsInRow ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
