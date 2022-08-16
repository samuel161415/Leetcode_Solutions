class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        
        helper(board,click[0],click[1]);
        return board;
        
    }
    public void helper(char[][] board, int row,int col){
        
        if(row<0||col<0||row==board.length||col==board[0].length) return;
        if(board[row][col]=='B'||Character.isDigit(board[row][col])) return;
        if(board[row][col]=='M') {
            board[row][col]='X';
            return;
        }
        
        if(counter(board,row,col)!='0') {
            board[row][col]=counter(board,row,col);
            return;
        }
        else board[row][col]='B';
        
        if(row>0&&board[row-1][col]=='E') helper(board,row-1,col);
        if(row<board.length-1&&board[row+1][col]=='E') helper(board,row+1,col);
        if(col>0&&board[row][col-1]=='E') helper(board,row,col-1);
        if(col<board[0].length-1&&board[row][col+1]=='E') helper(board,row,col+1);
        if(row>0&&col>0&&board[row-1][col-1]=='E') helper(board,row-1,col-1);
        if(row>0&&col<board[0].length-1&&board[row-1][col+1]=='E') helper(board,row-1,col+1);
        if(row<board.length-1&&col>0&&board[row+1][col-1]=='E') helper(board,row+1,col-1);
        if(row<board.length-1&&col<board[0].length-1&&board[row+1][col+1]=='E') helper(board,row+1,col+1);
    }
    public char counter(char[][] board,int row,int col){
        int count=0;
            if(row>0&&board[row-1][col]=='M') count++;
            if(row<board.length-1&&board[row+1][col]=='M') count++;
            if(col>0&&board[row][col-1]=='M') count++;
            if(col<board[0].length-1&&board[row][col+1]=='M') count++;
            if(row>0&&col>0&&board[row-1][col-1]=='M') count++;
            if(row>0&&col<board[0].length-1&&board[row-1][col+1]=='M') count++;
            if(row<board.length-1&&col>0&&board[row+1][col-1]=='M') count++;
            if(row<board.length-1&&col<board[0].length-1&&board[row+1][col+1]=='M') count++;
            
            return (char)(count + '0');
        }
    }
