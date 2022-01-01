package ru.job4j.puzzle;

public class Win {
    public static boolean horizontalCheck(int[][] board) {
        boolean rsl = true;
        for (int[] rows : board) {
            for (int cell = 0; cell < rows.length - 1; cell++) {
                if (rows[cell] != rows[cell + 1]) {
                    rsl = false;
                    break;
                }
            }
            if (!rsl) {
                break;
            }
        }
        return rsl;
    }

    public static boolean verticalCheck(int[][] board) {
        boolean rsl = true;
        for (int column = 0; column < board.length; column++) {
            for (int cell = 0; cell < board[column].length - 1; cell++) {
                if (board[cell][column] != board[cell + 1][column]) {
                    rsl = false;
                    break;
                }
            }
            if (!rsl) {
                break;
            }
        }
        return rsl;
    }

    public static boolean check(int[][] board) {
       return horizontalCheck(board) || verticalCheck(board);
    }
}
