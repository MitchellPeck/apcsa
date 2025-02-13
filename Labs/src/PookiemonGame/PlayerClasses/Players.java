package PookiemonGame.PlayerClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Players {
    private ArrayList<Player> players;

    public Players(Player[] players) {
        this.players = new ArrayList<>();
        this.players.addAll(Arrays.asList(players));
    }

    public Player winningPlayer() {
        for (Player player : players) {
            if (player.getWins() >= 6) return player;
        }
        return null;
    }

    public int getSize() {
        return players.size();
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }

    public ArrayList<Player> getList() {
        return players;
    }
}
