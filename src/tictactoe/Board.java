package tictactoe;

public class Board {
    private final int size;
    private String board[][];
    private int movesCount;

    public Board(int size) {
        this.size = size;
        board = new String[size][size];
        movesCount = 0;
    }

    /**
     * Displays the current state of the board.
     */
    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] == null ? "-" : board[i][j]);
                if (j < size - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < size - 1) {
                for (int k = 0; k < size; k++) {
                    System.out.print("---");
                    if (k < size - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
    }

    /**
     * checks if the board is full or not
     * @return
     */
    public boolean isFull(){
        return movesCount == size*size;
    }

    /**
     * checks if a player made a valid move if true - add it to board
     * @param row
     * @param col
     * @param symbol
     * @return
     */
    public void makeAMove(int row, int col, String symbol) {
        if (!isValidMove(row, col)) {
            throw new IllegalArgumentException("Invalid move! Cell is already occupied or out of bounds.");
        }
        board[row][col] = symbol;
        movesCount++;
    }

    /**
     * resets the board to it's empty state
     */
    public void reset() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = null;
            }
        }
        movesCount = 0;
    }

    /**
     * checks if a given move is valid or not.
     * @param row
     * @param col
     * @return
     */
    public boolean isValidMove(int row, int col) {
        if(row < 0 || row >= size || col < 0 || col >= size || board[row][col] != null) {
            return false;
        }
        return true;
    }

    /**
     * checks if a move resulted in a win - by row , by col , by primary diagnol, by anti-diagnol
     * @param row
     * @param col
     * @param piece
     * @return
     */
    public boolean checkWin(int row, int col, String piece) {
        // Check row, excluding the current cell
        boolean rowWin = true;
        for (int i = 0; i < size; i++) {
            if (i != col) {
                if (board[row][i] == null || !board[row][i].equals(piece)) {
                    rowWin = false;
                    break;
                }
            }
        }

        // Check column, excluding the current cell
        boolean colWin = true;
        for (int i = 0; i < size; i++) {
            if (i != row) {
                if (board[i][col] == null || !board[i][col].equals(piece)) {
                    colWin = false;
                    break;
                }
            }
        }

        // Check primary diagonal, excluding the current cell
        boolean primaryDiagWin = (row == col); // Starts as true only for diagonal cells
        if (primaryDiagWin) {
            for (int i = 0; i < size; i++) {
                if (i != row && (board[i][i] == null || !board[i][i].equals(piece))) {
                    primaryDiagWin = false;
                    break;
                }
            }
        }

        // Check anti-diagonal, excluding the current cell
        boolean antiDiagWin = (row + col == size - 1); // Starts as true only for anti-diagonal cells
        if (antiDiagWin) {
            for (int i = 0; i < size; i++) {
                if (i != row && (board[i][size - i - 1] == null || !board[i][size - i - 1].equals(piece))) {
                    antiDiagWin = false;
                    break;
                }
            }
        }

        // Return if any of the conditions for win are satisfied
        return rowWin || colWin || primaryDiagWin || antiDiagWin;
    }
}
