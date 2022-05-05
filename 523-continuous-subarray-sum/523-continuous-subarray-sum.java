class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
         if(nums.length==1) return false;
        
        int[] psum=new int[nums.length];
        
        psum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        psum[i]=psum[i-1]+nums[i];
        }
        HashMap<Integer,Integer> hash=new HashMap<>();
         hash.put(psum[0]%k,0);
        for(int i=1;i<psum.length;i++){
           
         if((psum[i]%k==0)||(hash.containsKey(psum[i]%k)&&(i-hash.get(psum[i]%k)>1))) return true;
         if(!hash.containsKey(psum[i]%k))
            hash.put(psum[i]%k,i);
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
        