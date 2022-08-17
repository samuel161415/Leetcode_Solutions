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
    TreeNode node=null;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxDepth=getWidth(root)-1;
        System.out.println(maxDepth);
        
        return helper(root,0,maxDepth);
        
    }
    public int getWidth(TreeNode root){
        if(root==null) return 0;
        int left=1+getWidth(root.left);
        int right=1+getWidth(root.right);
        return Math.max(left,right);
    }
    public TreeNode helper(TreeNode root,int depth,int maxDepth){
        
      if(root==null) return null ;  
      if(depth==maxDepth) return root;
        
       TreeNode left=helper(root.left,depth+1,maxDepth);
       TreeNode right=helper(root.right,depth+1,maxDepth);
        
        if(left!=null&&right!=null) return root;
        else if (left!=null) return left;
        else return right;
         
        
    }
}