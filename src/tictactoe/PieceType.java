package tictactoe;

import java.util.HashSet;
import java.util.Set;

public enum PieceType {
    X("X"),
    O("O"),
    DOLLAR("$"),
    AT("@"),
    HASH("#"),
    STAR("*"),
    HEART("❤️"),
    FIRE("🔥");

    private final String symbol;

    private static final HashSet<String> availableSymbols = new HashSet<>();

    static {
        for (PieceType pieceType : PieceType.values()) {
            availableSymbols.add(pieceType.getSymbol());
        }
    }

    PieceType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static PieceType getPieceType(String piece) {
        for (PieceType pieceType : PieceType.values()) {
            if (piece.equalsIgnoreCase(pieceType.getSymbol())) {
                return pieceType;
            }
        }
        throw new IllegalArgumentException("Invalid piece type: " + piece);
    }

    public static void removePieceFromAvailablePieces(String piece) {
        if (!availableSymbols.contains(piece)) {
            throw new IllegalArgumentException("Piece not available for removal: " + piece);
        }
        availableSymbols.remove(piece);
    }

    public static Set<String> getAvailableSymbols() {
        return new HashSet<>(availableSymbols);
    }

    public static void resetAvailableSymbols() {
        availableSymbols.clear();
        for (PieceType pieceType : PieceType.values()) {
            availableSymbols.add(pieceType.getSymbol());
        }
    }

    @Override
    public String toString() {
        return symbol;
    }
}