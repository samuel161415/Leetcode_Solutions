class Solution {
    public int removeDuplicates(int[] nums) {
    int fast=1;
        int slow=0;
        int res=1;
        while(fast<nums.length){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
                res++;
            }
            fast++;
        }
        return res;
    }
}