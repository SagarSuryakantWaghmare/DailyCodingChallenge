public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        // The board is 9 by 9 so we directly write the 9 and 9
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char num = board[i][j];
                if (num != '.') {
                    board[i][j] = '.';
                    if (!isValid(board, i, j, num)) {
                        return false;
                    }
                    board[i][j]=num;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char num) {
        //check row
        for (int i = 0; i < 9; i++) {
            if(board[row][i]==num) return false;
        }
        // check col
        for (int i = 0; i < 9; i++) {
            if(board[i][col]==num) return false;
        }
        // check 3X3 grid
        int sRow=row/3*3;
        int sCol=col/3*3;
        for (int i = sRow; i <sRow+3; i++) {
            for (int j = sCol; j <sCol+3 ; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
