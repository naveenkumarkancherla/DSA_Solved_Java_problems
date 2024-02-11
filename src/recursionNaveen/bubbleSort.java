package recursionNaveen;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        bubbleSort(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr, int r, int col){
        if(r == 0){
            return;
        }

        if(r > col){
            if(arr[col] > arr[col+1]){
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr, r, col+1);
        }else{
            bubbleSort(arr, r-1,0);
        }
    }
}
