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
    public TreeNode invertTree(TreeNode root) {
          if(root==null) return null;
         TreeNode temp=root.right;   // to store unchnaged right child of the root
        root.right=invertTree(root.left); // changing the right child with left
        root.left=invertTree(temp);       // changing the left child with the orginal right child i.e unchanged right child stored in temp;
        return root;
    }
}
