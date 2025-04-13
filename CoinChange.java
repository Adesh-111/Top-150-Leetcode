class Solution {
    public int coinChange(int coins[], int sum) {
        if (sum < 1)
            return sum;
        int[] dp = new int[sum + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins)
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
        if (dp[sum] == Integer.MAX_VALUE)
            return -1;
        return dp[sum];
    }
}
