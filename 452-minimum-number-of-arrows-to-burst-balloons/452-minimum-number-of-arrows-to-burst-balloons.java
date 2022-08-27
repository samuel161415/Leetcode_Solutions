class Solution {
    public int findMinArrowShots(int[][] points) {

      
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int[] temp=points[0];
        for(int i=1;i<points.length;i++){
            if(temp[1]<points[i][0]){
                count++;
                temp=points[i];
            }
        }
        return count;
    }
}