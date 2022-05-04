class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int result=0;
        while(start<end){   // sorting and then using two pointer 
            if(nums[start]+nums[end]==k) {
            result++;
            start++;
            end--;
            }
            else if(nums[start]+nums[end]<k) start++;
            else end--;
        }
        return result;
    }
}