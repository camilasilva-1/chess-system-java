package application;

import boardgame.Board;

public class UI {

    public static void printBoard(Board board) {
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                System.out.print(board.piece(i, j) + " ");
            }
            System.out.println();
        }
    }
}