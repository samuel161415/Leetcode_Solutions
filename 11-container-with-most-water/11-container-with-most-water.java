class Solution {
    public int maxArea(int[] height) {
       int start=0,end=height.length-1;
        int Area=0;
        int res=0;
        while(start<end){
        Area=Math.min(height[start],height[end])*(end-start);
            res=Math.max(Area,res);
            if(height[start]<height[end]) start++;
            else end--;
        }
        return res;
    }
}