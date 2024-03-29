class Solution {
    public int search(int[] nums, int target) {
      
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[left]<=nums[mid]){  // if the left side is ordered
                if(nums[left]<=target&&target<=nums[mid]) right=mid-1;
                else left=mid+1;
            }
            else {  // if the right side is ordered
                if(nums[mid]<=target&&nums[right]>=target) left=mid+1;
                else right=mid-1;
            }
        }
        return -1;
    }
}