class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int fast=1,slow=0;
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[slow]);
        if(k==0) return false;
        while(fast<nums.length){
            if(Math.abs(fast-slow)<k){
                if(set.contains(nums[fast]))
                    return true;
                else {
                    set.add(nums[fast]);
                    fast++;
                }
            }
            else if(Math.abs(fast-slow)==k){
                if(set.contains(nums[fast])) {    
                    return true;
                }
                else {
                    set.add(nums[fast]);
                    set.remove(nums[slow]);
                    slow++;
                    fast++;
                }
            }
        }
        return false;
    }
}