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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int h=height(root);
        List<Integer> inner=new ArrayList<>();
        for(int i=1;i<=h;i++){
            if(i%2==0) {
               List<Integer> m=  result(root,i,new ArrayList<>());
                Collections.reverse(m);
                list.add(m);
            }
            else  list.add(result(root,i,new ArrayList<>()));
        }
        return list;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lHeight=height(root.left);
        int rHeight=height(root.right);
        if(lHeight>rHeight) return (lHeight+1);
        else return (rHeight+1);
    }
    public List<Integer> result(TreeNode root,int level,List<Integer> l){
        if(root==null) return null;
        if(level==1) {
            l.add(root.val);  
        } 
        if(level>1) {
            result(root.left,level-1,l);
            result(root.right,level-1,l);
        }
        return l;
    }
    
}