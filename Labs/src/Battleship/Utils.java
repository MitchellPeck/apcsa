package Battleship;

import Battleship.Enums.Directions;
import Battleship.Enums.Rows;

import java.util.Optional;
import java.util.Scanner;

public class Utils {
    //Get valid entry with prompt and length
    public static String getValidEntry(String prompt, int lengthLimit, Scanner i) {
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
    public static String getValidEntry(String prompt, int lengthLimit, Scanner i, int min, int max) {
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
            return input;
        }
    }

    //Prompt for ship position
    public static int[] getShipPos(Scanner i) {
        //Get row input
        String rowString = getValidEntry("Please enter the row A-J that you'd like your ship to start.", 1, i, "A", "J");
        //Get row numeric value
        Optional<Rows> optionalRow = Rows.byName(rowString);
        //Check if exists
        boolean rowExists = optionalRow.isPresent();
        int row = -1;
        //If exists, set row
        if (rowExists) {
            row = optionalRow.get().getValue();
        }
        //Get col input
        int col = Integer.parseInt(getValidEntry("Please enter the column 1-10 that you'd like your ship to start.", 2, i, 1, 10)) - 1;
        //Return row, col
        return new int[]{row, col};
    }

    //Prompt for target position
    //Same as above getShipPos(), just different prompt phrasing
    public static int[] getTargetPos(Scanner i) {
        String rowString = getValidEntry("Please enter the row A-J that you'd like to target.", 1, i, "A", "J");
        Optional<Rows> optionalRow = Rows.byName(rowString);
        boolean rowExists = optionalRow.isPresent();
        int row = -1;
        if (rowExists) {
            row = optionalRow.get().getValue();
        }
        int col = Integer.parseInt(getValidEntry("Please enter the column 1-10 that you'd like to target.", 2, i, 1, 10)) - 1;
        return new int[]{row, col};
    }

    //Prompt for ship direction
    public static Directions getShipDirection(Scanner i) {
        //While invalid input
        while (true) {
            //Get input
            String entry = getValidEntry("Please enter the direction that you'd like your ship to be rotated, horizontal or vertical.", 10, i);
            if (entry.toLowerCase().equals("horizontal".substring(0, entry.length()))) {
                //If equals part or all of horizontal
                //Return horizontal
                return Directions.HORIZONTAL;
            } else if (entry.toLowerCase().equals("vertical".substring(0, entry.length()))) {
                //Else if equals part or all of vertical
                //Return vertical
                return Directions.VERTICAL;
            }
            //Print error
            System.out.println("Ooops, that's not a valid input. Please try again.");
        }
    }
}
