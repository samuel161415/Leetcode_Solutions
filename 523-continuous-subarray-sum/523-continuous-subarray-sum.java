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
/*

        /*
        
        [23,2,4,6,7], k = 6
       [0,23,25,] 
        
        
        int end=psum.length-1;
        int slow=end-2;
        while(end>1){
            if(psum[end]%k==0||(psum[end]-psum[slow])%k==0) return true;
            end--;
            slow--;
        }
        return false;*/
        