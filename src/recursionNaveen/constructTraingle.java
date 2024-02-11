package recursionNaveen;

import java.util.Arrays;

public class constructTraingle {
    public static void main(String[] args) {
        int[]  A = {1, 2, 3, 4, 5};
        construct(A);
    }
    public static void construct(int[] A){

        // base condition
        if(A.length < 1){
            return;
        }

        int[] temp = new int[A.length - 1];
        for(int i = 0 ; i < A.length - 1; i++){
            int x = A[i] + A[i+1];
            temp[i] = x;
        }

        construct(temp);
        System.out.println(Arrays.toString(A));
    }
}
