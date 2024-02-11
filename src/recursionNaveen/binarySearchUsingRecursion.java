package recursionNaveen;

public class binarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,5,3,45,98,};
        int target = 980;
        System.out.println(search(arr, target, 0 , arr.length - 1));
    }
    public static int search(int[] arr, int target,int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(mid > target){
            return search(arr, target, 0, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
