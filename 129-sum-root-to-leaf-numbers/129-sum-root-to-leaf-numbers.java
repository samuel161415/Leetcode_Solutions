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
    HashSet<String> visited=new HashSet<>();
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        dfs(root,""); 
        return res;
    }
    public void dfs(TreeNode root,String str){
        if(root.left!=null) dfs(root.left,str+root.val);
        if(root.right!=null) dfs(root.right,str+root.val);
        if(root.left==null&&root.right==null) {
            str+=root.val;
            visited.add(str);
            res+=Integer.parseInt(str);
        }
        
    }
    
}