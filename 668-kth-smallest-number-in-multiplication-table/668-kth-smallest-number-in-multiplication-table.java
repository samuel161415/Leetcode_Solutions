class Solution {
    public int findKthNumber(int m, int n, int k) {
        int count=0;
        int left=1;
        int right=m*n;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            count=0;
            for(int i=1;i<=m;i++){
                count+=Math.min(mid/i,n);
            }
            if(count>=k) right=mid;
            else if(count<k) left=mid+1;
        }
        return left;
    }
}
// Idea is base on https://www.youtube.com/watch?v=43ZWq7qf9xc
