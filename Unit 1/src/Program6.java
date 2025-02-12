import java.util.Scanner;
public class Program6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a three digit number: ");
        String number = input.nextLine();
        String lastDigit = number.substring(2, 3);
        String secondDigit = number.substring(1, 2);
        String firstDigit = number.substring(0, 1);
        System.out.print("Reversed: ");
        System.out.print(lastDigit);
        System.out.print(secondDigit);
        System.out.print(firstDigit);
    }
}
