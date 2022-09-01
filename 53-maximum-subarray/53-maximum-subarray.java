class Solution {
    public int maxSubArray(int[] arr) {
      int max=arr[0];
        int prev=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(prev+arr[i]<arr[i]) prev=arr[i];
            else prev=prev+arr[i];
            max=Math.max(max,prev);
        }
        
        return max;
    }
}