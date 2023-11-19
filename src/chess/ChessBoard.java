package chess;

import chess.base.Board;
import chess.base.Coordinate;
import chess.base.Movable;
import chess.figure.King;
import chess.figure.Pawn;

import java.util.Arrays;

public class ChessBoard extends Board {
    private static final int chessBoardSize;
    private static ChessBoard instance;

    static {
        chessBoardSize = 8;
    }

    private boolean isWhiteTurn;

    private ChessBoard() {
        board = new ChessFigure[chessBoardSize][chessBoardSize];
        resetField();
        isWhiteTurn = true;
    }

    public static ChessBoard getInstance() {
        if (instance == null)
            instance = new ChessBoard();
        return instance;
    }

    public void newField() {
        this.resetField();
        // white
        board[0][4] = new King(true, new Coordinate(0, 4));
        for (int i = 0; i < chessBoardSize; i++)
            board[1][i] = new Pawn(true, new Coordinate(1, i));
        //black
        board[7][4] = new King(false, new Coordinate(7, 4));
        for (int i = 0; i < chessBoardSize; i++)
            board[6][i] = new Pawn(false, new Coordinate(6, i));
    }


    private void resetField() {
        for (Movable[] cf : board) Arrays.fill(cf, null);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" | A | B | C | D | E | F | G | H \n");//.append("-----------------\n");
        for (int i = 0; i < chessBoardSize; i++) {
            sb.append(8 - i);
            for (int j = 0; j < chessBoardSize; j++)
                sb.append("|").append(
                        board[chessBoardSize - 1 - i][j] != null ? board[chessBoardSize - 1 - i][j] : "   "//(char)8195
                );
            sb.append("\n"); //-----------------
        }
        sb.append(" | A | B | C | D | E | F | G | H \n").append("-----------------\n");
        return sb.toString();
    }

}
