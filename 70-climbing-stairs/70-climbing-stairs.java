class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return Stairs(n,dp);
    }
    public int Stairs(int n,int[] dp){
      if(n==0){
          dp[0]=0; 
        //  return dp[n];
      }
      if(n==1) {
      dp[1]=1;
      //return dp[1];
      }
      if(n==2) {
      dp[2]=2;
      //return dp[2];
      }
        if(dp[n]==0) dp[n]=Stairs(n-1,dp)+Stairs(n-2,dp);
        return dp[n];
    }
}