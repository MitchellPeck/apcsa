import java.util.Scanner;

public class GameOfChanceRevisited {

    public static double depositMoney() {
        Scanner i = new Scanner(System.in);
        System.out.println("How much would you like to deposit?");
        return i.nextDouble();
    }

    public static String play() {
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
        String spinnerFancyColor = switch (spinnerColor) {
            case "r" -> "red";
            case "g" -> "green";
            case "b" -> "blue";
            default -> "yellow";
        };

        //Printing results
        System.out.println("You rolled a " + diceRoll);
        System.out.println("You flipped " + (coinFlip.equals("H") ? "heads" : "tails"));
        System.out.println("You spun " + spinnerFancyColor);

        //Storing the guesses that the user got correct
        boolean diceCorrect = diceGuess == diceRoll;
        boolean coinCorrect = coinGuess.equals(coinFlip);
        boolean spinnerCorrect = spinnerGuess.equals(spinnerColor);

        //Printing the results of the user's guesses

        if (diceCorrect && coinCorrect && spinnerCorrect) {
            System.out.println("You got the dice roll, coin flip, and spinner color correct!!");
            return "3";
        } else if (diceCorrect && spinnerCorrect) {
            System.out.println("You got the dice roll and spinner color correct!");
            return "2";
        } else if (coinCorrect && spinnerCorrect) {
            System.out.println("You got the coin flip and spinner color correct!");
            return "2";
        } else if (diceCorrect && coinCorrect) {
            System.out.println("You got the dice roll and coin flip correct!");
            return "2";
        } else if (diceCorrect) {
            System.out.println("You got the dice roll correct.");
            return "dice";
        } else if (coinCorrect) {
            System.out.println("You got the coin flip correct.");
            return "coin";
        } else if (spinnerCorrect) {
            System.out.println("You got the spinner color correct.");
            return "spinner";
        } else {
            System.out.println("Somehow you didn't get anything right... bruh");
            return "0";
        }
    }

    public static void main(String[] args) {
        //Introduction
        System.out.println("*****WELCOME*****");

        Bank bank = new Bank();

        Scanner i = new Scanner(System.in);

        while (true) {
            double bal = bank.getBalance();
            System.out.println("You have $" + bal + " in your bank");
            System.out.println("Please choose one of the following options:");
            System.out.println("(1) Deposit money into the bank");
            System.out.println("(2) Play the game!");
            System.out.println("(3) Quit the game.");

            int choice = i.nextInt();

            if (choice == 1) {
                double deposit = depositMoney();
                Bank.deposit(deposit);
            }
            else if (choice == 2) {
                int bet = 0;
                while (true) {
                    System.out.println("How much would you like to bet?");
                    bet = i.nextInt();
                    if (bet > 0 && bet <= bal) {
                        break;
                    } else {
                        System.out.println("Error, invalid bet. Please try again.");
                        System.out.println("How much would you like to bet?");
                        bet = i.nextInt();
                        if (bet > 0 && bet <= bal) {
                            break;
                        } else {
                            System.out.println("Oops, you were too greedy. There goes your money!");
                            System.exit(0);
                        }
                    }
                }
                Bank.bet(bet);
                String res = play();
                switch (res) {
                    case "3":
                        bet *= 3;
                        Bank.deposit(bet);
                        break;
                    case "2":
                        bet *= 2;
                        Bank.deposit(bet);
                        break;
                    case "dice":
                        Bank.deposit(bet);
                        break;
                    case "coin":
                        bet /= 4;
                        Bank.deposit(bet);
                        break;
                    case "spinner":
                        bet /= 2;
                        Bank.deposit(bet);
                        break;
                }
            } else if (choice == 3) break;
        }

        System.out.println("Thanks for playing!");
        double bal = bank.getBalance();
        System.out.println("You are leaving with $" + bal);
    }
}