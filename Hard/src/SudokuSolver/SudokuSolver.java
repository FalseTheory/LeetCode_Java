package SudokuSolver;


public class SudokuSolver {

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
        char[][] solvedBoard = {
                {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
                {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
                {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
                {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
                {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
                {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
                {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
                {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
                {'3', '4', '5', '2', '8', '6', '1', '7', '9'}
        };
        solveSudoku(board);
        assert board == solvedBoard;
        System.out.println("Working");
        printBoard(board);
    }


    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(row);
        }
    }

    public static void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);

    }

    public static boolean backtrack(char[][] board, int i, int j) {
        if (j > 8) {
            j = 0;
            i++;
            if (i > 8) {
                return true;
            }
        }

        if (board[i][j] != '.') {
            return backtrack(board, i, j + 1);

        } else {
            for (char val = '1'; val <= '9'; val++) {
                if (isCellValid(board, val, i, j)) {
                    board[i][j] = val;
                    if (backtrack(board, i, j + 1)) {
                        return true;
                    }
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    public static boolean isCellValid(char[][] board, char value, int i, int j) {
        return rowCheck(board[i], value) && colCheck(board, j, value) && boxCheck(board, i, j, value);
    }

    public static boolean rowCheck(char[] row, char val) {
        for (char c : row) {
            if (c == val) {
                return false;
            }
        }
        return true;
    }

    public static boolean colCheck(char[][] board, int cInd, char val) {
        for (char[] chars : board) {
            if (chars[cInd] == val) {
                return false;
            }
        }


        return true;
    }

    public static boolean boxCheck(char[][] board, int rInd, int cInd, char val) {
        rInd /= 3;
        cInd /= 3;
        for (int i = rInd * 3; i < rInd * 3 + 3; i++) {
            for (int j = cInd * 3; j < cInd * 3 + 3; j++) {
                if (board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

}
