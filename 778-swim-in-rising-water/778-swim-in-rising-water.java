class Solution {
    public int swimInWater(int[][] grid) {
        Map<Integer,int[]> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        int len=grid.length;
        boolean[][] visited=new boolean[len][len];
        pq.add(grid[0][0]);
        visited[0][0]=true;
        int res=grid[0][0];
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                map.put(grid[i][j],new int[]{i,j});
            }
        }
        
        while(!pq.isEmpty()){
            int val=pq.remove();
            if(val>res) res=val;
            if(val==grid[len-1][len-1]) break;
            for(int[]d:dir){
                int x=map.get(val)[0]+d[0];
                int y=map.get(val)[1]+d[1];
                if(x>=0&&y>=0&&x<len&&y<len&&!visited[x][y]){
                    visited[x][y]=true;
                    pq.add(grid[x][y]);
                }
            }
            
        }
        return res;
      
    }
}
// I used prioritQueue because it orders according to size and don't need to follow each endex 
