package recursionNaveen;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,6,5,4,2,3,7};
        int target = 0;
        int ans = search(arr, target,0);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target,int index){
        // base condition
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }


        return search(arr, target, index + 1);


    }
}
