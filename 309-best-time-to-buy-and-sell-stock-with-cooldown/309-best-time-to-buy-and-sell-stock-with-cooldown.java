class Solution {
    public int maxProfit(int[] prices) {
       
        int[][] dp=new int[prices.length][2];
        for(int[]row: dp){
            Arrays.fill(row,-1);
        }
        return  dfs(prices,0,0,dp);
    }
    public int dfs(int[] p,int buying,int idx,int[][] dp){ 
       
        if(idx>=p.length) return 0;
        
        if(buying==0&&dp[idx][buying]==-1){
             dp[idx][buying] = Math.max(dfs(p,1,idx+1,dp)-p[idx],dfs(p,buying,idx+1,dp));
        }
        else if(buying==1&&dp[idx][buying]==-1){
             dp[idx][buying]=Math.max(dfs(p,0,idx+2,dp)+p[idx],dfs(p,buying,idx+1,dp));   
        }
        
        return dp[idx][buying];  
    }
}