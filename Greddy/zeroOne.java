public class zeroOne {
    public static void main(String[] args) {
        int N = 3;
        int[] items = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;
        System.out.println(knapSack(items, wt, N, capacity));
    }
    static int knapSack(int[] items, int[] wt, int N, int capacity) {
        int[][] dp = new int[N + 1][capacity + 1];
        for (int[] dp1 : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                dp1[j] = -1;
            }
        }
        return helper(items, wt, N, capacity, dp);
    }
    static int helper(int[] items, int[] wt, int N, int capacity, int[][] dp) {
        if (N == 0 || capacity == 0) {
            return 0;
        }
        if (dp[N][capacity] != -1) {
            return dp[N][capacity];
        }
        // INCLUDE AND EXCLUDE CASE FOR WEIGHTS
        if (capacity >= wt[N - 1]) {
            int inc = items[N - 1] + helper(items, wt, N - 1, capacity - wt[N - 1], dp);
            int exc = helper(items, wt, N - 1, capacity, dp);

            dp[N][capacity] = Math.max(inc, exc);
            return dp[N][capacity];
        } else {
            dp[N][capacity] = helper(items, wt, N - 1, capacity, dp);
            return dp[N][capacity];
        }
    }
}
