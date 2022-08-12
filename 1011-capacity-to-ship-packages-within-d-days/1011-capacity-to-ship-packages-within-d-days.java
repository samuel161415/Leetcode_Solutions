class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=0;
        int max=0;
        
        for(int i=0;i<weights.length;i++){
          min=Math.max(weights[i],min);
          max+=weights[i];
        }
        
        int mid=0;
        int res=min;
        
        while(min<=max){
            mid=min+(max-min)/2;
            int reqDays=daysRequired(weights,mid);
            if(reqDays>days){
              min=mid+1;
            }
            
            else {
               max=mid-1;
               res=mid;
            }
        }
        return res;
    }
    
    public int daysRequired(int[] weights,int capacity){
        int reqDays=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
           sum+=weights[i];
            if(sum>capacity) {
                reqDays++;
                sum=weights[i];
            }
        }
        return reqDays;
        
    }
}