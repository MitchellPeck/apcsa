package Battleship;

import Battleship.Enums.Directions;
import Battleship.Enums.Guess;

public class Grid {
    //Rows & Cols dims. 100 for fun battleship! Except not actually because headers 2D arr only accounts for 10 :)
    private final int rows = 10;
    private final int cols = 10;
    private String[][] headers = {{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}};

    //Grid 2D array of Locations
    private Location[][] grid;

    //Constructor
    public Grid() {
        //Instantiate grid with rows x cols Locations
        grid = new Location[rows][cols];
        //Init
        initGrid();
    }

    //Init
    private void initGrid() {
        //For each row
        for (int row = 0; row < rows; row++) {
            //For each col
            for (int col = 0; col < cols; col++) {
                //Create new location at row, col
                grid[row][col] = new Location();
            }
        }
    }

    public void addShip(Ship s) {
        //If can't place, return
        if (!canPlaceShip(s)) return;
        //Switch for direction
        switch (s.getDirection()) {
            case Directions.HORIZONTAL: {
                //For each col between ship col and ship col + ship length
                for (int col = s.getColumn(); col < s.getColumn() + s.getLength(); col++) {
                    //Set ship to true
                    grid[s.getRow()][col].setShip(true);
                }
            }
            break;
            case Directions.VERTICAL: {
                //For each row between ship row and ship row + ship length
                for (int row = s.getRow(); row < s.getRow() + s.getLength(); row++) {
                    //Set ship to true
                    grid[row][s.getColumn()].setShip(true);
                }
            }
            break;
        }
    }

    //Return false if row, col, is outside 10, 10 or 9, 9 if you're an i=0 normie
    //Else return true
    public boolean inBounds(int row, int col) {
        //Like I said above
        return (row >= 0 && row <= 9 && col >= 0 && col <= 9);
    }

    //Return false if ship is invalid
    //Else return true
    public boolean canPlaceShip(Ship s) {
        //Store first row & column, second row & column
        int firstRow = s.getRow();
        int firstCol = s.getColumn();
        int secondRow = 0;
        int secondCol = 0;
        //Switch for direction
        switch (s.getDirection()) {
            case Directions.HORIZONTAL: {
                //Second row is same because horizontal is left-right aka col
                secondRow = firstRow;
                //Second col is first col add ship length - 1 because ship length includes first col
                secondCol = firstCol + s.getLength() - 1;
                //If anything is outside of bounds, return false
                if (!inBounds(firstRow, firstCol) || !inBounds(secondRow, secondCol)) return false;
                //For each col in ships length, check if ship already exists
                for (int i = firstCol; i < secondCol; i++) {
                    if (hasShip(firstRow, i)) return false;
                }
            }
            break;
            case Directions.VERTICAL: {
                //Second row is first row add ship length - 1 because ship length includes first row
                secondRow = firstRow + s.getLength() - 1;
                //Second col is same because vertical is up-down aka row
                secondCol = firstCol;
                //If anything is outside of bounds, return false
                if (!inBounds(firstRow, firstCol) || !inBounds(secondRow, secondCol)) return false;
                //For each row in ships length, check if ship already exists
                for (int i = firstRow; i < secondRow; i++) {
                    if (hasShip(i, firstCol)) return false;
                }
            }
            break;
        }
        //Not a failure!
        return true;
    }

    //Returns guess result of row, col
    public Guess makeGuess(int row, int column) {
        return grid[row][column].makeGuess();
    }

    //Returns true if location is already guessed
    //Else returns false
    public boolean alreadyGuessed(int row, int column) {
        return !grid[row][column].isUnguessed();
    }

    //Returns true if ship exists
    //Else returns false
    public boolean hasShip(int row, int column) {
        return grid[row][column].hasShip();
    }

    //Returns true if grid has lost
    public boolean hasLost() {
        //For each row
        for (int row = 0; row < rows; row++) {
            //For each col
            for (int col = 0; col < cols; col++) {
                //If something is valid, then somewhere there is a ship that exists and isn't guessed. So hasLost is false.
                if (grid[row][col].isValid()) return false;
            }
        }

        //You've lost
        return true;
    }

    public void printGridStatus() {
        //Cols head
        System.out.print("  ");
        //For each col head
        for (int headCol = 0; headCol < cols; headCol++) {
            //Print col head and space
            System.out.print(headers[1][headCol] + " ");
        }
        //Print ln
        System.out.println();

        //For each row
        for (int row = 0; row < rows; row++) {
            //Print row head and space
            System.out.print(headers[0][row] + " ");
            //For each col
            for (int col = 0; col < cols; col++) {
                //Print ship status and space
                System.out.print(grid[row][col].getStatus().getValue() + " ");
            }
            //Print ln
            System.out.println();
        }

        //Print ln
        System.out.println();
        //Print ln
        System.out.println();
    }

    public void printShips() {
        //Cols head
        System.out.print("  ");
        //For each col head
        for (int headCol = 0; headCol < cols; headCol++) {
            //Print col head and space
            System.out.print(headers[1][headCol] + " ");
        }
        //Print ln
        System.out.println();

        //For each row
        for (int row = 0; row < rows; row++) {
            //Print row head and space
            System.out.print(headers[0][row] + " ");
            //For each col
            for (int col = 0; col < cols; col++) {
                //If ship exists
                if (grid[row][col].hasShip()) {
                    if (grid[row][col].getStatus() == Guess.HIT) {
                        //If hit, !
                        System.out.print("! ");
                    } else {
                        //Else X
                        System.out.print("X ");
                    }
                } else {
                    //Else -
                    System.out.print("- ");
                }
            }
            //Print ln
            System.out.println();
        }
        //Print ln
        System.out.println();
        //Print ln
        System.out.println();
    }

    public void fillShips() {
        //Store iterations
        int iterations = 0;
        //For each iteration, <  5
        for (int i = 0; i < 5; i++) {
            //Create ship
            Ship thisShip;
            //For each ship type, create ship of appropriate length
            if (i == 0) {
                //l2 ship
                thisShip = new Ship(2);
            } else if (i == 1 || i == 2) {
                //l3 ship
                thisShip = new Ship(3);
            } else if (i == 3) {
                //l4 ship
                thisShip = new Ship(4);
            } else {
                //l5 ship
                thisShip = new Ship(5);
            }
            //Set random direction and random pos
            thisShip.setDirection(randomDirection());
            thisShip.setRow(randomPos());
            thisShip.setCol(randomPos());

            //If can't place (out of bounds, overlapping)
            if (!canPlaceShip(thisShip)) {
                //-1 from i (because end of for loop will increment, so this keeps at current iteration)
                i--;
                //Continue to next iteration (this same iteration because of i--)
                continue;
            }
            //Add ship to grid
            addShip(thisShip);
        }
    }

    public Guess makeRandomGuess() {
        //Random pos
        int row = randomPos();
        int col = randomPos();

        //While row, col are already guessed, keep generating new row, col
        while (alreadyGuessed(row, col)) {
            row = randomPos();
            col = randomPos();
        }

        //Make guess at row, col and return Guess
        return makeGuess(row, col);
    }

    private Directions randomDirection() {
        //Random number 0-1
        int r = (int) (Math.random() * 2);
        //If 1, horizontal
        if (r == 1) return Directions.HORIZONTAL;
        //Else vertical
        else return Directions.VERTICAL;
    }

    private int randomPos() {
        //Random number 0-9
        return (int) (Math.random() * 10);
    }
}
