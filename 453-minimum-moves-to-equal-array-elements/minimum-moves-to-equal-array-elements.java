class Solution {
    int opc = 0;

    public int minnum(int[] nums, int min) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public void sol(int[] nums, int min) {
        for (int i = 0; i < nums.length; i++) {
            opc += nums[i] - min;
        }
    }

    public int minMoves(int[] nums) {
        opc = 0;

        int mn = minnum(nums, nums[0]);
        sol(nums, mn);

        return opc;
    }
}