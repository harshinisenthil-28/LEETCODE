class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=-1;
                }
                else if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else if(i==0){
                    if(dp[i][j-1]==-1){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=dp[i][j-1];
                    }
                }
                else if (j == 0) {
                    if (dp[i - 1][j] == -1) {
                        dp[i][j] = 0;
                    }
                    else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                
                
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(dp[i][j]!=-1){
                    int top=dp[i-1][j];
                    int left=dp[i][j-1];
                    if(top==-1) top=0;
                    if(left==-1) left=0;
                    dp[i][j]=top+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}