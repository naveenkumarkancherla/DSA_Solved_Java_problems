package recursionNaveen;

public class findingMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
       // printMinAndMax(arr, arr[0], arr[arr.length - 1],0);
        int min = min(arr, arr.length);
        System.out.print("Min Value: "+min+"      ");
        int max = max(arr, arr.length);
        System.out.println("Max Value: "+max);
    }
//    public static void printMinAndMax(int[] arr,int min, int max,int index){
//        // base condition
//        if(index == arr.length - 1){
//            return;
//
//        }
//
//        min = Math.min(min, arr[index]);
//        max = Math.max(max, arr[index]);
//        printMinAndMax(arr, min, max, index+1);
//        System.out.println("Min Value: "+min + "   Max Value: "+ max);
//    }

    //best approach
     public static int min(int[] arr,int n){
        // base condition
        if(n == 1){
            return arr[0];
        }

        return Math.min(arr[n - 1], min(arr, n - 1));
     }
    public static int max(int[] arr,int n){
        // base condition
        if(n == 1){
            return arr[0];
        }

        return Math.max(arr[n - 1], max(arr, n - 1));
    }



}
