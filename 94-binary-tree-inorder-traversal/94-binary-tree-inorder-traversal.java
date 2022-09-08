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
   public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> res=new ArrayList<>();
          Answer(root,res);
          return res;
      }
      public void Answer(TreeNode root,List<Integer> res){
           if(root==null) return ;
          Answer(root.left,res);
          res.add(root.val);
          Answer(root.right,res);
      }
}