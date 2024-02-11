package searchings;

public class serachMinIn2dArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}} ;
        int target = 3;
        boolean ans = matrixSearch(matrix, target);
        System.out.println(ans);
    }

     static boolean matrixSearch(int[][] matrix, int target) {
    for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0 ; j < matrix[0].length; j++){
            if(matrix[i][j] == target){
                return true;
            }
        }
    }
    return false;
    }
}
