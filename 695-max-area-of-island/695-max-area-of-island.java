class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                res=Math.max(res,helper(grid,i,j));
            }
        }
        return res;
        
    }
    public int helper(int[][]grid,int row,int col){
        if(row<0||row==grid.length||col<0||col==grid[0].length||grid[row][col]==0) return 0;
        grid[row][col]=0;
        return (1+helper(grid,row+1,col)+helper(grid,row-1,col)+helper(grid,row,col+1)+helper(grid,row,col-1));
        
        
    }
}