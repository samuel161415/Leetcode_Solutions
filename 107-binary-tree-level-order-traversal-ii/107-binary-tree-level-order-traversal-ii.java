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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int h=height(root);
        System.out.println("height"+h);
        for(int i=1;i<=h;i++){
            list.add(result(root,i,new ArrayList<>()));
        }
        Collections.reverse(list);
        return list;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l+1,r+1);
    }
    public List<Integer> result(TreeNode root,int level,List<Integer> l){
        if(root==null) return null;
        if(level==1) l.add(root.val);
        if(level>1){
            result(root.left,level-1,l);
            result(root.right,level-1,l);
            
        }
        return l;
     
    }
}