import java.util.Scanner;
public class Program5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month you were born (as a number): ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("Enter the day you were born: ");
        int day = input.nextInt();
        input.nextLine();
        System.out.print("Enter the year you were born: ");
        int year = input.nextInt();
        int startYear = 2022;
        int startMonth = 12;
        int startDay = 31;
        int calcYears = startYear - year;
        int calcMonths = startMonth - month;
        int calcDays = startDay - day;
        int totalDays = (calcYears*365)+(calcMonths*30)+calcDays;
        int totalHours = totalDays*24;
        int totalSeconds = totalHours*3600;
        System.out.print("You are ");
        System.out.print(calcYears);
        System.out.println(" years old as of December 31, 2022");
        System.out.print("You have lived for a total of ");
        System.out.print(calcYears);
        System.out.print(" years, ");
        System.out.print(calcMonths);
        System.out.print(" months, and ");
        System.out.print(calcDays);
        System.out.println(" days.");
        System.out.print("That is a total of ");
        System.out.print(totalDays);
        System.out.println(" days.");
        System.out.print("That is a total of ");
        System.out.print(totalHours);
        System.out.println(" hours.");
        System.out.print("That is a total of ");
        System.out.print(totalSeconds);
        System.out.println(" seconds.");
    }
}
