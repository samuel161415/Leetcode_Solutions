class Solution {
    public int pivotIndex(int[] nums) {
        int suffix=0;
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            suffix+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            if(suffix-2*prefix==nums[i]) return i;
            prefix+=nums[i];
        }
        return -1;
       
}
}