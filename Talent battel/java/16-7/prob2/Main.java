public class Main {

    // Constant to represent infinite distance (i.e., no direct path)
    final static int INF = 100000000;

    // Floyd-Warshall Algorithm to compute shortest distances between all pairs
    public static void calculate(int[][] matrix, int V) {
        // k is the intermediate vertex
        for (int k = 0; k < V; k++) {
            // i is the source vertex
            for (int i = 0; i < V; i++) {
                // j is the destination vertex
                for (int j = 0; j < V; j++) {
                    // If both distances are not INF, then update shortest path
                    if (matrix[i][k] < INF && matrix[k][j] < INF) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices

        // Initial adjacency matrix
        // INF represents no direct connection between nodes
        int[][] matrix = {
            {0,   3,   INF, 5},
            {2,   0,   INF, 4},
            {INF, INF, 2,   0},
            {INF, INF, 2,   0}
        };

        System.out.println("Initial Matrix:");
        printMatrix(matrix, V);

        // Apply Floyd-Warshall algorithm
        calculate(matrix, V);

        System.out.println("\nShortest paths between all pairs after Floyd-Warshall:");
        printMatrix(matrix, V);
    }

    // Utility function to print the matrix nicely
    public static void printMatrix(int[][] matrix, int V) {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (matrix[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
