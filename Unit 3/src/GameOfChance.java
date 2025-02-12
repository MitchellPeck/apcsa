import java.util.Scanner;

public class GameOfChance {
    public static void main(String[] args) {
        //Introduction
        System.out.println("Welcome to the Game of Chance!");
        System.out.println("This is our game of chance.");
        System.out.println("Let's see if you can win...");

        //Scanner instantiation
        Scanner i = new Scanner(System.in);

        //Asking user for guess on dice roll and saving value
        System.out.println("What is your guess on the dice roll?");
        int diceGuess = i.nextInt();
        i.nextLine();

        while (diceGuess > 6 || diceGuess < 1) {
            System.out.println("Error: Dice roll out of bounds.");
            System.out.println("What is your guess on the dice roll?");
            diceGuess = i.nextInt();
            i.nextLine();
        }

        //Asking user for guess on coin flip and saving value
        System.out.println("What is your guess on the coin flip, Heads (H) or Tails (T)?");
        String coinGuess = i.nextLine();

        while (!coinGuess.equals("H") && !coinGuess.equals("T")) {
            System.out.println("Error: Invalid coin flip guess.");
            System.out.println("What is your guess on the coin flip, Heads (H) or Tails (T)?");
            coinGuess = i.nextLine();
            if (!coinGuess.equals("H") && !coinGuess.equals("T")) {
                System.out.println("Error: Invalid coin flip guess. No more guesses for you!");
            }
        }

        //Asking user for spinner color guess
        System.out.println("What is your guess on the spinner color, red (r), green (g), blue (b), or yellow (y)?");
        String spinnerGuess = i.nextLine();

        while (!spinnerGuess.equals("r") && !spinnerGuess.equals("g") && !spinnerGuess.equals("b") && !spinnerGuess.equals("y")) {
            System.out.println("Error: Invalid spinner color guess.");
            System.out.println("What is your guess on the spinner color, red (r), green (g), blue (b), or yellow (y)?");
            spinnerGuess = i.nextLine();
            if (!spinnerGuess.equals("r") && !spinnerGuess.equals("g") && !spinnerGuess.equals("b") && !spinnerGuess.equals("y")) {
                System.out.println("Error: Invalid spinner color guess. No more guesses for you!");
            }
        }

        //Generating random results for each
        int diceRoll = (int) Math.floor(Math.random() * 6) + 1;
        double coinFlipNum = Math.floor(Math.random() * 2) + 1;
        String coinFlip = "";
        if (coinFlipNum == 1) {
            coinFlip = "H";
        } else {
            coinFlip = "T";
        }
        double spinnerColorNum = Math.floor(Math.random() * 4) + 1;
        String spinnerColor = "";
        if (spinnerColorNum == 1) {
            spinnerColor = "r";
        } else if (spinnerColorNum == 2) {
            spinnerColor = "g";
        } else if (spinnerColorNum == 3) {
            spinnerColor = "b";
        } else {
            spinnerColor = "y";
        }
        String spinnerFancyColor = "";
        if (spinnerColor.equals("r")) {
            spinnerFancyColor = "red";
        } else if (spinnerColor.equals("g")) {
            spinnerFancyColor = "green";
        } else if (spinnerColor.equals("b")) {
            spinnerFancyColor = "blue";
        } else {
            spinnerFancyColor = "yellow";
        }

        //Printing results
        System.out.println("You rolled a " + diceRoll);
        System.out.println("You flipped " + (coinFlip.equals("H") ? "heads" : "tails"));
        System.out.println("You spun " + spinnerFancyColor);

        //Storing the guesses that the user got correct
        boolean diceCorrect = diceGuess == diceRoll;
        boolean coinCorrect = coinGuess.equals(coinFlip);
        boolean spinnerCorrect = spinnerGuess.equals(spinnerColor);

        //Printing the results of the user's guesses
        if (diceCorrect) {
            System.out.println("You got the dice roll correct.");
        } else if (coinCorrect) {
            System.out.println("You got the coin flip correct.");
        } else if (spinnerCorrect) {
            System.out.println("You got the spinner color correct.");
        } else if (diceCorrect && coinCorrect) {
            System.out.println("You got the dice roll and coin flip correct!");
        } else if (coinCorrect && spinnerCorrect) {
            System.out.println("You got the coin flip and spinner color correct!");
        } else if (diceCorrect && spinnerCorrect) {
            System.out.println("You got the dice roll and spinner color correct!");
        } else if (diceCorrect && coinCorrect && spinnerCorrect) {
            System.out.println("You got the dice roll, coin flip, and spinner color correct!!");
        } else {
            System.out.println("Somehow you didn't get anything right... bruh");
        }
    }
}