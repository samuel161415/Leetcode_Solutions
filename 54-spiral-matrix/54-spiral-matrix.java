class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowBegin=0;
        int colBegin=0;
        int rowEnd=matrix.length-1;
        int colEnd=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        
        while(rowBegin<=rowEnd&&colBegin<=colEnd){
            // we will have 4 cases
            // traversing to right
             if(colBegin<=colEnd&&rowBegin<=rowEnd)
            for(int i=colBegin;i<=colEnd;i++){
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            // traversing to bottum
             if(colBegin<=colEnd&&rowBegin<=rowEnd)
            for(int i=rowBegin;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            // traversing to left
            if(colBegin<=colEnd&&rowBegin<=rowEnd)
            for(int i=colEnd;i>=colBegin;--i){
                list.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            // traversing up
            if(colBegin<=colEnd&&rowBegin<=rowEnd)
            for(int i=rowEnd;i>=rowBegin;--i){
                list.add(matrix[i][colBegin]);
            }
            colBegin++;
            System.out.println(" rowBegin "+rowBegin+" rowEnd "+rowEnd+" colBegin "+colBegin+" rowEnd "+rowEnd);
        }
        return list;
    }
}