class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int j=0;
        int c=0;
        int[] ans=new int[nums.length];
        while(j<nums.length){
            c=0;
            for(int i=0;i<nums.length;i++){
                if(i!=j && nums[i]<nums[j]){
                    c++;
                }
            }
            ans[j]=c;
            j++;
        }
        return ans;
    }
}