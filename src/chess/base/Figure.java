package chess.base;

public abstract class Figure {

    private boolean isLive; // true = state on board
    private final char icon;  // unicode
    private Coordinate from;

    public Figure(char icon, Coordinate coordinate) {
        this.from = coordinate;
        this.isLive = true;
        this.icon = icon;
    }

    public final void moveTo(Coordinate to) {
        from = to;
    }

    @Override
    public String toString() {
        return String.valueOf(icon);
    }


    public Coordinate getCoordinate() {
        return from;
    }
}
