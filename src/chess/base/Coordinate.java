package chess.base;

public class Coordinate {
    private final int x;
    private final int y;

    /**
     * Replace pair (x, y) -> (y, x) to easy work with ChessField
     * <p>
     * Attention!!!!
     * First is 'Y', Second is 'X'
     *
     * @param y coordinate
     * @param x coordinate
     */
    public Coordinate(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + ((char) ('A' + x)) + "," + ((char) ('1' + y)) + ")";
    }
}
