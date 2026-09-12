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
    public int sumNumbers(TreeNode root) {
        return leaf(root,"");
    }
    public int leaf(TreeNode root,String ans){
        if(root == null) return 0;
        ans+=root.val;
        if(root.left==null && root.right==null){
            return Integer.parseInt(ans); 
        }
        int left=leaf(root.left,ans);
        int right=leaf(root.right,ans);
        return left+right;
    }
}