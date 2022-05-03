/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        nextPointer(root);
        return root;
    }
    public void nextPointer(Node root){
        if(root==null) return;
        //if(root.left==null&&root.right==null) return ;
        else if(root.left!=null&&root.right!=null) 
        {
            root.left.next=root.right;
            root.right.next=findNext(root.next);
        }
        else if(root.left!=null)
            root.left.next=findNext(root.next);
        else if(root.right!=null)
            root.right.next=findNext(root.next);
        nextPointer(root.right);  
        nextPointer(root.left);     
       
    }
    public Node findNext(Node root){
        if(root==null) return null;
        else if(root.left!=null) 
            return root.left;
        else if(root.right!=null)
            return root.right;
         return findNext(root.next);
    }
}
