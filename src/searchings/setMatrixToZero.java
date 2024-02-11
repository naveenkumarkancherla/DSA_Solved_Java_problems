package searchings;

import java.util.Arrays;
public class setMatrixToZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] ans = seZeros(matrix);
        System.out.println(Arrays.deepToString(ans));
    }

     static int[][] seZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zerosRows = new boolean[m];
        boolean[] zerosCols = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    zerosRows[i] = true;
                    zerosCols[j] = true;
                }
            }
        }
        // arranging zeros rows
         for(int k = 0; k < m; k++){
             if(zerosRows[k]){
                 for(int j = 0; j < n;j++){
                     matrix[k][j] = 0;
                 }
             }
         }
         // arranging zerosColumns
         for(int k = 0; k < n; k++){
             if(zerosCols[k]){
                 for(int j = 0; j < m;j++){
                     matrix[j][k] = 0;
                 }
             }
         }

        return matrix;
    }
}
