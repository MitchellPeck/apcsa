package PookiemonGame.PlayerClasses;

import java.util.ArrayList;

public class Players {
    private ArrayList<Player> players;

    public Players(ArrayList<Player> players) {
        this.players = new ArrayList<>();
        this.players = players;
    }

    public Player winningPlayer() {
        for (int i = 0; i<players.size(); i++) {
            if (players.get(i).getWins() >= 6) return players.get(i);
        }
        return null;
    }
}
