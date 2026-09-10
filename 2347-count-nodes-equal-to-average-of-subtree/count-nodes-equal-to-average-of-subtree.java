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
    int count=0;
    int sum=0;
    int ans=0;
    public int traversal(TreeNode root){
        if(root==null){
            return 0;
        }
        traversal(root.left);
        count++;
        sum+=root.val;
        traversal (root.right);
        return sum;
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null){
            return 0;
        }
        count=0;
        sum=0;
        traversal(root);
        if(sum/count==root.val){
            ans++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return ans;
    }
}