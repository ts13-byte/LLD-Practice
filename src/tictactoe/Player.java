package tictactoe;

public class Player {
 private final String piece;
 private final String userName;

    public Player(String piece, String userName) {
        this.piece = piece;
        this.userName = userName;
    }

    public String getPiece() {
        return piece;
    }

    public String getUserName() {
        return userName;
    }
}
