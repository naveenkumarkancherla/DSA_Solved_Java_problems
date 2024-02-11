package recursionNaveen;

public class primeNumber {
    public static void main(String[] args) {
        int n = 50;
        boolean[] arr = new boolean[n+1];
        for(int i = 1; i <= n; i++){
            if(arr[i] == true){
                i++;
            }
            if(isPrime(i,arr)){
                for(int j = i+i; j <= i;j+=j){
                    arr[j] = true;
                }
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int i, boolean[] arr) {
        if(i == 1 || i == 0){
            return false;
        }else{
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
