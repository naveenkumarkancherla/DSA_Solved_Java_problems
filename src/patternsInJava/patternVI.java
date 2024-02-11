package patternsInJava;

public class patternVI {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
//        *********
//         *******
//          *****
//           ***
//            *
    }
    public static void pattern(int n){

        for(int i = 0; i < n; i++){
            int j = n;
            while(j > 0){
                if (j <= n - i) {
                    System.out.print("*");
                    j--;
                }else{
                    System.out.print(" ");
                    j--;
                }
            }

            int k = 1;
            while(k < n - i){
                if (k < n - i) {
                    System.out.print("*");
                    k++;
                }
            }

            System.out.println();
        }
    }
}
