class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                int tempo=Math.abs(sum-target);
                if(sum==target) return sum;
                if(tempo<min) {
                    min=tempo;
                   result=sum;
                }
                if(sum<target) l++;
                else r--;
            }
        }
        return result;
    }
}