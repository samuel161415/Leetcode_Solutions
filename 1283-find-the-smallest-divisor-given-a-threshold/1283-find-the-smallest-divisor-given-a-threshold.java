class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
       int left=1;
        int right=0;
        for(int i=0;i<nums.length;i++){
        right=Math.max(right,nums[i]);   // starting right from largest element
        }
         
        int mid=0;
        double temp;
        int res=Integer.MAX_VALUE;
        while(left<=right){
           mid=left+(right-left)/2;
            temp=0.0;
            for(int i=0;i<nums.length;i++){
               temp+= Math.ceil((double)nums[i]/mid);
            }
            if((threshold-temp)>=0){
                res=Math.min(res,mid);
                right=mid-1;
            }
            else left=mid+1;
            
            
        }
        return (int)res;
    }
}