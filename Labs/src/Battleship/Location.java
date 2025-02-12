package Battleship;

import Battleship.Enums.Guess;

public class Location {
    //Guess enum status
    private Guess guess;
    //Has ship
    private boolean hasShip;

    //Constructor
    public Location() {
        //Un-guessed, no ship
        this.guess = Guess.UNGUESSED;
        this.hasShip = false;
    }

    //Return true if un-guessed
    //Else return false
    public boolean isUnguessed() {
        return guess == Guess.UNGUESSED;
    }

    //Return true if ship exists and is un-guessed
    //Else return false
    public boolean isValid() {
        return guess == Guess.UNGUESSED && hasShip;
    }

    //Return Guess from making guess
    public Guess makeGuess() {
        if (hasShip) {
            //If ship exists, then hit
            guess = Guess.HIT;
        } else {
            //Else missed
            guess = Guess.MISSED;
        }
        return guess;
    }

    //Return hasShip
    public boolean hasShip() {
        return hasShip;
    }

    //Set ship status
    public void setShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    //Return guess status
    public Guess getStatus() {
        return guess;
    }
}
