package PokemonGame.PokemonClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Move {
    private String name;
    private double damageMultiplier;
    private double accuracy;
    private ArrayList<Types> types;

    public Move(String name) {
        this.name = name;
        this.damageMultiplier = 1;
        this.accuracy = .5;
        this.types = new ArrayList<Types>();
    }

    public Move(String name, double damageMultiplier, double accuracy, Types[] types) {
        this.name = name;
        this.damageMultiplier = damageMultiplier;
        this.accuracy = accuracy;
        this.types = new ArrayList<Types>();
        this.types.addAll(Arrays.asList(types));
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

    public Types[] getTypes() {
        return (Types[]) types.toArray();
    }

    public void addType(Types type) {
        types.add(type);
    }

    public void removeType(Types type) {
        types.remove(type);
    }

    public void removeType(int index) {
        types.remove(index);
    }
}
