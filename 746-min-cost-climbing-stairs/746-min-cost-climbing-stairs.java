class Solution {
    int min=Integer.MIN_VALUE;
    public int minCostClimbingStairs(int[] cost) {
      int n=cost.length;
        int[]dp=new int[n];
        
        return Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));
    
    }
    public int helper(int[] cost,int n,int[] dp){
       if(n<=1){
           dp[n]=cost[n];
       }
        else if(dp[n]==0) dp[n]=cost[n]+ Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));
      return dp[n];
    }
}