import java.util.*;
public class Main {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }


        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Main method
    public static void main(String[] args) {
        Main s = new Main();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("Number of ways to climb " + n + " steps: " + s.climbStairs(n));
    }
}
