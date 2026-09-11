/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        int c=0;
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                list.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            if(c==1) Collections.reverse(list);
            ans.add(list);
            c=1-c;
        }
        return ans;
    }
}