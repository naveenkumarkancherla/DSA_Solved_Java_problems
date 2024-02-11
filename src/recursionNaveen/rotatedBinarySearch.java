package recursionNaveen;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 6;
        int ans = search(arr, 0 , arr.length-1, target);
        System.out.println(ans);
    }
    public static int search(int[] arr,int start, int end, int target){
        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target && arr[start] < arr[mid] || arr[mid] < arr[start] && target > arr[end]){
            return search(arr, start, mid - 1 ,target);
        }
        else if(target <= arr[end] || arr[mid] < target && arr[start] < arr[mid]  ){
            return search(arr, mid  + 1, end ,target);
        }
        return -1;
    }
}
