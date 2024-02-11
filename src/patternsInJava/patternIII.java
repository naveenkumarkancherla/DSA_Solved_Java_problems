package patternsInJava;

public class patternIII {
    public static void main(String[] args) {
//         *
//        **
//       ***
//      ****
//     *****
        int n = 5;
        pattern(n);
    }
    public static void pattern(int n){

        for(int i = 1; i <= n; i++){

            int j = 1;
            while(j <= n){
                if(j <= n - i){
                    System.out.print("  ");
                    j++;
                }else{
                    System.out.print("* ");
                    j++;
                }
            }
            System.out.println();
        }
    }
}
