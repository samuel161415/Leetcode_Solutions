class Solution {
    public int subarraySum(int[] nums, int k) {
       int[] psum=new int[nums.length+1];
        for(int i=1;i<psum.length;i++){
            psum[i]=psum[i-1]+nums[i-1];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=1;i<psum.length;i++){
            if(psum[i]==k) count++;
             if(map.containsKey(psum[i]-k)) count+=map.get(psum[i]-k);
            map.put(psum[i],map.getOrDefault(psum[i],0)+1);
        }
        return count;
        
    }
}