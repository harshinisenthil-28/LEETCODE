class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int o=0;
        int on=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                on++;
                o=Math.max(o,on);
            }
            else{
                on=0;
            }
        }
        return o;
    }
}