package chess;

public class ChessGame {

    protected final ChessBoard board;
    public static ChessGame instance;

    private ChessGame() {
        board = ChessBoard.getInstance();
    }

    public static ChessGame getInstance() {
        if (instance == null) instance = new ChessGame();
        return instance;
    }

    public void newGame() {
        board.newField();
        this.showBoard();
    }

    private void showBoard() {
        System.out.println(board);
    }
}