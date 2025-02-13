package PookiemonGame;

import PookiemonGame.Moves.MovesList;
import PookiemonGame.PlayerClasses.Player;
import PookiemonGame.PlayerClasses.Players;
import PookiemonGame.Pookiemon.PookiemonList;
import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import java.util.ArrayList;
import java.util.Scanner;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class Battleground {
    private Player player;
    private Players playersList;
    Scanner i = new Scanner(System.in);
    PookiemonList pList = new PookiemonList();

    public Battleground() {
    }

    private void setPlayer(int index) {
        player = playersList.getPlayer(index);
    }

    private void nextPlayer() {
        if (player == playersList.getList().getLast()) player = playersList.getList().getFirst();
        else player = playersList.getPlayer(playersList.getList().indexOf(player) + 1);
    }

    private Player getOpponent() {
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
            for (int i = 0; i < response; i++) {
                System.out.println("Player " + (i + 1) + ", let's create your player.");
                Player player = Utils.createPlayer(this.i);
                playerList[i] = player;
                if (i == 0) this.player = player;
                Utils.clearScreen();
            }
        }
        playersList = new Players(playerList);

        Utils.clearScreen();

        System.out.println("Let's play!");

        while (playersList.winningPlayer() == null) {
            if (player.getName().equals("Computer")) {
                while (player.getSelectedPookiemon().getHealth() <= 0) {
                    Pookiemon newPookiemon = Utils.randomPookiemonFromList(player.getPookiemon());
                    player.selectPookiemon(newPookiemon);
                }
                boolean swap = Utils.Random.number(1, 10) < 2;
                if (swap) {
                    Pookiemon newPookiemon = Utils.randomPookiemonFromList(player.getPookiemon());
                    player.selectPookiemon(newPookiemon);
                }

                Types moveType = player.getSelectedPookiemon().getTypes()[0];
                MovesList mList = new MovesList();

                int availableCount = 0;
                for (int i = 0; i < mList.getList().size(); i++) {
                    Move move = mList.getList().get(i);
                    if (move.getType() == moveType || move.getType() == NORMAL) {
                        availableCount++;
                    }
                }

                Move[] availableMoves = new Move[availableCount];

                int current = 0;
                for (int i = 0; i < mList.getList().size(); i++) {
                    Move move = mList.getList().get(i);
                    if (move.getType() == moveType || move.getType() == NORMAL) {
                        availableMoves[current] = move;
                        current++;
                    }
                }

                Move move = Utils.randomMoveFromList(availableMoves);

                Pookiemon enemy = getOpponent().getSelectedPookiemon();
                int damage = player.getSelectedPookiemon().attack(enemy, move);
                int remainingHealth = enemy.damage(damage);
                System.out.println("Woah! Computer scored " + damage + " against your " + enemy.getName());
                enemy.printHealth();
                if (remainingHealth <= 0) {
                    player.getSelectedPookiemon().addWin();
                }
                int random = Utils.Random.number(3, 4);
                if (player.getSelectedPookiemon().getWins() >= random) {
                    player.getSelectedPookiemon().evolve();
                }
                nextPlayer();
                continue;
            }
            System.out.println(player.getName() + ", it's your turn!");

            System.out.println("Here's your current Pookiemon:");
            System.out.println(player.getSelectedPookiemon());

            System.out.println();
            System.out.println("Here's your opponent's Pookiemon:");
            System.out.println(getOpponent().getSelectedPookiemon());

            if (player.getSelectedPookiemon().getHealth() <= 0 && player.getSelectedPookiemon().canHeal()) {
                System.out.println("Oops, your Pookiemon is dead.");
                System.out.println("You can choose to heal your Pookiemon now, restoring up to 20 points.");
                String r = Utils.getValidEntry("Would you like to? Yes/No", 3, i);
                if (r.equals("Yes")) {
                    player.getSelectedPookiemon().heal();
                    System.out.println("Your Pookiemon is Healed!");
                } else {
                    System.out.println("You must choose a different Pookiemon...");

                    System.out.println();
                    System.out.println("Here's your Pookiemon:");
                    Pookiemon[] these = player.getPookiemon();
                    for (Pookiemon aThis : these) {
                        System.out.println(aThis);
                    }
                    Pookiemon choice = Utils.choosePookiemon(i, player.getPookiemon());
                    player.selectPookiemon(choice);

                    System.out.println("Here's your current Pookiemon:");
                    System.out.println(player.getSelectedPookiemon());
                }
            } else if (player.getSelectedPookiemon().getHealth() <= 0) {
                System.out.println("You must choose a different Pookiemon...");

                System.out.println();
                System.out.println("Here's your Pookiemon:");
                Pookiemon[] these = player.getPookiemon();
                for (Pookiemon aThis : these) {
                    System.out.println(aThis);
                }
                Pookiemon choice = Utils.choosePookiemon(i, player.getPookiemon());
                player.selectPookiemon(choice);

                System.out.println("Here's your current Pookiemon:");
                System.out.println(player.getSelectedPookiemon());
            }

            System.out.println();
            String res = Utils.getValidEntry("Do you want to (C)ontinue using your selected Pookiemon or choose a (D)ifferent one from your deck?", 1, i, "C", "D");
            while (res.equals("D")) {
                System.out.println("Here's your Pookiemon:");
                Pookiemon[] these = player.getPookiemon();
                for (Pookiemon aThis : these) {
                    System.out.println(aThis);
                }
                Pookiemon choice = Utils.choosePookiemon(i, player.getPookiemon());
                player.selectPookiemon(choice);

                System.out.println("Here's your current Pookiemon:");
                System.out.println(player.getSelectedPookiemon());

                System.out.println();
                res = Utils.getValidEntry("Do you want to (C)ontinue using your selected Pookiemon or choose a (D)ifferent one from your deck?", 1, i, "C", "D");
            }

            if (player.getSelectedPookiemon().canHeal()) {
                System.out.println("Your Pookiemon can be healed!");
                String r = Utils.getValidEntry("Would you like to heal it? Yes/No", 3, i);
                if (r.equals("Yes")) {
                    player.getSelectedPookiemon().heal();
                    System.out.println("Your Pookiemon is Healed!");
                }
            }

            System.out.println("It's time to choose your move!");

            Types moveType = player.getSelectedPookiemon().getTypes()[0];
            MovesList mList = new MovesList();

            int availableCount = 0;
            int specialCount = 0;
            for (int i = 0; i < mList.getList().size(); i++) {
                Move move = mList.getList().get(i);
                if (move.getType() == moveType || move.getType() == NORMAL) {
                    availableCount++;
                }
                if (move.getType() == moveType && move.getType() != NORMAL) {
                    specialCount++;
                }
            }

            Move[] availableMoves = new Move[availableCount];
            int current = 0;

            if (moveType != NORMAL && specialCount > 0) {
                System.out.println("Here are the special moves that your Pookiemon has:");
                for (int i = 0; i < mList.getList().size(); i++) {
                    Move move = mList.getList().get(i);
                    if (move.getType() == moveType) {
                        System.out.println(move);
                        availableMoves[current] = move;
                        current++;
                    }
                }

                System.out.println();
                System.out.println("And here are the normal moves:");
                for (int i = 0; i < mList.getList().size(); i++) {
                    Move move = mList.getList().get(i);
                    if (move.getType() == NORMAL) {
                        System.out.println(move);
                        availableMoves[current] = move;
                        current++;
                    }
                }
            } else {
                System.out.println("Here are the moves that your Pookiemon has:");
                for (int i = 0; i < mList.getList().size(); i++) {
                    Move move = mList.getList().get(i);
                    if (move.getType() == NORMAL) {
                        System.out.println(move);
                        availableMoves[current] = move;
                        current++;
                    }
                }
            }

            System.out.println();
            Move selectedMove = Utils.chooseMove(i, availableMoves);

            System.out.println("It's time to attack!");
            Pookiemon enemy = getOpponent().getSelectedPookiemon();
            int damage = player.getSelectedPookiemon().attack(enemy, selectedMove);
            int remainingHealth = enemy.damage(damage);
            System.out.println("Woah! You scored " + damage + " against " + getOpponent().getName() + "'s " + enemy.getName());
            enemy.printHealth();
            if (remainingHealth <= 0) {
                player.getSelectedPookiemon().addWin();
            }
            int random = Utils.Random.number(3, 4);
            if (player.getSelectedPookiemon().getWins() >= random) {
                System.out.println("Woah! Your Pookiemon is evolving!");
                player.getSelectedPookiemon().evolve();
                System.out.println("Here's your evolved Pookiemon:");
                System.out.println(player.getSelectedPookiemon());
            }
            nextPlayer();
        }
    }
}
