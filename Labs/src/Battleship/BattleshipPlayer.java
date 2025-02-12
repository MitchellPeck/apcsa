package Battleship;

import Battleship.Enums.Directions;
import Battleship.Enums.Guess;

import java.util.Scanner;

public class BattleshipPlayer {
    public static void main(String[] args) {
        //Scanner
        Scanner i = new Scanner(System.in);
        //Player grid
        Grid playerGrid = new Grid();
        //Computer Grid
        Grid computerGrid = new Grid();

        //Welcome
        System.out.println("Welcome to Battleship!");
        System.out.println("It's time to place your ships.");

        //While player hasn't confirmed ship locations
        while (true) {
            //While ships aren't placed
            while (true) {
                //Prompt ship placement option
                System.out.println("Would you like to (A)utomatically generate your ships, or (M)anually input them yourself?");
                //Decision
                String fillDecision = i.nextLine();
                //If decision is a for auto, fill ships and break inner while loop
                if (fillDecision.equalsIgnoreCase("a")) {
                    System.out.println("Generating your ships...");
                    playerGrid.fillShips();
                    break;
                } else if (fillDecision.equalsIgnoreCase("m")) {
                    //For each ship to place
                    for (int placeShips = 0; placeShips < 5; placeShips++) {
                        //Print existing ship
                        playerGrid.printShips();
                        //Create this ship
                        Ship thisShip;
                        //For each ship type, print respective prompt and get location and direction using utils
                        if (placeShips == 0) {
                            //Prompt
                            System.out.println("It's time to place your first ship.");
                            System.out.println("This ship is of length two.");
                            //Get row, col
                            int[] pos = Utils.getShipPos(i);
                            //Get dir
                            Directions dir = Utils.getShipDirection(i);
                            //Update current ship
                            thisShip = new Ship(2, pos[0], pos[1], dir);
                        } else if (placeShips == 1) {
                            System.out.println("It's time to place your second ship.");
                            System.out.println("This ship is of length three.");
                            int[] pos = Utils.getShipPos(i);
                            Directions dir = Utils.getShipDirection(i);
                            thisShip = new Ship(3, pos[0], pos[1], dir);
                        } else if (placeShips == 2) {
                            System.out.println("It's time to place your third ship.");
                            System.out.println("This ship is of length three.");
                            int[] pos = Utils.getShipPos(i);
                            Directions dir = Utils.getShipDirection(i);
                            thisShip = new Ship(3, pos[0], pos[1], dir);
                        } else if (placeShips == 3) {
                            System.out.println("It's time to place your fourth ship.");
                            System.out.println("This ship is of length four.");
                            int[] pos = Utils.getShipPos(i);
                            Directions dir = Utils.getShipDirection(i);
                            thisShip = new Ship(4, pos[0], pos[1], dir);
                        } else {
                            System.out.println("It's time to place your fifth ship.");
                            System.out.println("This ship is of length three.");
                            int[] pos = Utils.getShipPos(i);
                            Directions dir = Utils.getShipDirection(i);
                            thisShip = new Ship(5, pos[0], pos[1], dir);
                        }

                        //If ship can't be placed (out of bounds, overlapping)
                        if (!playerGrid.canPlaceShip(thisShip)) {
                            //-1 from placeShips (because end of for loop will increment, so this keeps at current iteration)
                            placeShips--;
                            //Print error
                            System.out.println("Oops, a ship can't be placed there. Please make sure there's enough room for your ship to be placed.");
                            //Continue to next iteration (this same iteration because of placeShips--)
                            continue;
                        }

                        //Add ship to player grid
                        playerGrid.addShip(thisShip);
                    }
                    //Break inner while loop after 5 ships added
                    break;
                }
            }

            //Print ships
            System.out.println("Here's your ships.");
            playerGrid.printShips();
            //Prompt for confirmation
            System.out.println("Everything look good?");
            boolean restart = false;
            while (true) {
                System.out.println("(Y)es to continue, (N)o to restart.");
                //Decision
                String restartDecision = i.nextLine();
                //Parse decision
                if (restartDecision.equalsIgnoreCase("y")) {
                    //If yes, break while loop
                    break;
                } else if (restartDecision.equalsIgnoreCase("n")) {
                    //If no, set restart to true (so that while loop isn't broken) and reset player grid
                    restart = true;
                    playerGrid = new Grid();
                    break;
                }
            }
            //If restart is false, break while loop and continue to game
            if (!restart) break;
        }

        //Great!
        System.out.println("Great!");

        //Generate computer ships
        computerGrid.fillShips();
        System.out.println("Your opponent's ships have been placed.");

        System.out.println("It's time to target your opponent's ships!");

        //Loop while neither player has lost
        while (!playerGrid.hasLost() && !computerGrid.hasLost()) {
            //Print guess grid
            System.out.println("Here's your guess grid.");
            computerGrid.printGridStatus();

            //Get target position from utils
            int[] target = Utils.getTargetPos(i);
            //If already guessed, prompt for re-guess
            if (computerGrid.alreadyGuessed(target[0], target[1])) {
                System.out.println("Hmm, you've already made a guess there. Please try again.");
                continue;
            }
            //Make guess & store result in Guess var
            Guess targetGuess = computerGrid.makeGuess(target[0], target[1]);

            //Switch for guess result
            switch (targetGuess) {
                case Guess.MISSED: {
                    //Missed, bummer
                    System.out.println("Oops, you missed.");
                }
                break;
                case Guess.HIT: {
                    //Hit ship
                    System.out.println("Woah, you hit one of their ships!");
                }
                break;
            }

            //Reprint guess grid
            computerGrid.printGridStatus();

            //Computer random guess, store result in Guess var
            System.out.println("Now, your opponent is going to make a guess.");
            Guess systemGuess = playerGrid.makeRandomGuess();

            //Switch for guess result
            switch (systemGuess) {
                case Guess.MISSED: {
                    //Missed, yay!
                    System.out.println("Phew! Your opponent missed your ships.");
                }
                break;
                case Guess.HIT: {
                    //Hit ship, ouch
                    System.out.println("Bummer, one of your ships got hit.");
                    System.out.println("Here's your ships.");
                    //Print player ships
                    playerGrid.printShips();
                }
                break;
            }
        }

        //If player lost
        if (playerGrid.hasLost()) {
            //Womp womp
            System.out.println("Bummer, you lost. Your opponent hit all your ships!");
            System.out.println("Here's your opponent's guesses.");
            //Print grid
            playerGrid.printGridStatus();
        }

        //If computer lost aka player won
        if (computerGrid.hasLost()) {
            //Player won, yahoo
            System.out.println("Woah, you won! You hit all of your opponent's ships!");
            System.out.println("Here's your guesses.");
            //Print grid
            computerGrid.printGridStatus();
        }

        //You must
        System.out.println("Play again soon!");
    }
}
