class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=numRows;
         int[][] dp=new int[n][n];
         dp[0][0]=1;
         for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
                dp[i][0]=1;
                temp.add(dp[i][0]);
                for(int j=1;j<=i;j++){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                    temp.add(dp[i][j]);
                }
                ans.add(temp);
         }
         return ans;
    }
}