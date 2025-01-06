public class LongestCommonSubarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {3, 2, 1, 4, 7};
        int length = findLongestCommonSubarray(arr1, arr2);
        System.out.println("Length of the longest common subarray: " + length);
    }
    static int findLongestCommonSubarray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[][] dp = new int[n+1][m+1];
        int maxLength = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxLength;
    }
}
