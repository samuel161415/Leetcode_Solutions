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
    public void flatten(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root,list);
       
        TreeNode current=root;
        for(int i=1;i<list.size();i++){
            TreeNode node=new TreeNode();
            node.val=list.get(i);
            current.left=null;
            current.right=node;
            current=current.right;
        }
        
    }
    public void helper(TreeNode root,List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}