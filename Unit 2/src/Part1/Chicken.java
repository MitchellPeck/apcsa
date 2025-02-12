package Part1;

public class Chicken {
    private String breed;
    private int eggs;
    private boolean mean;
    private double weight;

    public Chicken() {
        breed = "Rhode Island Red";
        eggs = 1;
        mean = false;
        weight = 5.7;
    }

    public Chicken(String breed, int eggs, boolean mean, double weight) {
        this.breed = breed;
        this.eggs = eggs;
        this.mean = mean;
        this.weight = weight;
    }

    public void makeNoise() {
        if (mean) {
            System.out.println("Grrrrr");
        } else {
            System.out.println("Bak bak");
        }
    }

    public void eatFood(int amount) {
        weight += amount;
    }

    public void displayChicken() {
        System.out.println("Chicken Breed: " + breed);
        System.out.println("Chicken Eggs per Day: " + eggs);
        System.out.println("Chicken is Mean: " + mean);
        System.out.println("Chicken Weight: " + weight);
    }
}
