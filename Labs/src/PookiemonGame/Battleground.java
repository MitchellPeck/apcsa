package PookiemonGame;

import PookiemonGame.PlayerClasses.Player;
import PookiemonGame.PlayerClasses.Players;
import PookiemonGame.Pookiemon.PookiemonList;
import PookiemonGame.PookiemonClasses.Pookiemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Battleground {
    private Player player;
    private Players playersList;
    Scanner i = new Scanner(System.in);
    PookiemonList pList = new PookiemonList();

    public Battleground() {}

    private void setPlayer(int index) {
        player = playersList.getPlayer(index);
    }

    private void nextPlayer() {
        if (playersList.getSize() < 2) return;
        if (player == playersList.getList().getLast()) player = playersList.getList().getFirst();
        else player = playersList.getPlayer(playersList.getList().indexOf(player) + 1);
    }

    private Player getOpponent() {
        if (playersList.getSize() < 2) return null;
        if (player == playersList.getList().getLast()) return playersList.getList().getFirst();
        else return playersList.getPlayer(playersList.getList().indexOf(player) + 1);
    }

    public void play() {
        System.out.println("Welcome to Pookiemon!");

        Player[] playerList;

        int response = Utils.getValidEntry("Would you like to play (1) by yourself against a computer or (2-4) with a friend(s)?", 1, i, 1, 4);
        if (response == 1) {
            playerList = new Player[2];
            System.out.println("Lonely!");
            Player player1 = Utils.createPlayer(i);
            playerList[0] = player1;
            player = player1;
            Pookiemon[] list = Utils.randomList();
            Player player2 = new Player("Computer", false, list, Utils.randomPookiemon(list));
            playerList[1] = player2;
        } else {
            playerList = new Player[response];
            for (int i=0; i<response; i++) {
                System.out.println("Player " + (i+1) + ", let's create your player.");
                Player player = Utils.createPlayer(this.i);
                playerList[i] = player;
                if (i == 0) this.player = player;
            }
        }
        playersList = new Players(playerList);

        System.out.println("Let's play!");

        while (playersList.winningPlayer() == null) {
            System.out.println(player.getName() + ", it's your turn!");
            System.out.println("You'll be fighting against " + getOpponent().getName());
        }
    }
}
