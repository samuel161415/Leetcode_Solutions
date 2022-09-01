class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][]dp=new int[nums.length][2];
        dp[0][0]=nums[0];
        dp[0][1]=1;
        int l=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i-1]<nums[i]){
               int temp=length(dp,i,nums[i]);
               if(temp>l) l=temp+1;
               else l=l+1;
           }
            else {
                int temp=length(dp,i,nums[i]);
                l=temp+1;
            }
            dp[i][0]=nums[i];
            dp[i][1]=l;
            max=Math.max(max,l);
        }
        return max;
        
    }
    public int length(int[][] dp,int k,int val){
        int res=0;
       for(int i=0;i<k;i++){
           if(dp[i][0]<val){
               res=Math.max(res,dp[i][1]);
           }
       }
        return res;
    }
}