class Solution {
    static String[] wordBreak(String[] dict, String s) {
        Set<String> wordSet = new HashSet<>(dict);
        int maxLen = 0;
        for(String str : dict) maxLen = Math.max(maxLen, str.length());
        int n = s.length();
        String[] dp = new String[n + 1];
        dp[0] = true;
        for(int i =1; i <= n; i++){
            for(int j = i - 1; j >= Math.max(0, i - maxLen); j--){
                  if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
