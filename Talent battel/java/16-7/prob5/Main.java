public class UniquePathObstacle {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If the starting point is an obstacle, return 0
        if (obstacleGrid[0][0] == 1) return 0;

        int[][] dp = new int[m][n];
        dp[0][0] = 1; // Start position

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Skip the start cell, already initialized
                if (i == 0 && j == 0) continue;

                // If current cell is an obstacle, no path can pass through it
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

                // Add paths from top (if not first row)
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                }

                // Add paths from left (if not first column)
                if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        // Return the number of paths to the bottom-right corner
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {
            {0, 1},
            {0, 0}
        };

        int result = uniquePathsWithObstacles(obstacleGrid);
        System.out.println("Number of unique paths: " + result);
    }
}
