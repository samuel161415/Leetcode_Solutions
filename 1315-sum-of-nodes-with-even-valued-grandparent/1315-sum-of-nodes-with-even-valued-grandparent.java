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
    int res=0;
    public int sumEvenGrandparent(TreeNode root) {
        helper(root,null,null);
        return res;
    }
    public void helper(TreeNode root,TreeNode parent,TreeNode grandParent){
        if(grandParent!=null&&grandParent.val%2==0) 
            res+=root.val;
    
      if(root.left!=null) helper(root.left,root,parent);
      if(root.right!=null) helper(root.right,root,parent);
    
}
}