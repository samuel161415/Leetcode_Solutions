class Solution {
    public int countNegatives(int[][] grid) {
        int res=0;
        int temp=100;
       for(int i=0;i<grid.length;i++) {
           int left=0;
           int right=grid[0].length-1;
           int mid=0;
           while(left<=right){
               mid=left+(right-left)/2;
               if(grid[i][mid]>=0){
                   left=mid+1;
               }
               else{
                   temp=Math.min(temp,mid);
                   right=mid-1;
               }
           }
           if(temp==100) temp=grid[0].length;
           res+=grid[0].length-temp;
       }
        return res;
    }
}