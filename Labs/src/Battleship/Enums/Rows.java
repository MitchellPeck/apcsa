package Battleship.Enums;

import java.util.Arrays;
import java.util.Optional;

public enum Rows {
    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7),
    I(8),
    J(9);

    private final int value;

    Rows(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static Optional<Rows> byName(String n) {
        return Arrays.stream(values()).filter(it -> it.name().equalsIgnoreCase(n)).findAny();
    }
}
