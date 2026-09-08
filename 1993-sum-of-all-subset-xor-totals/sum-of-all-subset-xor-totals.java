class Solution {
    int ans=0;
    public int subsetXORSum(int[] nums) {
        backtrack(nums,0,0);
        return ans;
    }
    public void backtrack(int[] nums,int index,int xor){
        if(index==nums.length){
            ans+=xor;
            return;
        }
        backtrack(nums,index+1,xor^nums[index]);
        backtrack(nums,index+1,xor);
    }
}