class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi=0;
        int ans=0;
        for(int i=0;i<accounts.length;i++){
            maxi=0;
            for(int j=0;j<accounts[0].length;j++){
                maxi+=accounts[i][j];
                ans=Math.max(ans,maxi);
            }
        }
        return ans;
    }
}