class Solution {
    public int maxArea(int[] height) {
        int res=0;
        int first=0;
        int end=height.length-1;
        while(first<end){
            int h= Math.min(height[first],height[end]);
            res=Math.max(res,(end-first)*h);
            if(height[first]<height[end]) first++;
            else end--;
        }
        return res;
    }
}