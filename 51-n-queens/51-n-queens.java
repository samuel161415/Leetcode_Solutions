class Solution {
    List<List<String>> list=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[][] board=new int[n][n];
       
        
        Nqueen(board,n,0,new ArrayList<>());
        return list;
    }
    public boolean Nqueen(int[][] board,int N,int col,List<String> l){
        if(col==N){
                     return true;
        }
        for(int i=0;i<N;i++){
            if(checkSafe(i,col,board,N)){
            char[] charArray = new char[N];
            Arrays.fill(charArray, '.');
            charArray[i] = 'Q';
            String rowString = new String(charArray);
                l.add(rowString);
                board[i][col]=1;
                if(Nqueen(board,N,col+1,l)){
                if(!list.contains(l))
                  list.add(new ArrayList<>(l));
                   l.remove(l.size()-1);
                     //return true;
                }
                board[i][col]=0;
            }
        }
           if(l.size()>0)  l.remove(l.size()-1);
            return false;
    }
    public boolean checkSafe(int row,int col,int[][] board,int N){
        int i,j;
     for( i=0;i<col;i++){
         if(board[row][i]==1) return false;
     }
        
        for( i=row,j=col;i>=0&&j>=0;i--,j--){ // to check upper left diagonal
            if(board[i][j]==1) return false;
        }
        for( i=row,  j=col;i<N&&j>=0;i++,j--){ // to check lower left diagonal
            if(board[i][j]==1) return false;
        }  // here no need to check the right side because we are doing or filling columnwise
       
        return true;
    }
}