class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums.length;
        int diff=nums[l-1]-nums[0];
        int first=0;
        int second=1;
        if(l==1) return 0;
        while(second<=l-1){
            int min=Math.min(nums[0]+k,nums[second]-k);
            int max=Math.max(nums[l-1]-k,nums[first]+k);
            diff=Math.min(diff,max-min);
            first++;
            second++;
        }
        return diff;
    }
}