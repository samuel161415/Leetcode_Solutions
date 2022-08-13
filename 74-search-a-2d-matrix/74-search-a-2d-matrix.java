class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int len=matrix[i].length;
            if(matrix[i][0]<=target&&target<=matrix[i][len-1]){
                int left=0;
                int right=len-1;
                int mid=0;
                while(left<=right){
                    mid=left+(right-left)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(matrix[i][mid]<target) left=mid+1;
                    else right=mid-1;
                }
            }
            
        }
        return false;
    }
}