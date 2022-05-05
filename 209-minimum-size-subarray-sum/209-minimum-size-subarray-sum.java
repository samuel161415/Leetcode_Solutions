class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
     int[] psum=new int[nums.length];
        psum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            psum[i]=psum[i-1]+nums[i];
        }
        int end=psum.length-1;
        int last=psum[end];
        int slow=end;
        int count=0;
        int min=Integer.MAX_VALUE;
        if(psum[end]<target) return 0;
        while(end>=0){
            if(last-psum[end]<target){
                if(end==0&&slow>=0&&psum[slow]>=target) {
                    min=Math.min(min,slow-end+1);
                    slow--;
                    continue;
                }
                count++;
                end--;
            }
            else {
                min=Math.min(min,count);
                slow--;
                last=psum[slow];
                if(psum[slow]<target) break;
                count--;
            }
            
        }
        min=Math.min(min,count);
        return min;
        
    }
}