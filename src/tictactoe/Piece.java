package tictactoe;

public class Piece {
    private final PieceType pieceType;

    Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
