class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length(),st=0,max=0;
        boolean[][] dp = new boolean[n][n];
        for (int diff = 0; diff < n; diff++) {
            for (int i = 0, j = diff + i; j < n; i++, j++) {
                if (i == j) {
                    dp[i][j] = true;
                } else if (diff == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    }
                } else {
                        dp[i][j] =(s.charAt(i) == s.charAt(j)) && dp[i+1][j-1];
                    }
                }
                
            }
        int[] dp1=new int[n+1];
        for(int i=1;i<=n;i++){
            dp1[i]=dp1[i-1];
            for (int j = i - k; j >= 0; j--) {
                if (dp[j][i - 1]) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + 1);
                    break; 
                }
            }
        }
        return dp1[n];
    }
}