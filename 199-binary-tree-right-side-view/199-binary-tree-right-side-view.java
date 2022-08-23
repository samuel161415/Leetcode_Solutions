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
    int maxDepth=-1;
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        return list;
    }
    public void dfs(TreeNode root,int depth){
        if(depth>maxDepth&&root!=null){
            maxDepth=depth;
            list.add(root.val);
        }
        if(root==null) return;
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
    }
}