class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> first_row=new ArrayList<>();
        
        first_row.add(1);
        triangle.add(first_row);
        
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev_row=triangle.get(i-1);
            List<Integer> current_row=new ArrayList<>();
            
            current_row.add(1);
            
            for(int j=1;j<i;j++){
                current_row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            current_row.add(1);
            triangle.add(current_row);
        }
        
        return triangle.get(rowIndex);
        
    }
}