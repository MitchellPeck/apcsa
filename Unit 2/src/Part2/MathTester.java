package Part2;

import java.lang.Math;
import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        int random = (int) ((Math.random() * 40) - 20);
        System.out.println(random);
        System.out.println(Math.abs(random));

        int angle = (int) (Math.random() + 90);
        double sin = Math.sin(angle);
        System.out.println("Sin: " + sin);
        double cos = Math.cos(angle);
        System.out.println("Cos: " + cos);
        double tan = Math.tan(angle);
        System.out.println("Tan: " + tan);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a: ");
        int a = input.nextInt();
        input.nextLine();
        System.out.print("Enter in b: ");
        int b = input.nextInt();
        input.nextLine();
        System.out.print("Enter in c: ");
        int c = input.nextInt();
        input.nextLine();

        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("Roots are not real.");
        }

        System.out.print("Enter in the radius of your circle: ");
        double radius = input.nextDouble();
        double pi = Math.PI;
        double circumference = 2 * pi * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Circumference of circle: " + circumference);
        System.out.println("Area of circle: " + area);

        double random2 = Math.random()*9;
        System.out.format("%.0f", random2);
        System.out.println();
        System.out.println(Math.round(random2));
        System.out.println((int)(random2 + 0.5));
    }
}
