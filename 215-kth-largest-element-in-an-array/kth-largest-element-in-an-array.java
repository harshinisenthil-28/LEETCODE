class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            q.offer(nums[i]);
        }
        int x=0;
        while(k>0){
            x=q.poll();
            k--;
        }
        return x;
    }
}