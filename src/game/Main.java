package game;

import chess.ChessGame;
import chess.base.Coordinate;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static ChessGame chessGame;
    static private Coordinate[] pos;
    static private boolean isEndGame;

    static {
        isEndGame = false;
        pos = new Coordinate[2];
        for (int i = 0; i < pos.length; i++)
            pos[i] = new Coordinate(-1, -1);


    }

    public static void main(String[] args) {
        newGame();
        while (!isEndGame) {
            checkAnswer(readAnswer());
        }
    }

    static private void newGame() {
        chessGame = ChessGame.getInstance();
        chessGame.newGame();

    }

    static private void checkAnswer(String st) {
        if (st.equals("exit")) {
            endGame();
        } else {
            isInputCorrectStep(st);
            showStepMessage(st);
        }
    }

    static private void endGame() {
        System.out.println("Stop game!!! Bye!!! Bye!!!");
        isEndGame = true;
    }

    static private String readAnswer() {
        return (new Scanner(System.in)).nextLine().toLowerCase();
    }

    static private void isInputCorrectStep(String st) {
        pos = new Coordinate[2];
        char[] data = st.toCharArray();
        if (data.length != 4) throw new RuntimeException("Incorrect turn!!!!");
        else
            for (int i = 0; i < 2; i++)
                if ((data[i * 2] >= '1' && data[i * 2] <= '8')
                        && (data[i * 2 + 1] >= 'a' && data[i * 2 + 1] <= 'h'))
                    pos[i] = new Coordinate(data[i * 2] - '1', data[i * 2 + 1] - 'a');
    }

    static private void showStepMessage(String st) {
        System.out.println("Coordinates for turn on field are:" + Arrays.toString(pos));
    }
}