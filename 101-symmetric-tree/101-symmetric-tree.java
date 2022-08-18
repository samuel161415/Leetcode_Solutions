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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        
        if(root==null) return true;
        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty()&&!q2.isEmpty()){
            
          TreeNode node1=q1.remove();
          TreeNode node2=q2.remove();
            
            
             if(node1==null&&node2!=null||node1!=null&&node2==null) return false;
            
            else if(node1!=null){
                if(node1.val!=node2.val) return false;
                
            else{
              
                q1.add(node1.left);
                q1.add(node1.right);
                q2.add(node2.right);
                q2.add(node2.left);
                
            }
            
        }
        }
        return true;
    }
    
}