class Solution {
    public int fib(int n) {
         int [] dp=new int[n+1];
        return fibo(n,dp);
    }
    public int fibo(int n,int[] dp){
        if(dp[n]==0){
            if(n<=1) dp[n]=n;
            else 
            dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        }  
        return dp[n];
    }
}
