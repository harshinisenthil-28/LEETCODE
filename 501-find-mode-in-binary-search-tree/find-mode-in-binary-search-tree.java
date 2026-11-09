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
    HashMap<Integer,Integer>map=new HashMap<>();
    public int[] findMode(TreeNode root) {
        traverse(root);
        int maxi=0;
        for(int i:map.values()){
            maxi=Math.max(maxi,i);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==maxi){
                arr.add(i);
            }
        }
        int[] array=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            array[i]=arr.get(i);
        }
        return array;
    }
    public void traverse(TreeNode root){
        if(root==null) return;
        if(map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }
        else{
            map.put(root.val,1);
        }
        traverse(root.left);
        traverse(root.right);
    }
}