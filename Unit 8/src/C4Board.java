public class C4Board {
    //Board grid
    private String[][] board = new String[6][7];
    //Number of players
    private Players numPlayers = Players.Two;
    //Player turn
    private Players playerTurn = Players.One;

    //Board constructor
    public C4Board() {
        //For each item in row, set equal to " "
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = " ";
            }
        }
    }

    //Board constructor with other than 2 players
    public C4Board(int players) {
        //For each item in row, set equal to " "
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = " ";
            }
        }
        //Set numPlayers to number of players
        if (players == 3) numPlayers = Players.Three;
        else if (players == 4) numPlayers = Players.Four;
    }

    //Return board grid
    public String[][] getBoard() {
        return board;
    }

    //Get next row for desired column
    public int getNextRow(int column) {
        int count = 0;
        //Count number of filled rows
        for (int row = 0; row < board.length; row++) {
            if (!board[row][column].equals(" ")) count++;
        }
        return count;
    }

    //Return if column is full if the next row in column is greater than 5
    public boolean isColumnFull(int column) {
        return getNextRow(column) > 5;
    }

    //Place piece at next available slot in given column
    public boolean place(int column) {
        //If column is full, return false
        if (isColumnFull(column)) return false;
        //If winner exists, return false
        if (checkWin() != 0) return false;
        //Get next available row
        int row = getNextRow(column);
        //Set row, col equal to next player's value
        board[row][column] = playerTurn.getValue();
        //Update player turn for next player
        updatePlayerTurn();
        //Return true to represent successful place
        return true;
    }

    //Update player turn after successful place
    public void updatePlayerTurn() {
        //Get current turn
        int turn = playerTurn.getNumber();
        //Get number of players
        int players = numPlayers.getNumber();
        //If at last player, go back to first player
        if (turn == players) {
            playerTurn = Players.One;
        } else {
            //Increment player
            if (turn == 1) playerTurn = Players.Two;
            else if (turn == 2) playerTurn = Players.Three;
            else if (turn == 3) playerTurn = Players.Four;
        }
    }

    //Return player turn
    public int getPlayerTurn() {
        return playerTurn.getNumber();
    }

    //Return player piece
    public String getPlayerPiece() {
        return playerTurn.getValueLong();
    }

    //Print board
    public void printBoard() {
        //For each row
        for (int row = board.length - 1; row >= 0; row--) {
            //For each col
            for (int col = 0; col < board[0].length; col++) {
                //Print |
                System.out.print("|");
                //Print val
                System.out.print(board[row][col]);
            }
            //Print | at end
            System.out.println("|");
        }
        //Print at bottom
        System.out.println("---------------");
    }

    //Check win method - consolidates winning methods.
    //0 means no win yet
    //1-4 means respective player has won
    //5 means full board - draw
    public int checkWin() {
        if (checkFullBoard()) return 5;
        if (checkHorizontalWin() != 0) return checkHorizontalWin();
        if (checkVerticalWin() != 0) return checkVerticalWin();
        if (checkMajWin() != 0) return checkMajWin();
        if (checkMinWin() != 0) return checkMinWin();
        return 0;
    }

    public boolean checkFullBoard() {
        //Count is number of full columns
        int count = 0;
        //For each col
        for (int col = 0; col < board[0].length; col++) {
            //If full, increment count
            if (isColumnFull(col)) count++;
        }
        //If count equals all 7 columns, board is full, return true
        if (count == 7) return true;
        //Else return false
        return false;
    }

    public int checkHorizontalWin() {
        //For each string arr in board
        for (String[] row : board) {
            //For each item in str arr, less 3 from end (so no index out of bounds error)
            for (int i = 0; i < row.length - 3; i++) {
                //If this element equals next three elements and is not " " (which would mean no piece played yet)
                if (!row[i].equals(" ") && row[i].equals(row[i + 1]) && row[i + 1].equals(row[i + 2]) && row[i + 2].equals(row[i + 3])) {
                    //Store this player (their piece color as string)
                    String thisPlayer = row[i];
                    //Return player number from piece color string
                    return getPlayerNumberFromPiece(thisPlayer);
                }
            }
        }
        return 0;
    }

    public int checkVerticalWin() {
        //For each col
        for (int col = 0; col < board[0].length; col++) {
            //For each row, less 3 from end (so no index out of bounds error)
            for (int row = 0; row < board.length - 3; row++) {
                //If this element equals next three elements and is not " " (which would mean no piece played yet)
                if (!board[row][col].equals(" ") && board[row][col].equals(board[row + 1][col]) &&
                        board[row + 1][col].equals(board[row + 2][col]) &&
                        board[row + 2][col].equals(board[row + 3][col])) {
                    //Store this player (their piece color as string)
                    String thisPlayer = board[row][col];
                    //Return player number from piece color string
                    return getPlayerNumberFromPiece(thisPlayer);
                }
            }
        }
        return 0;
    }

    public int checkMajWin() {
        //For each row
        for (int row = 3; row < board.length; row++) {
            //For each col, less 3 from end (so no index out of bounds error)
            for (int col = 0; col < board[0].length - 3; col++) {
                //If this element equals next three elements less 1 from both row and col, and this element is not " " (which would mean no piece played yet)
                if (!board[row][col].equals("  ") && board[row][col].equals(board[row - 1][col + 1]) && board[row - 1][col + 1].equals(board[row - 2][col + 2]) && board[row - 2][col + 2].equals(board[row - 3][col + 3])) {
                    //Return player number from piece color string
                    return getPlayerNumberFromPiece(board[row][col]);
                }
            }
        }
        return 0;
    }

    public int checkMinWin() {
        //For each row less 4 from end (so no index out of bounds error)
        for (int row = 0; row <= board.length - 4; row++) {
            //For each col less 3 from end (so no index out of bounds error)
            for (int col = 0; col < board[0].length - 3; col++) {
                //If this element equals next three elements add 1 from both row and col, and this element is not " " (which would mean no piece played yet)
                if (!board[row][col].equals("  ") && board[row][col].equals(board[row + 1][col + 1]) && board[row + 1][col + 1].equals(board[row + 2][col + 2]) && board[row + 2][col + 2].equals(board[row + 3][col + 3])) {
                    //Return player number form piece color string;
                    return getPlayerNumberFromPiece(board[row][col]);
                }
            }
        }
        return 0;
    }

    public int getPlayerNumberFromPiece(String piece) {
        //Basically a lookup function.
        if (piece.equals(Players.One.getValue())) return Players.One.getNumber();
        if (piece.equals(Players.Two.getValue())) return Players.Two.getNumber();
        if (piece.equals(Players.Three.getValue())) return Players.Three.getNumber();
        if (piece.equals(Players.Four.getValue())) return Players.Four.getNumber();
        return 0;
    }

    public String[][] flip2DArray(String[][] arr) {
        //Instantiate new arr, with flipped size
        String[][] newArr = new String[arr[0].length][arr.length];
        //For each row
        for (int row = 0; row < arr.length; row++) {
            //For each col
            for (int col = 0; col < arr[0].length; col++) {
                //Set new arr at col, row equal to current arr row, col
                newArr[col][row] = arr[row][col];
            }
        }
        //Return new arr
        return newArr;
    }
}