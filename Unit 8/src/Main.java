import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Scanner instantiation
        Scanner i = new Scanner(System.in);

        //Prompt for gui or terminal verion
        System.out.println("Please enter 'GUI' to play using a GUI, otherwise press enter to continue to terminal version.");
        String version = i.nextLine();
        //If GUI, launch GUI
        if (version.equals("GUI")) {
            new C4UI();
        }

        //Default players
        int players = 2;
        //Loop until valid entry
        while (true) {
            //Prompt
            System.out.print("How many players do you want to play with, 2-4?");
            //Get value
            String val = i.nextLine();
            //If no value, skip and use default players
            if (val == "") break;
            //If longer than 1, continue to next loop iteration (invalid # of players)
            if (val.length() != 1) {
                System.out.println("Oops, that's not a valid entry. Please try again.");
                continue;
            }
            //Parse int from string value
            int parsed = Integer.parseInt(val);
            //If less than 2 or more than 4, continue to next loop iteration (invalid # of players)
            if (parsed < 2 || parsed > 4) {
                System.out.println("Oops, that's not a valid entry. Please try again.");
                continue;
            }
            //Update players value
            players = parsed;
            //Break loop
            break;
        }

        //Instantiate board with number of players
        C4Board board = new C4Board(players);

        //While there is no winner
        while (board.checkWin() == 0) {
            //Get player turn
            int player = board.getPlayerTurn();
            //Get player piece
            String piece = board.getPlayerPiece();
            //Print board
            board.printBoard();
            //Default column value
            int col = 0;
            //Loop until valid entry
            while (true) {
                System.out.print("Player " + player + ", drop your " + piece + " disk at column (0-6):");
                //Get value
                String val = i.nextLine();
                //If longer than 1, continue to next loop iteration (invalid column)
                if (val.length() != 1) {
                    System.out.println("Oops, that's not a valid entry. Please try again.");
                    continue;
                }
                //Parse int from string value
                int parsed = Integer.parseInt(val);
                //If less than 0 or more than 6, continue to next loop iteration (invalid column)
                if (parsed < 0 || parsed > 6) {
                    System.out.println("Oops, that's not a valid entry. Please try again.");
                    continue;
                }
                //Update column value
                col = parsed;
                //Break loop
                break;
            }

            //Place piece at column. Returns whether piece was placed successfully.
            boolean placed = board.place(col);
            //If piece is not placed successfully, error and re-prompt player.
            if (!placed) {
                System.out.println("Sorry, that column is full. Please try again");
            }
        }

        //If win is between 1 and 4, inclusive, print winning player and board
        if (board.checkWin() > 0 && board.checkWin() < 5) {
            System.out.println("Player " + board.checkWin() + ", you won! Here's your board:");
            board.printBoard();
        }
        //If win is 5, there is draw. Print board.
        else if (board.checkWin() == 5) {
            System.out.println("Oops, there was a draw.");
            board.printBoard();
        }
    }
}