package recursionNaveen;

public class patternOfTraingle {
    public static void main(String[] args) {
        int n = 5;
        print(n,0);
    }
    public static void print(int n,int col){
        if(n < 0){
            return;
        }

        if(n > 0 && col < n){
            System.out.print("* ");
           print(n, col+1);

        }else{
            System.out.println();
            print(n-1, 0);
        }
    }
}
