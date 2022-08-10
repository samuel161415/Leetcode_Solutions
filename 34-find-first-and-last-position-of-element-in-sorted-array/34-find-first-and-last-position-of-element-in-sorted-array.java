class Solution {
    public int[] searchRange(int[] nums, int target) {
        int min=firstIdx(nums,target);
        int max=secondIdx(nums,target);
        int[] res={min,max};
        return res;
    }
    public int firstIdx(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int mid=0;
        int idx=-1;
        while(left<=right){
          mid=left+(right-left)/2;
            if(nums[mid]==target){
                idx=mid;
             right=mid-1;
                 }
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return idx;
    }
     public int secondIdx(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int mid=0;
        int idx=-1;
        while(left<=right){
          mid=left+(right-left)/2;
            if(nums[mid]==target){
                idx=mid;
             left=mid+1;
                 }
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
         return idx;
    }
}