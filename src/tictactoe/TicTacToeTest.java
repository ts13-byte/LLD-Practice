package tictactoe;

import java.util.List;

public class TicTacToeTest {
    public static void main(String[] args) {
        PlayStrategy playStrategy = new ThreeByThreePlayStrategy();
        Game game = new Game(playStrategy);
        game.setUpGame();
    }
}
