package Part1;

public class Cow {
    private String name;
    private double weight;
    private int age;
    private boolean gender;

    public Cow() {
        name = "Bertha";
        weight = 65.0;
        age = 0;
        gender = false;
    }

    public Cow(String name, double weight, int age, boolean gender) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public void makeNoise() {
        System.out.println("Moo");
    }

    public void haveBirthday() {
        age++;
    }

    public void displayCow() {
        System.out.println("Cow Name: " + name);
        System.out.println("Cow Weight: " + weight);
        System.out.println("Cow Age: " + age);
        System.out.println("Cow Gender: " + (gender ? "male" : "female"));
    }
}
