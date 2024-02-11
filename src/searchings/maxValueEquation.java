package searchings;

public class maxValueEquation {
    public static void main(String[] args) {
        int[][] points = {{1,3},{2,0},{5,10},{6,-10}};
        int k = 1;
        int ans = findMaxValueOfEquation(points, k);
        System.out.println(ans);
    }

    static int findMaxValueOfEquation(int[][] points, int k) {
        int n = points.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int xDifference = Math.abs(points[i][0] - points[j][0]);
                if (xDifference <= k) {
                    int equation = points[i][1] + points[j][1] + xDifference;
                    max = Math.max(max, equation);
                }
            }
        }

        System.out.println(Math.round(Math.floor(Math.sqrt(8))));
        return max;
    }
}
