class Solution {
    public int numEnclaves(int[][] grid) {
       int row=grid.length;
       int col=grid[0].length;
        
        for(int i=0;i<row;i++){
            if(grid[i][0]==1) helper(grid,i,0);
            if(grid[i][col-1]==1) helper(grid,i,col-1);
        }
        for(int j=0;j<col;j++){
            if(grid[0][j]==1) helper(grid,0,j);
            if(grid[row-1][j]==1) helper(grid,row-1,j);
        }
        int res=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             if(grid[i][j]==1) res++;
            }
        }
        return res;
    }
    public void helper(int[][]grid,int row,int col){
        if(row<0||col<0||row==grid.length||col==grid[0].length) return;
        
          grid[row][col]=0;
        if(row>0&&grid[row-1][col]==1) helper(grid,row-1,col);
        if(col>0&&grid[row][col-1]==1) helper(grid,row,col-1);
        if(row<grid.length-1&&grid[row+1][col]==1) helper(grid,row+1,col);
        if(col<grid[0].length-1&&grid[row][col+1]==1) helper(grid,row,col+1);
        
    }
}