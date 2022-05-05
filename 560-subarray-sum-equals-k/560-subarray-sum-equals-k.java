class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] psum=new int[nums.length];
        psum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            psum[i]=psum[i-1]+nums[i];
}
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<psum.length;i++){
          if(psum[i]==k){
              if(map.containsKey(psum[i]-k)) count+=map.get(psum[i]-k);
               count++;
          }
            else if(map.containsKey(psum[i]-k)) count+=map.get(psum[i]-k);
            map.put(psum[i], map.getOrDefault(psum[i], 0) + 1);
            //map.put(psum[i],i);
        }
        return count;
    }
}