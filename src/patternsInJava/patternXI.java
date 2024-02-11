package patternsInJava;

public class patternXI {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
//         *********
//          *     *
//           *   *
//            * *
//             *
    }
    public static void pattern(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 2*n - 1; k > 0; k--){
                if(i == 1 || k == (2*n) - 1 || k == (2*i)- 1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
