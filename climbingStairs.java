class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1;
        int b = 2;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}

//using dynamic programing

class Solution {
    int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<= n; i++)
        dp[i] = dp[i- 2] + dp[i - 1];
        return dp[n];
    }
}
