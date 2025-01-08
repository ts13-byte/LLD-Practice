package tictactoe;

import java.util.List;

public interface PlayStrategy {
    public void play(Board board, List<Player> players);
}
