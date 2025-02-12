package PookiemonGame;

import PookiemonGame.PlayerClasses.Player;
import PookiemonGame.PlayerClasses.Players;
import PookiemonGame.Pookiemon.PookiemonList;
import PookiemonGame.PookiemonClasses.Pookiemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Battleground {
    private ArrayList<Player> players;
    private Player player;
    private Players playersList;
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

        int response = Utils.getValidEntry("Would you like to play (1) by yourself against a computer or (2-4) with a friend(s)?", 1, i, 1, 4);
        if (response == 1) {
            System.out.println("Lonely!");
            Player player1 = Utils.createPlayer(i);
            players.add(player1);
            player = player1;
            Pookiemon[] list = Utils.randomList();
            Player player2 = new Player("Computer", false, list, Utils.randomPookiemon(list));
            players.add(player2);
        } else {
            for (int i=0; i<response; i++) {
                System.out.println("Player " + (i+1) + ", let's create your player.");
                Player player = Utils.createPlayer(this.i);
                players.add(player);
                if (i == 0) this.player = player;
            }
        }
        playersList = new Players(players);

        System.out.println("Let's play!");

        while (playersList.winningPlayer() == null) {
            System.out.println(player.getName() + ", it's your turn!");
        }
    }
}
