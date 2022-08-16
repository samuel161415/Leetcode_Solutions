class Solution {
    public void solve(char[][] board) {
        
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            if(board[i][0]=='O') helper(board,i,0);
            if(board[i][col-1]=='O') helper(board,i,col-1);
        }
         for(int i=0;i<col;i++){
            if(board[0][i]=='O') helper(board,0,i);
            if(board[row-1][i]=='O') helper(board,row-1,i);
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='*') board[i][j]='O';
            }
        }
        
    }
    public void helper(char[][] board,int row,int col){
        if(row<0||col<0||row==board.length||col==board[0].length) return;
        if(board[row][col]=='X'||board[row][col]=='*') return;
        
        if(board[row][col]=='O'){
            board[row][col]='*';
            helper(board,row+1,col);
            helper(board,row-1,col);
            helper(board,row,col+1);
            helper(board,row,col-1);
        }       
    }
}
