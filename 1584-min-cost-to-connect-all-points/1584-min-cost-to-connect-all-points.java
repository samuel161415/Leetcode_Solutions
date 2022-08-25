class Solution {
    public int minCostConnectPoints(int[][] points) {
      PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
      boolean[] visited=new boolean[points.length];
        
        for(int i=1;i<points.length;i++){
            int d=Math.abs(points[0][0]-points[i][0])+Math.abs(points[0][1]-points[i][1]);
            pq.add(new int[]{i,d});
        }
        visited[0]=true;
        
        int res=0;
        while(!pq.isEmpty()){
            int[] curPoint=pq.poll();
            int idx=curPoint[0];
            int cdis=curPoint[1];
            if(!visited[idx]) {
                visited[idx]=true;
              res+=cdis;
            
            for(int i=0;i<points.length;i++){
                if(!visited[i]){
                    int d=Math.abs(points[idx][0]-points[i][0])+Math.abs(points[idx][1]-points[i][1]);
                    pq.add(new int[]{i,d});
                }
            }
            }
        }
        return res;
    }
}
// I Used prime algorithm that uses dfs. cordinates are presented with index of points as they are unique
