/**
 * ValidSudoku
 */
public class ValidSudoku {
    public static boolean validSudoku(char[][]board){
        int n=board.length-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char num=board[i][j];
                if(num!='.'){
                   board[i][j]='.';
                   if(!isValid(board,i,j,num)){
                    return false;
                   }
                   board[i][j]=num;
                }
            }
        }
      return true;
    }
    public static boolean isValid(char[][]board,int row,int col,char num){
        //check the row
        for (int k = 0; k <9; k++) {
         if(board[row][k]==num){
            return false;
         }
        }
        // check the col
        for (int i = 0; i < 9; i++) {
            if(board[i][col]==num){
                return false;
            }
        }
        // Check the 3*3 matrix
        int sRow=row/3*3;
        int sCol=col/3*3;
        for (int i = sRow; i < sRow+3; i++) {
            for (int j = sCol; j < sCol+3; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(validSudoku(board));
                  
    }
}