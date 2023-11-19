package chess.figure;

import chess.ChessFigure;
import chess.base.Coordinate;

public class Pawn extends ChessFigure {
    // icon in unicode: '\u2659' : '\u265F'
    private boolean isFirstStep;

    public Pawn(boolean color, Coordinate coordinate) {
        super(color, (color ? '\u2659' : '\u265F'), coordinate);
        isFirstStep = true;
    }

    @Override
    public boolean canMove(Coordinate to) {
        if (isFirstStep) isFirstStep = false;
        return false;
    }
}
