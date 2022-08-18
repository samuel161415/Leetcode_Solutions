/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node[] visited=new Node[101];
    public Node cloneGraph(Node node) {
        Arrays.fill(visited,null);
        
        if(node==null) return null;
       return helper(node,new Node());
        
    }
    public Node helper(Node node, Node newNode){
        
        newNode.val=node.val;
        visited[newNode.val]=newNode;
        for(Node nNode:node.neighbors){
            
            if(visited[nNode.val]==null){
                newNode.neighbors.add(helper(nNode,new Node()));
            }
            else{
                newNode.neighbors.add(visited[nNode.val]);
            }
        }
        return newNode;
        
    }
}