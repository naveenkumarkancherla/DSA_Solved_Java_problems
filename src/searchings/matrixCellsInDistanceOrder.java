package searchings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class matrixCellsInDistanceOrder {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int rCenter = 1;
        int cCenter = 2;
        int[][] ans = allCellsDistOrder(rows, cols,rCenter,cCenter);
        System.out.println(Arrays.deepToString(ans));
    }

     static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
           List<int[]> list = new ArrayList<>();
        for(int i = 0 ; i < rows  ; i++){
               for(int j = 0 ; j < cols ; j++){
                   list.add(new int[]{i, j});
               }
           }
         Collections.sort(list, (a, b) -> {
             int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
             int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
             return Integer.compare(distA, distB);
         });

         // Convert the sorted list to a 2D array and return
         return list.toArray(new int[rows * cols][2]);
    }
}
