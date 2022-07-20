class Solution {
    public void moveZeroes(int[] nums) {
       int slow=0;
        int fast=0;
        while(fast<nums.length){
          if(nums[slow]==0&&nums[fast]!=0){
           int temp=nums[fast];
              nums[fast]=nums[slow];
              nums[slow]=temp;
              
          }
            else if(nums[slow]==0&&nums[fast]==0) fast++;
                else{
                    slow++;
                    fast++;
                }
            //fast++;
        }
    }
}