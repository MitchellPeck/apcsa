/* Mitchell Peck
 * Completed 1/16/25
 * AP CSA U7 Coding Project
 */

import java.util.ArrayList;
import java.util.Scanner;

public class FriendsList {
    public static void main(String[] args) {
        //Instantiate friends ArrayList
        ArrayList<Friend> friends = new ArrayList<Friend>();

        //Print welcome message and instructions
        System.out.println("Welcome!");
        System.out.println("Let's enter your friends in the system!");
        System.out.println("When you are ready to stop entering friends, put a \"z\" for the first or last name entry, which won't be added to your list.");

        //Instantiate scanner
        Scanner i = new Scanner(System.in);

        //While loop for adding friends to friends ArrayList
        while (true) {
            //Instantiate the first name, last name, and age
            String fName = "";
            String lName = "";
            int age;

            //Loop through asking the user for the first name until valid input is provided
            while (true) {
                //Ask the user for the first name
                System.out.print("First Name or Full Name, separated by spaces: ");
                fName = i.nextLine();
                boolean isInvalid = false;
                //Check each character to make sure there aren't any illegal characters
                for (int n = 0; n < fName.length(); n++) {
                    if (Character.isDigit(fName.charAt(n))) {
                        //If illegal character is found, print message, break the loop, and set isInvalid to true
                        System.out.println("Oops, you can't put a number there... Try again!");
                        isInvalid = true;
                        break;
                    }
                }
                //If isInvalid is true, go back to the start of the while loop to ask user for first name
                if (isInvalid) continue;
                //If user entered first and last name, split them and assign the fName and lName Strings
                if (fName.contains(" ")) {
                    String[] f = fName.split(" ");
                    fName = f[0];
                    lName = f[1];
                }
                break;
            }
            //If user entered "z" for first name, break while loop for inputting friends
            if (fName.equals("z")) break;
            //Loop through asking the user for the last name until valid input is provided
            while (true) {
                //If last name is already filled, break the while loop and skip to age
                if (!lName.isEmpty()) break;
                //Ask the user for the last name
                System.out.print("Last Name: ");
                lName = i.nextLine();
                boolean isInvalid = false;
                //Check each character to make sure there aren't any illegal characters
                for (int n = 0; n < lName.length(); n++) {
                    if (Character.isDigit(lName.charAt(n))) {
                        //If illegal character is found, print message, break the loop, and set isInvalid to true
                        System.out.println("Oops, you can't put a number there... Try again!");
                        isInvalid = true;
                        break;
                    }
                }
                //If isInvalid is true, go back to the start of the while loop to ask user for last name
                if (isInvalid) continue;
                break;
            }
            //If user entered "z" for last name, break while loop for inputting friends
            if (lName.equals("z")) break;
            //Loop through asking the user for the age until valid input is provided
            while (true) {
                //Ask the user for the age
                System.out.print("Age: ");
                String ageString = i.nextLine();
                boolean isInvalid = false;
                //Check each character to make sure there aren't any illegal characters
                for (int n = 0; n < ageString.length(); n++) {
                    if (Character.isAlphabetic(ageString.charAt(n))) {
                        //If illegal character is found, print message, break the loop, and set isInvalid to true
                        System.out.println("Oops, you can't put a letter there... Try again!");
                        isInvalid = true;
                        break;
                    }
                }
                //If isInvalid is true, go back to the start of the while loop to ask user for age
                if (isInvalid) continue;
                //Set age int to parsed string
                age = Integer.parseInt(ageString);
                break;
            }
            //Add new friend to friends ArrayList
            friends.add(new Friend(fName, lName, age));
        }

        //Print out the number of friends entered
        System.out.println("You have entered " + friends.size() + " friends.");

        //Print out the list of friends
        System.out.println("Here is your list of friends:");
        for (int n = 0; n < friends.size(); n++) {
            int thisIndex = n + 1;
            System.out.println(thisIndex + ". " + friends.get(n));
        }

        //boolean to keep while loop running unless 7 is entered
        boolean run = true;

        //Continue running while run is true
        while (run) {
            int selection = 0;
            //Loop through asking the user for the selection until valid input is provided
            while (true) {
                //Ask the user for the selection
                System.out.println("Choose from the following items: \n1. Sort by First Name \n2. Sort by Last Name\n3. Sort by Age\n4. Randomly Shuffle List\n5. Find the Oldest\n6. Find the Average Age\n7. Quit");
                String selString = i.nextLine();
                boolean isInvalid = false;
                //Check each character to make sure there aren't any illegal characters
                for (int n = 0; n < selString.length(); n++) {
                    if (Character.isAlphabetic(selString.charAt(n))) {
                        //If illegal character is found, print message, break the loop, and set isInvalid to true
                        System.out.println("Oops, you can't put a letter there... Try again!");
                        isInvalid = true;
                        break;
                    }
                }
                //If isInvalid is true, go back to the start of the while loop to ask user for selection
                if (isInvalid) continue;
                //Set selection int to parsed string
                selection = Integer.parseInt(selString);
                break;
            }

            //Switch cases for selections
            switch (selection) {
                case 1:
                    //For every value in the friends list, find the first name whose first letter comes before the current first letter and swap the two friends
                    for (int s=0; s<friends.size()-1; s++) {
                        //The index of the current first name
                        int minIndex = s;
                        //For every value in the friends list after the current value, compare the first letter of the two first names. If the indexed friend's first name
                        //comes before the current friend's first name, set the minIndex to that index
                        for (int k=s+1; k<friends.size(); k++) {
                            if (friends.get(k).getFirstName().compareToIgnoreCase(friends.get(minIndex).getFirstName()) < 0) {
                                minIndex = k;
                            }
                        }
                        //Swap the friends
                        Friend temp = friends.get(s);
                        friends.set(s, friends.get(minIndex));
                        friends.set(minIndex, temp);
                    }
                    for (Friend friend : friends) {
                        //Print friends list
                        System.out.println(friend);
                    }
                    break;
                case 2:
                    //For every value in the friends list, find the last name whose first letter comes before the current first letter and swap the two friends
                    for (int s=0; s<friends.size()-1; s++) {
                        //The index of the current last name
                        int minIndex = s;
                        //For every value in the friends list after the current value, compare the first letter of the two last names. If the indexed friend's last name
                        //comes before the current friend's last name, set the minIndex to that index
                        for (int k=s+1; k<friends.size(); k++) {
                            if (friends.get(k).getFirstName().compareToIgnoreCase(friends.get(minIndex).getFirstName()) > 0) {
                                minIndex = k;
                            }
                        }
                        //Swap the friends
                        Friend temp = friends.get(s);
                        friends.set(s, friends.get(minIndex));
                        friends.set(minIndex, temp);
                    }
                    //Print the friends list
                    for (Friend friend : friends) {
                        System.out.println(friend);
                    }
                    break;
                case 3:
                    //For every value in the friends list, find the age which is smaller than the current age and swap the two friends
                    for (int s=1; s<friends.size(); ++s) {
                        //The current friend
                        Friend thisFriend = friends.get(s);
                        int j = s-1;

                        //Find the next friend with a smaller age and insert it after the current friend
                        while (j >= 0 && friends.get(j).getAge() > thisFriend.getAge()) {
                            friends.set(j+1, friends.get(j));
                            j--;
                        }
                        //Move the current friend back one
                        friends.set(j+1, thisFriend);
                    }
                    //Print the friends list
                    for (Friend friend : friends) {
                        System.out.println(friend);
                    }
                    break;
                case 4:
                    //For each item in friends list, generate a random position to move it to, and move that position's friend to the current position
                    for (int n=0; n<friends.size(); n++) {
                        //Generate a random position
                        int newPos = (int)(Math.random()*friends.size());
                        //Store the friend at the new position in a temporary value
                        Friend temp = friends.get(newPos);
                        //Move the current friend to the new position
                        friends.set(newPos, friends.get(n));
                        //Set the stored friend in the current position
                        friends.set(n, temp);
                    }
                    //Print the friends list
                    for (Friend friend : friends) {
                        System.out.println(friend);
                    }
                    break;
                case 5:
                    //Store the index of the oldest friend
                    int oldestIndex = 0;
                    //For each friend, if their age is greater than the age of the friend stored at the oldestIndex, replace the oldestIndex with the current index
                    for (int n=0; n<friends.size(); n++) {
                        if (friends.get(n).getAge() > friends.get(oldestIndex).getAge()) oldestIndex = n;
                    }
                    //Print out the oldest friend's information
                    System.out.println("Your oldest friend is " + friends.get(oldestIndex));
                    break;
                case 6:
                    //Store the sum of the ages
                    int sum = 0;
                    //For each friend, add their age to the age sum
                    for (int n=0; n<friends.size(); n++) {
                        sum += friends.get(n).getAge();
                    }
                    //Average the ages by dividing the sum by the size of the friends list
                    double avg = (double)sum/friends.size();
                    //Print out the average age of friends
                    System.out.println("The average age of your friends is " + avg);
                    break;
                case 7:
                    //Set run to false so the while loop is escaped
                    run = false;
                    break;
            }
        }

        //Ending message
        System.out.println("Thank you. Goodbye!");
    }
}
