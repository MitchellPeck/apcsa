package PokemonGame;

import java.util.ArrayList;

public class Battleground {
    private ArrayList<Player> players;
    private Player player;

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
        else player = players.get(players.indexOf(player)+1);
    }

    private Player getOpponent() {
        if (players.size() < 2) return null;
        if (player == players.getLast()) return players.getFirst();
        else return players.get(players.indexOf(player)+1);
    }
}
