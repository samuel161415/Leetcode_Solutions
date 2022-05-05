class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int zero=0;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            else mul*=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            if(zero>1) result[i]=0;
            else if(zero==1&& nums[i]==0) result[i]=mul;
            else if(zero==1&&nums[i]!=0) result[i]=0;
            else result[i]=mul/nums[i];
        }
        return result;
    }
}