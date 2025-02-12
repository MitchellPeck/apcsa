package Part1;

public class Pig {
    private String color;
    private int penSize;
    private boolean wallowed;
    private double weight;

    public Pig() {
        color = "white";
        penSize = 128;
        wallowed = false;
        weight = 500;
    }

    public Pig(String color, int penSize, boolean wallowed, double weight) {
        this.color = color;
        this.penSize = penSize;
        this.wallowed = wallowed;
        this.weight = weight;
    }

    public void makeNoise() {
        System.out.println("Oink");
    }

    public void upgradePenSize(int amount) {
        penSize += amount;
    }

    public void displayPig() {
        System.out.println("Pig Color: " + color);
        System.out.println("Pig Size: " + penSize);
        System.out.println("Pig Weight: " + weight);
        System.out.println("Pig has Wallowed Today: " + wallowed);
    }
}
