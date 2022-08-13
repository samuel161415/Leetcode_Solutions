class Solution {
    public int findDuplicate(int[] nums) {
        int left=1;
        int right=nums.length-1;
        int mid=0;
        
        while(left<right){
            int count=0;
             mid=left+(right-left)/2;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid) count++;
            }
            
            if(count>mid) right=mid;
            else left=mid+1;
        }
        return left;
    }
}