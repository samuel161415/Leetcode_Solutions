class Solution {
    public int countNegatives(int[][] grid) {
        int res=0;
        int temp=100;
       for(int[] a:grid) {
           int left=0;
           int right=a.length-1;
           int mid=0;
           while(left<=right){
               mid=left+(right-left)/2;
               if(a[mid]>=0){
                   left=mid+1;
               }
               else{
                   temp=Math.min(temp,mid);
                   right=mid-1;
               }
           }
           if(temp==100) temp=a.length;
           res+=a.length-temp;
       }
        return res;
    }
}