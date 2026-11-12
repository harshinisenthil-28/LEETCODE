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

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        // Special case: depth = 1
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        solve(root, val, depth, 1);

        return root;
    }

    public void solve(TreeNode root, int val, int depth, int level) {

        if (root == null) {
            return;
        }

        if (level == depth - 1) {

            TreeNode first = new TreeNode(val);
            TreeNode second = new TreeNode(val);

            first.left = root.left;
            second.right = root.right;

            root.left = first;
            root.right = second;

            return;
        }

        solve(root.left, val, depth, level + 1);
        solve(root.right, val, depth, level + 1);
    }
}
