package recursionNaveen;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {223,5,78,3,12,454,3,2,5,1};
        sort(arr, 0, arr.length  - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int left, int right){
        // base condition
        if(left >= right){
            return;
        }


            int low = left;
            int hi = right;
            int mid = low + (hi - low) / 2;
            int pivot = arr[mid];

        while(low <= hi){

            while(arr[low] < pivot){
                low++;
            }
            while(arr[hi] > pivot){
                hi--;
            }

            if(low <= hi){
                int temp = arr[low];
                arr[low] = arr[hi];
                arr[hi] = temp;
                low++;
                hi--;
            }
        }
        sort(arr,left,hi);
        sort(arr,low, right);
    }

}
