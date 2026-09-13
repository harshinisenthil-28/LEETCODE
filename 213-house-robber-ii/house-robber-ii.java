class Solution {
    public int solve(int[] nums,boolean b){
        int[] dp=new int[nums.length];
        if(b){
            dp[1]=nums[1];
            dp[2]=Math.max(nums[1],nums[2]);
            for(int i=3;i<nums.length;i++){
                dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
            }
            return dp[nums.length-1];
        }
        else{
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length;i++){
                dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
            }
            return dp[nums.length-2];
        }
    }
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        if(nums.length==3){
            return Math.max(Math.max(nums[0],nums[1]),nums[2]);
        }
        return Math.max(solve(nums,true),solve(nums,false));
    }
}