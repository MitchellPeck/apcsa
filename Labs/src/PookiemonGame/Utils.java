package PookiemonGame;

import PookiemonGame.PlayerClasses.Player;
import PookiemonGame.Pookiemon.PookiemonList;
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
        return new Pookiemon(new Types[]{type}, name, speed, health, attack, defense);
    }

    public static Player createPlayer(Scanner i) {
        PookiemonList pList = new PookiemonList();
        String name = Utils.getValidEntry("Please enter your name:", 255, i);
        System.out.println("Here's a list of Pookiemon:");
        pList.listPookiemon();
        int count = 0;
        Pookiemon[] list = new Pookiemon[5];
        Pookiemon selected;
        String rand = Utils.getValidEntry("Do you want to (M)anually select your Pookiemon or (A)utomatically select them?", 1, i, "A", "M");
        if (rand.equals("M")) {
            while (count < 5) {
                String pookiemonName = Utils.getValidEntry("Please enter the name of a Pookiemon to add to your list.", 255, i);
                Pookiemon pookiemon = pList.findPookiemonByName(pookiemonName);
                boolean exists = false;
                int lCount = 0;
                while (!exists && lCount < list.length) {
                    if (pookiemon == list[lCount]) exists = true;
                    else lCount++;
                }
                if (pookiemon == null) {
                    System.out.println("Sorry, couldn't find that one. Please try again.");
                    continue;
                }
                if (exists) {
                    System.out.println("You already added that one, please choose a different Pookiemon!");
                    continue;
                }
                list[count] = pookiemon;
                if (count < 4) {
                    System.out.println("Great! Now let's add " + (5 - count - 1) + " more.");
                    count++;
                } else {
                    count++;
                }
            }
            while (true) {
                String selectedName = Utils.getValidEntry("Please enter the name of the Pookiemon that you'd like to start battle with.", 255, i);
                selected = pList.findPookiemonByName(selectedName);
                boolean valid = false;
                count = 0;
                while (count < list.length && !valid) {
                    if (list[count] == selected) valid = true;
                    else count++;
                }
                if (selected == null || !valid) {
                    System.out.println("Sorry, couldn't find that one. Please try again.");
                    continue;
                }
                break;
            }
        }
        else {
            list = randomList();
            selected = randomPookiemon(list);
        }
        return new Player(name, true, list, selected);
    }

    public static Pookiemon[] randomList() {
        PookiemonList pList = new PookiemonList();
        Pookiemon[] list = new Pookiemon[5];
        for (int i = 0; i < 5; i++) {
            int n = (int) (Math.random() * pList.getList().size());
            list[i] = pList.getList().get(n);
        }
        return list;
    }

    public static Pookiemon randomPookiemon(Pookiemon[] list) {
        int n = (int) (Math.random() * list.length);
        return list[n];
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
            return (int) (Math.random() * 2) == 0;
        }
    }
}
