class Solution {
    private boolean isSafe(int board[][],int row,int col){
      for(int i=row-1;i>=0;i--){
        if(board[i][col]==1){
            return false;
        }
      }

      for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]==1){
            return false;
        }
      }

      for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]==1){
            return false;
        }
      }
        return true;
    }
    private int ishelper(int board[][],int row){
        if(row==board.length){
            return 1;
        }
        int count=0;
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]=1;
                count+=ishelper(board,row+1);
                board[row][j]=0;
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        int board[][]=new int[n][n];
        return ishelper(board,0);
    }
}