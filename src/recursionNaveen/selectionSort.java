package recursionNaveen;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1,6,7,3,8,2};
        int[] ans = selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] selection(int[] arr, int r, int c, int max) {
       // base conditon
        if(r==0){
            return arr;
        }
        if(c < r){
            if(arr[c] > arr[max]){
               return  selection(arr, r,c+1, c);
            }else{
               return selection(arr, r,c+1, max);
            }
        }else{
            int temp = arr[r-1];
            arr[r-1] = arr[max];
            arr[max] = temp;
            return selection(arr, r-1, 0, 0);
        }
    }

//    private static int[] selection(int[] arr, int last) {
//        if(last == 0){
//            return arr;
//        }
//        int max = arr[last];
//        for(int i = 1; i <= last; i++){
//            if(arr[i] > max){
//                int temp = arr[last];
//                arr[last] = arr[i];
//                arr[i] = temp;
//            }
//        }
//
//        return selection(arr,last-1);
//    }


}
