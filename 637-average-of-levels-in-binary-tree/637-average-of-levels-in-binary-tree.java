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
    public List<Double> averageOfLevels(TreeNode root) {
    Queue<TreeNode> q=new LinkedList<>();
    List<Double> res=new ArrayList<>();
        if(root==null) return res;
        
        double level_sum=0;
        q.add(root);
        while(!q.isEmpty()){
            level_sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){ 
                TreeNode node=q.remove();
                level_sum+=node.val;
                
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            double average=level_sum/size;
            res.add(average);
        }
        return res;
    }
}