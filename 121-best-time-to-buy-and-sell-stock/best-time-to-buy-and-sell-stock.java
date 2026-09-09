class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] dp_minp=new int[n];
        dp_minp[0]=prices[0];
        for(int i=1;i<n;i++){
            dp_minp[i]=Math.min(dp_minp[i-1],prices[i]);
        }
        int maxi = 0;

        for (int i = 1; i < n; i++) {

            int profit = prices[i] - dp_minp[i];

            maxi = Math.max(maxi, profit);
        }
        return maxi;
    }
}