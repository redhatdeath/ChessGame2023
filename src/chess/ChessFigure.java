package chess;

import chess.base.Coordinate;
import chess.base.Figure;
import chess.base.Movable;

public class ChessFigure extends Figure implements Movable {

    protected final boolean colorIsWhite;  //true =  white, false = black

    public ChessFigure(boolean colorIsWhite, char icon, Coordinate coordinate) {
        super(icon, coordinate);
        this.colorIsWhite = colorIsWhite;
    }

    @Override
    public boolean canMove(Coordinate to) {
        return false;
    }

    public boolean isColorIsWhite() {
        return colorIsWhite;
    }
}
