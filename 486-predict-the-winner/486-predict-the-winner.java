class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return helper(nums,0,nums.length-1)>=0;
    }
    public int helper(int[] nums,int start,int end){
        return start==end?nums[end]:Math.max(nums[end]-helper(nums,start,end-1),nums[start]-helper(nums,start+1,end));
        
    }
}