package recursionNaveen;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {1,6,5,4,2,3,9};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        //base condition
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(arr,left, right);
    }
    public static int[] merge(int[] arr, int[] left,int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mixArr = new int[arr.length];
            while(i < left.length && j < right.length){
                if(left[i] > right[j]){
                    mixArr[k++] = right[j++];
                }else{
                    mixArr[k++] = left[i++];
                }
            }

            while(i < left.length){
                mixArr[k++] = left[i++];
            }
            while(j < right.length){
                mixArr[k++] = right[j++];
            }
            return mixArr;
    }
}
