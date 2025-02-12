package Battleship.Enums;

public enum Guess {
    UNGUESSED("-"),
    HIT("X"),
    MISSED("O");

    private final String value;

    Guess(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
