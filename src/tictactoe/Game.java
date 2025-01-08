package tictactoe;

import java.util.*;

public class Game {
    List<Player> players;
    Board board;
    int numberOfPlayersPlaying;
    int boardSize;
    Scanner scanner = new Scanner(System.in);
    Set<String> availableSymbols;
    PlayStrategy playingStrategy;

    public Game(PlayStrategy playingStrategy) {
        this.players = new ArrayList<>();
        this.availableSymbols = PieceType.getAvailableSymbols();
        this.playingStrategy = playingStrategy;
    }

    public void setUpGame() {
        boolean isBoardSizeOk = false;
        while (!isBoardSizeOk) {
            System.out.print("Enter your board size (minimum size: 3*3): ");
            boardSize = scanner.nextInt();
            if (boardSize >= 3) {
                isBoardSizeOk = true;
            } else {
                System.out.println("Please enter a valid size!!");
            }
        }
        board = new Board(boardSize);

        boolean isPlayerNumberOk = false;
        while (!isPlayerNumberOk) {
            System.out.println("Enter the number of players playing the game (minimum: 2): ");
            numberOfPlayersPlaying = scanner.nextInt();
            if (numberOfPlayersPlaying >= 2) {
                isPlayerNumberOk = true;
            } else {
                System.out.println("Please add at least 2 players!!");
            }
        }
        scanner.nextLine();
        addPlayers();
        System.out.println("All set up! The game begins in:");
        for (int i = 3; i > 0; i--) {
            System.out.println(i + "...");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Countdown interrupted!");
            }
        }
        System.out.println("Go!");
        playingStrategy.play(board,players);

    }

    private void addPlayers() {
        for (int i = 0; i < numberOfPlayersPlaying; i++) {
            System.out.println("Player " + (i + 1) + ", please enter your username: ");
            boolean isUserNameChosen = false;
            String userName = null;
            while (!isUserNameChosen) {
                userName = scanner.nextLine();
                if (!userName.isBlank()) {
                    isUserNameChosen = true;
                } else {
                    System.out.println("Please enter a username!!");
                }
            }

            boolean isSymbolChosen = false;
            String chosenSymbol = null;
            System.out.println("Please choose your symbol from this collection: ");
            System.out.println(String.join(", ", availableSymbols));

            while (!isSymbolChosen) {
                chosenSymbol = scanner.nextLine();
                if (!chosenSymbol.isBlank() && availableSymbols.contains(chosenSymbol)) {
                    isSymbolChosen = true;
                } else {
                    System.out.println("Invalid symbol! Please choose a symbol from the available collection.");
                }
            }

            availableSymbols.remove(chosenSymbol);
            Player player = new Player(chosenSymbol, userName);
            players.add(player);
        }
    }
}