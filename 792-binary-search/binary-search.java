class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int num=binarysearch(nums,target,left,right);
        return num;
    }
    public int binarysearch(int[] nums,int target,int left,int right){
        if(left>right){
            return -1;
        }

        int mid=(left+right)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
           return binarysearch(nums,target,mid+1,right);
        }
        else{
           return binarysearch(nums,target,left,mid-1);
        }
    
    }
}