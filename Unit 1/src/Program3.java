import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight in pounds: ");
        double earth = input.nextInt();
        double mercury = earth * .4;
        double venus = earth * .9;
        double mars = earth * .38;
        double jupiter = earth * 2.3;
        double saturn = earth * 1.1;
        double uranus = earth * .92;
        double neptune = earth * 1.2;
        System.out.println("Here's your weigh on different planets, in pounds:");
        System.out.print("Mercury: ");
        System.out.println(mercury);
        System.out.print("Venus: ");
        System.out.println(venus);
        System.out.print("Mars: ");
        System.out.println(mars);
        System.out.print("Jupiter: ");
        System.out.println(jupiter);
        System.out.print("Saturn: ");
        System.out.println(saturn);
        System.out.print("Uranus: ");
        System.out.println(uranus);
        System.out.print("Neptune: ");
        System.out.println(neptune);
    }
}
