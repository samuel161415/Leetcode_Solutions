class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
       return result(0,0,grid,dp);
    }
    public int result(int i, int j,int[][] grid,int[][] dp){
        if(i==grid.length-1&&j==grid[0].length-1){
         return dp[i][j]=grid[i][j];
        }
        else if(i==grid.length-1&&dp[i][j]==0) dp[i][j]=grid[i][j]+result(i,j+1,grid,dp); // we can only move downward
        else if(j==grid[0].length-1&&dp[i][j]==0) dp[i][j]=grid[i][j]+result(i+1,j,grid,dp); // we can only move to right
        else if (dp[i][j]==0) dp[i][j]=grid[i][j]+Math.min(result(i+1,j,grid,dp),result(i,j+1,grid,dp));
        return dp[i][j];
    }
}