package ru.job4j.puzzle;

public class Win {
    public static boolean horizontalCheck(int[][] board, int row) {
        boolean rsl = true;
        for (int cell = 0; cell < board[row].length - 1; cell++) {
            if (board[row][cell] != board[row][cell + 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean verticalCheck(int[][] board, int column) {
        boolean rsl = true;
        for (int row = 0; row < board[column].length - 1; row++) {
            if (board[row][column] != board[row + 1][column]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean check(int[][] board) {
        boolean resultHorisontal = true;
        boolean resultVertical = true;
        for (int i = 0; i < board.length; i++) {
            if (!horizontalCheck(board, i)) {
                resultHorisontal = false;
                break;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (!verticalCheck(board, i)) {
                resultVertical = false;
                break;
            }
        }
        return resultHorisontal || resultVertical;
    }
}
