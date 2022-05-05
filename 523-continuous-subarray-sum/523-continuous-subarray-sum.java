class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
         if(nums.length==1) return false;
        
        int psum = nums[0];
        
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(psum%k,0);
        
        for(int i=1;i<nums.length;i++){ 
            psum += nums[i];
            if((psum%k==0)||(hash.containsKey(psum%k)&&(i-hash.get(psum%k)>1))) return true;
            if(!hash.containsKey(psum%k))
               hash.put(psum%k,i);
        }
        
        return false;
        
        
    }
}
        