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
    List<Integer> list=new ArrayList<>();
    int idx=0;
    public void recoverTree(TreeNode root) {
       helper(root);
       Collections.sort(list);
        order(root);
        
        
    }
    public void helper(TreeNode root){
        if(root==null) return ;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
    public void order(TreeNode root){
        if(root==null) return;
        order(root.left);
         if(root.val!=list.get(idx)) root.val=list.get(idx);
         idx++;
        order(root.right);
    }
}