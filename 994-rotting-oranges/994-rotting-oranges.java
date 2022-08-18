class Solution {
    public int orangesRotting(int[][] grid) {
        
         if(grid == null || grid[0].length == 0)
            return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        int countOne = 0;//counting the remain fresh
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 2){
                    //add in queue, if we find a rotting orange
                    q.offer(new int[] {i,j});
                }else if(grid[i][j] == 1){
                    countOne++;
                }
            }
        }
        if(countOne == 0)
            return 0;
        
        int time = 0;
        
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        
        while(!q.isEmpty()){
            ++time;
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] cell = q.poll();
                for(int[] dir : dirs){
                    int x = cell[0] + dir[0];
                    int y = cell[1] + dir[1];
                    
                    if(x < 0 || x >= m || y < 0 || y>= n || grid[x][y] == 0 || grid[x][y] == 2) continue;

                    q.offer(new int[] {x,y});
                    grid[x][y] = 2;
                    countOne--;
                }
            }
        }
        return countOne==0?time-1:-1;
    }

}