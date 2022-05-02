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
   
    public boolean hasPathSum(TreeNode root, int targetSum) {
      if(root==null) return false ;
        return result(root,targetSum,0);
    }
    public boolean result(TreeNode root,int tSum,int cSum){
      if(root!=null){
          cSum+=root.val;
          if(cSum==tSum&&root.left==null&&root.right==null) return true; 
      }
        else return false;
        boolean c1=result(root.left,tSum,cSum);
        boolean c2=result(root.right,tSum,cSum);
        
        return (c1||c2);
    
    }
    
   
    
}