class Solution {
    public void backtrack(int i, List<List<Integer>> ans, int[] candidates, int target, List<Integer> listt) {
        if (target == 0) {
            ans.add(new ArrayList<>(listt));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            listt.add(candidates[j]);
            backtrack(j, ans, candidates, target - candidates[j], listt);
            listt.remove(listt.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, ans, candidates, target, new ArrayList<>());
        return ans;
    }
}