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
    // This is using recursion
    public void flatten(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
       
        TreeNode current=root;
        for(int i=1;i<list.size();i++){
            TreeNode node=new TreeNode();
            node.val=list.get(i);
            current.left=null;
            current.right=node;
            current=current.right;
        }
        
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }
}