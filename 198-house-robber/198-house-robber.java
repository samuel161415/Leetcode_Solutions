class Solution {
    public int rob(int[] nums) {
        
       int l=nums.length;
        if(l==1) return nums[0];
        
       int[] dp=new int[l];
        dp[l-1]=nums[l-1];
        dp[l-2]=Math.max(nums[l-1],nums[l-2]);
        
        for(int i=l-3;i>=0;i--){
            dp[i]=Math.max(dp[i+1],dp[i+2]+nums[i]);
        }
       return dp[0];
    }
}