package Battleship;

import Battleship.Enums.Directions;

public class Ship {
    private Directions direction;
    private int row;
    private int col;
    private final int length;

    //Constructor
    public Ship(int length) {
        //Unset, invalid location, param length
        this.direction = Directions.UNSET;
        this.row = -1;
        this.col = -1;
        this.length = length;
    }

    //Overloaded constructor
    public Ship(int length, int row, int col, Directions direction) {
        //Direction, location, length
        this.direction = direction;
        this.row = row;
        this.col = col;
        this.length = length;
    }

    //Set direction
    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    //Set row
    public void setRow(int row) {
        //If invalid, don't set
        if (row < 0 || row > 9) return;
        this.row = row;
    }

    //Set col
    public void setCol(int col) {
        //If invalid, don't set
        if (col < 0 || col > 9) return;
        this.col = col;
    }

    //Return direction
    public Directions getDirection() {
        return direction;
    }

    //Return row
    public int getRow() {
        return row;
    }

    //Return column
    public int getColumn() {
        return col;
    }

    //Return length
    public int getLength() {
        return length;
    }

    //Return length string
    public String lengthToString() {
        return "" + length;
    }

    //Return location string
    public String locationToString() {
        return "(" + row + ", " + col + ")";
    }

    //Return string
    public String toString() {
        return "Ship of length " + lengthToString() + " located at " + locationToString() + ".";
    }
}