package tictactoe;

import java.util.List;
import java.util.Scanner;

public class ThreeByThreePlayStrategy implements PlayStrategy {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void play(Board board, List<Player> players) {
        int currentPlayerIndex = 0;
        boolean hasAWinner = false;

        //play until someone wins or game draws
        while(!hasAWinner && !board.isFull()) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println("Player " + currentPlayer.getUserName() + "'s turn (" + currentPlayer.getPiece() + ")");
            board.display();

            int row, col;
            while (true) {
                System.out.println("Enter the row and column numbers separated by a space (e.g., '0 1' for row 0 and column 1): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (board.isValidMove(row, col)) {
                    break;
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            board.makeAMove(row, col, currentPlayer.getPiece());

            if (board.checkWin(row, col, currentPlayer.getPiece())) {
                hasAWinner = true;
                System.out.println("Player " + currentPlayer.getUserName() + " wins! 🎉");
                board.display();
            } else {
                currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
            }
        }

        if (!hasAWinner) {
            System.out.println("It's a draw! 🤝");
        }

    }
}

