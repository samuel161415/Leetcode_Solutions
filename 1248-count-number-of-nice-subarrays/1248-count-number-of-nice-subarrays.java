class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){  // converting problems to prefix sum like 560. Subarray Sum Equals K questions
            if(nums[i]%2==1) nums[i]=1;
            else nums[i]=0;
        }
        int[] psum=new int[nums.length];
        psum[0]=nums[0];
        for(int i=1;i<psum.length;i++){
            psum[i]=psum[i-1]+nums[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<psum.length;i++){
          if(psum[i]==k) count++;
          if(map.containsKey(psum[i]-k)) count+=map.get(psum[i]-k); 
          map.put(psum[i],map.getOrDefault(psum[i],0)+1);
        }
        
        return count;
      
     
    }
}
