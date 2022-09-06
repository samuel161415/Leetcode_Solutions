class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.size();
        int[][] dp=new int[size][triangle.get(size-1).size()];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);
       return solve(triangle,0,0,dp);
    }
    public int solve(List<List<Integer>> triangle,int row,int idx,int[][] dp){
        if(row==triangle.size()-1) dp[row][idx]= triangle.get(row).get(idx);
        else if(dp[row][idx]==Integer.MAX_VALUE)
        dp[row][idx]=triangle.get(row).get(idx)+Math.min(solve(triangle,row+1,idx,dp),solve(triangle,row+1,idx+1,dp));
        return dp[row][idx];
    }
}