//Mitchell Peck
//10/11/24
//Hangman Coding Project

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        game();
    }
    public static void game() {
        HangmanASCII man = new HangmanASCII();
        Scanner i = new Scanner(System.in);

        System.out.println("Welcome to hangman! You have to guess the mystery word in five guesses or less.");
        System.out.println("Try not to get all your limbs!");
        System.out.println();
        man.show();

        System.out.println();

        String word = WordChooser.getWord();
        WordManager m = new WordManager(word);

        while (true) {
            System.out.println("Here's what you have so far: " + m.current());
            System.out.println("You have " + m.guesses() + " guesses left.");
            System.out.println("Here are the letters you have guessed so far: " + m.letters());

            System.out.print("What letter would you like to guess next?");
            String thisGuess = "";

            while (true) {
                String g = i.nextLine();
                if (!Character.isLetter(g.charAt(0)) && !g.equals(" ")) {
                    System.out.println("Sorry, please enter a valid letter.");
                } else {
                    thisGuess = g;
                    break;
                }
            }

            boolean correct = m.guess(thisGuess);
            if (correct) System.out.println("Correct!");
            else {
                System.out.println("Sorry, that's not correct.");
                man.add();
            }
            System.out.println();
            man.show();
            int g = m.guesses();
            if (g == 0) {
                System.out.println("Hangman! You're out of guesses.");
                System.out.println("The word was " + m.finalWord() + ".");
                System.out.println("Want to play again? (yes or no)");
                String response = i.nextLine().toLowerCase();
                if (response.equals("no")) break;
                else game();
            }
            boolean solved = m.solved();
            if (solved) {
                System.out.println("You got it!");
                System.out.println("The word was " + m.finalWord() + ".");
                System.out.println("Want to play again? (yes or no)");
                String response = i.nextLine().toLowerCase();
                if (response.equals("no")) break;
                else game();
            }
        }
    }
}


