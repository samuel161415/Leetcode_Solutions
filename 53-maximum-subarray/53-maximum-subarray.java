class Solution {
    public int maxSubArray(int[] arr) {
       int[] dp=new int[arr.length];
        int max=arr[0];
        dp[0]=arr[0];
        int prev=arr[0];
        
        for(int i=1;i<dp.length;i++){
            if(prev+arr[i]<arr[i]) prev=arr[i];
            else prev=prev+arr[i];
            dp[i]=prev;
            max=Math.max(max,prev);
        }
        
        return max; 
    }
}