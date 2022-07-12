class Solution {
    public int[] rearrangeArray(int[] nums) {
      Arrays.sort(nums);
    
        int e=1;
        while(e<nums.length){
          int temp=nums[e];
          nums[e]=nums[e-1];
            nums[e-1]=temp;
            e+=2;
        }
        return nums;
        
    }
}