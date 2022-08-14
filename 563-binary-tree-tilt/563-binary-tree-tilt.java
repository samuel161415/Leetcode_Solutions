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
    int res=0; // used to sum all tilt values
    public int findTilt(TreeNode root) {
         helper(root);
        return res;
    }
    public int helper(TreeNode root){
      if(root==null) return 0;
         int a=helper(root.left);
         int b=helper(root.right);
         res+=Math.abs(a-b);
        return root.val+a+b;
    }
}