class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=nums.length/2;
        int left=0;
        int right=nums.length-1;
       while(left<right){
           if(target>nums[mid]){
           left=mid+1;
            mid=(right+left)/2;
               
           }
           else if(target<nums[mid]){
               right=mid;
               mid=(left+right)/2;
           }
           else return mid;
       }
        if(target>nums[mid]) return mid+1;
        else return mid;
    }
}