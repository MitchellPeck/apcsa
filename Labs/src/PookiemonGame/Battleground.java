package PookiemonGame;

import PookiemonGame.Pookiemon.PookiemonList;
import PookiemonGame.PookiemonClasses.Pookiemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Battleground {
    private ArrayList<Player> players;
    private Player player;
    Scanner i = new Scanner(System.in);
    PookiemonList pList = new PookiemonList();

    public Battleground() {
        players = new ArrayList<Player>();
    }

    private void addPlayer(Player player) {
        players.add(player);
        if (players.size() == 1 || player == null) player = players.getFirst();
    }

    private void removePlayer(Player player) {
        players.remove(player);
        if (players.isEmpty()) player = null;
    }

    private void removePlayer(int index) {
        players.remove(index);
        if (players.isEmpty()) player = null;
    }

    private void setPlayer(int index) {
        player = players.get(index);
    }

    private void nextPlayer() {
        if (players.size() < 2) return;
        if (player == players.getLast()) player = players.getFirst();
        else player = players.get(players.indexOf(player) + 1);
    }

    private Player getOpponent() {
        if (players.size() < 2) return null;
        if (player == players.getLast()) return players.getFirst();
        else return players.get(players.indexOf(player) + 1);
    }

    public void play() {
        System.out.println("Welcome to Pookiemon!");

        int response = Utils.getValidEntry("Would you like to play (1) by yourself against a computer or (2) with a friend?", 1, i, 1, 2);
        if (response == 1) {
            System.out.println("Lonely!");
            Player player = createPlayer();
        }
    }

    public Player createPlayer() {
        String name = Utils.getValidEntry("Please enter your name:", 255, i);
        System.out.println("Here's a list of Pookiemon:");
        pList.listPookiemon();
        int count = 0;
        Pookiemon[] list = new Pookiemon[5];
        while (count < 5) {
            String pookiemonName = Utils.getValidEntry("Please enter the name of a Pookiemon to add to your list.", 255, i);
            Pookiemon pookiemon = pList.findPookiemonByName(pookiemonName);
            if (pookiemon == null) {
                System.out.println("Sorry, couldn't find that one. Please try again.");
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
        Pookiemon selected;
        while (true) {
            String selectedName = Utils.getValidEntry("Please enter the name of the Pookiemon that you'd like to start battle with.", 255, i);
            selected = pList.findPookiemonByName(selectedName);
            boolean valid = false;
            count = 0;
            while (count < list.length && !valid) {
                if (list[count] == selected) valid = true;
                else count ++;
            }
            if (selected == null || !valid) {
                System.out.println("Sorry, couldn't find that one. Please try again.");
                continue;
            }
            break;
        }
        return new Player(name, true, list, selected);
    }
}
