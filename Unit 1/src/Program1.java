import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Hi ");
        System.out.print(name);
        System.out.print(", welcome to AP CSA!");
    }
}
