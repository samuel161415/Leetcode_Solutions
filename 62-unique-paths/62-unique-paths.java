class Solution {
    public int uniquePaths(int m, int n) {
      int[][] dp=new int[m][n];
      return totalPath(0,0,dp,m,n);
    }
    public int totalPath(int i, int j, int[][] dp, int m, int n){
          if(i==m||j==n) return 0;
          if(i==m-1&&j==n-1) return 1;
          
          if(dp[i][j]==0) 
               dp[i][j]=totalPath(i+1,j,dp,m,n)+ totalPath(i,j+1,dp,m,n);
    
           return dp[i][j];
      }
}