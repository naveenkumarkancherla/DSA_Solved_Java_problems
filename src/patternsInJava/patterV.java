package patternsInJava;

public class patterV {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
//        *
//       ***
//      *****
//     *******
//    *********
    }
    public static void pattern(int n){

        for(int i = 0; i <= n ; i++){
            for(int j = 0; j <= n; j++){
                if(j <= n - i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            for(int j = 1; j < i ; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
