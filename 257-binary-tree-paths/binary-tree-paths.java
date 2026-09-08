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
    public void dfs(TreeNode root,String path,List<String> ans){
        path+=root.val;
        if(root.left==null && root.right==null){
            ans.add(path);
            return;
        }
        path+="->";
        if(root.left!=null){
            dfs(root.left,path,ans);
        }
        if(root.right!=null){
            dfs(root.right,path,ans);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        if (root==null) return ans;
        String path="";
        dfs(root,path,ans);
        return ans;
    }
}