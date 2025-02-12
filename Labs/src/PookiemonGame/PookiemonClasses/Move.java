package PookiemonGame.PookiemonClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Move {
    private String name;
    private double damageMultiplier;
    private double accuracy;
    private Types type;

    public Move(String name) {
        this.name = name;
        this.damageMultiplier = 1;
        this.accuracy = .5;
    }

    public Move(String name, double damageMultiplier, double accuracy, Types type) {
        this.name = name;
        this.damageMultiplier = damageMultiplier;
        this.accuracy = accuracy;
        this.type = type;
    }

    public Move(String name, double damageMultiplier, double accuracy, Types[] types) {
        this.name = name;
        this.damageMultiplier = damageMultiplier;
        this.accuracy = accuracy;
        this.type = types[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(double damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }
}
