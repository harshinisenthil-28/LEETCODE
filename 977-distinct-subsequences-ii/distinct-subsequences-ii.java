class Solution {
    public int distinctSubseqII(String s) {
        int n=s.length();
        int mod=1000000007;
        long[] dp=new long[26];
        for(int i=0;i<n;i++){
            int ind=s.charAt(i)-'a';
            long sum=0;
            for(long g:dp){
                sum= (sum+ g) % mod;
            }
            dp[ind]= (sum + 1) % mod;
        }
        long totalSum=0;
        for(long g:dp){
            totalSum= (totalSum + g) % mod;
        }
        return (int) totalSum;
    }
}