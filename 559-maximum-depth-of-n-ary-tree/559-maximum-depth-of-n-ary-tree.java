/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int max_depth=0;
    public int maxDepth(Node root) {
        if(root==null) return 0;
        helper(root,1);
        return max_depth;
    }
    public void helper(Node root,int depth){
        if(root==null) return;
        max_depth=Math.max(depth,max_depth);
        for(Node child:root.children){
            helper(child,depth+1);
        }
}
}