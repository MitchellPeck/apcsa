import java.util.Scanner;
public class Program4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give me any amount of seconds: ");
        int seconds = input.nextInt();
        double fullHours = (double)seconds/3600;
        int hours = (int)fullHours;
        double fullMinutes = (fullHours-hours) * 60;
        int minutes = (int)fullMinutes;
        seconds = (int)((fullMinutes-minutes)*60);
        System.out.print(hours);
        System.out.print(" hours, ");
        System.out.print(minutes);
        System.out.print(" minutes, ");
        System.out.print(seconds);
        System.out.println(" seconds.");
    }
}
