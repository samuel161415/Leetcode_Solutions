class Solution {
    LinkedList<Integer> adj[];
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
       adj=new LinkedList[n];
       for(int i=0;i<n;i++){
           adj[i]=new LinkedList();
       }
        
        for(int[]a:edges){
          adj[a[0]].add(a[1]);
          adj[a[1]].add(a[0]);
        }
        int[] res=new int[n];
        int[] count=new int[n];
        Arrays.fill(count,1);
       
          postOrder(0,-1, count,res);
    
          preOrder(0,-1,count,res,n);
      
       return res; 
    }
    public void postOrder(int cur , int parent , int[] count,int[] res){
      
        for(int child:adj[cur]){
            if(child==parent) continue;
            postOrder(child,cur,count,res);
            count[cur]+=count[child];
            res[cur]+=res[child]+count[child];
            
        }
    }
    public void preOrder(int cur,int parent,int[] count,int[] res,int n){
        for(int child:adj[cur]){
            if(child==parent) continue;
            res[child]=res[cur]+(n-count[child])-count[child];
            preOrder(child,cur,count,res,n);
        }
    }
}