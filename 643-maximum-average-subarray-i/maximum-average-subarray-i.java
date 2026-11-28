class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int i=0;
      double maxi=Double.NEGATIVE_INFINITY;
      int add=0;
      for(int j=0;j<nums.length;j++){
        add+=nums[j];
        while(j-i+1>k){
            add-=nums[i];
            i++;
        }
        if(j-i+1!=0 && j-i+1==k){
            maxi=Math.max(maxi,(double)add/k);
        }
      }  
      return maxi;
    }
}