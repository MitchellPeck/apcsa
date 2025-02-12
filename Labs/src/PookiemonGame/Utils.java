package PookiemonGame;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import java.util.Scanner;

public class Utils {
    Random Random = new Random();

    public static Pookiemon createPookiemon(Scanner i) {
        String name = getValidEntry("Please enter your Pookiemon's name:", 0, i);
        int typesLen = Types.values().length;
        System.out.println("Here are a list of available Pookiemon types:");
        for (int l = 0; l < typesLen; l++) {
            System.out.println(l + 1 + ": " + Types.values()[l]);
        }
        int typeNum = getValidEntry("Please enter 1 - " + typesLen + " for your Pookiemon's type:", 2, i, 1, typesLen);
        Types type = Types.values()[typeNum - 1];
        int speed = getValidEntry("Please enter your Pookiemon's speed:", 3, i, 1, 255);
        int health = getValidEntry("Please enter your Pookiemon's health:", 3, i, 1, 255);
        int attack = getValidEntry("Please enter your Pookiemon's attack:", 3, i, 1, 255);
        int defense = getValidEntry("Please enter your Pookiemon's defense:", 3, i, 1, 255);
        return new Pookiemon(type, name, speed, health, attack, defense);
    }

    public static String getValidEntry(String prompt, int lengthLimit, Scanner i) {
        //While input isn't valid
        while (true) {
            //Print prompt
            System.out.println(prompt);
            //Get response
            String input = i.nextLine();
            //If empty or invalid length
            if (input.isEmpty() || (input.length() > lengthLimit && lengthLimit > 0)) {
                //Print error
                System.out.println("Oops, that's not a valid input. Please try again.");
                //Continue to next iteration
                continue;
            }
            //Return input
            return input;
        }
    }

    //Get valid entry with prompt, length, min, and max string values (for compareTo)
    public static String getValidEntry(String prompt, int lengthLimit, Scanner i, String min, String max) {
        //While input isn't valid
        while (true) {
            //Print prompt
            System.out.println(prompt);
            //Get response
            String input = i.nextLine().toUpperCase();
            //If empty or invalid length
            if (input.isEmpty() || input.length() > lengthLimit) {
                //Print error
                System.out.println("Oops, that's not a valid input. Please try again.");
                //Continue to next iteration
                continue;
            }
            //If outside of min/max
            if (input.compareTo(min) < 0 || input.compareTo(max) > 0) {
                //Print error
                System.out.println("Oops, that's not a valid input. Please try again.");
                //Continue to next iteration
                continue;
            }
            //Return input
            return input;
        }
    }

    //Get valid entry with prompt, length, min and max int values (for comparison)
    public static int getValidEntry(String prompt, int lengthLimit, Scanner i, int min, int max) {
        //While input isn't valid
        while (true) {
            //Print prompt
            System.out.println(prompt);
            //Get response
            String input = i.nextLine();
            //If empty or invalid length
            if (input.isEmpty() || input.length() > lengthLimit) {
                //Print error
                System.out.println("Oops, that's not a valid input. Please try again.");
                //Continue to next iteration
                continue;
            }
            //If outside of min/max
            if (Integer.parseInt(input) < min || Integer.parseInt(input) > max) {
                //Print error
                System.out.println("Oops, that's not a valid input. Please try again.");
                //Continue to next iteration
                continue;
            }
            //Return input
            return Integer.parseInt(input);
        }
    }


    public void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static class Random {
        public static double number() {
            return Math.random();
        }

        public static int number(int min, int max) {
            return (int) ((Math.random() * max) + min);
        }

        public static boolean bool() {
            return (int)(Math.random()*2) == 0;
        }
    }
}
