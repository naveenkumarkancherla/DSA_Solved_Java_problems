package patternsInJava;

public class patternXIII {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
//            1
//          1   1
//        1   2   1
//      1   3   3   1
//    1   4   6   4   1
    }
    public static void pattern(int n){

        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                if(j > i){
                    System.out.print(" ");
                }
            }
            for(int k = 1; k <= i ; k++){
                System.out.print(" "+i);
            }

            System.out.println();
        }
    }
}
