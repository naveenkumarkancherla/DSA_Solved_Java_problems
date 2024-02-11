package searchings;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int minRow = 0;
        int maxRow = matrix.length - 1;
        int minCol = 0;
        int maxCol = matrix[0].length - 1;

        while (minRow <= maxRow && minCol <= maxCol) {
            // Traverse top row
            for (int i = minCol; i <= maxCol; i++) {
                result.add(matrix[minRow][i]);
            }
            minRow++;

            // Traverse right column
            for (int i = minRow; i <= maxRow; i++) {
                result.add(matrix[i][maxCol]);
            }
            maxCol--;

            // Traverse bottom row
            if (minRow <= maxRow) {
                for (int i = maxCol; i >= minCol; i--) {
                    result.add(matrix[maxRow][i]);
                }
                maxRow--;
            }

            // Traverse left column
            if (minCol <= maxCol) {
                for (int i = maxRow; i >= minRow; i--) {
                    result.add(matrix[i][minCol]);
                }
                minCol++;
            }
        }
        return result;
    }
}
