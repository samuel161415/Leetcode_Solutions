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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return list;
        result(root,new ArrayList<>(),0,targetSum);
        return list;
    }
    public void result(TreeNode root,List<Integer>l,int sum,int tSum){
        if(root == null){
            return;
        }
        else if(root.right == null && root.left == null && tSum == sum + root.val){
            l.add(root.val);
            list.add(new ArrayList<>(l));
            l.remove(l.size() - 1);
        }
        sum += root.val;
        l.add(root.val);
        result(root.left,l,sum,tSum);
        result(root.right,l,sum,tSum);
        l.remove(l.size()-1);
        
    }
}