class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=0;
        long min=time[0];
        for(int i=0;i<time.length;i++) min=Math.min(min,time[i]);
        long right=min*totalTrips;
        long mid=0;
        long sum;
        while(left<=right){
            mid=left+(right-left)/2;
            sum=0;
            for(int i=0;i<time.length;i++){
                sum+=mid/(time[i]);
            }
          
            if(sum<totalTrips) left=mid+1;
            else right=mid-1;
        }
        return left;
    }
}