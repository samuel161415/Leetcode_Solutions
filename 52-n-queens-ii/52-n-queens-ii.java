class Solution {
    int count=0;
    public int totalNQueens(int n) {
        Nqueen(0,new int[n][n],n);
        return count;
    }
     public boolean Nqueen(int col,int[][] board,int N){
         if(col==N){
             return true;
         }
         for(int i=0;i<N;i++){
             if(checkSafe(i,col,board,N)){
                 board[i][col]=1;
                 if(Nqueen(col+1,board,N)){
                  count++;   
                 }
                 board[i][col]=0;
             }
              
         }
         return false;
     }
    public boolean checkSafe(int row, int col,int[][] board,int N){
        int i,j;
        for( i=0;i<col;i++){
            if(board[row][i]==1) return false;
            
        }
        for(i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1) return false;
        }
        for(i=row,j=col;i<N&&j>=0;i++,j--){
            if(board[i][j]==1) return false;
        }
        return true;
    }
}