import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please give me name one: ");
        String name1 = input.nextLine();
        System.out.print("Please give me name two: ");
        String name2 = input.nextLine();
        System.out.print("Please give me name three: ");
        String name3 = input.nextLine();
        String names = name3 + ", " + name2 + ", " + name1;
        System.out.println(names);
    }
}
