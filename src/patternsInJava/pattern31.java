package patternsInJava;

public class pattern31 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }
    public static void pattern(int n){
        for(int i = 0; i <= 2*n; i++){
            for(int j = 0; j <= 2*n; j++){
                int  index = n - Math.min(Math.min(i , j),Math.min(2*n - i, 2*n - j));
                System.out.print(index+" ");
            }
            System.out.println();
        }
    }
}
