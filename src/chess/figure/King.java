package chess.figure;

import chess.ChessFigure;
import chess.base.Coordinate;

public class King extends ChessFigure {
    // icon in unicode: '\u2654' : '\u265A'
    public King(boolean color, Coordinate coordinate) {
        super(color, (color ? '\u2654' : '\u265A'), coordinate);
    }

    @Override
    public boolean canMove(Coordinate to) {
        return Math.abs(this.getCoordinate().getX() - to.getX()) <= 1 &&
                Math.abs(this.getCoordinate().getY() - to.getY()) <= 1;
    }
}
