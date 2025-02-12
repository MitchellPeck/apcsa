public class HangmanASCII {
    private boolean head;
    private boolean arm1;
    private boolean arm2;
    private boolean leg1;
    private boolean leg2;

    public HangmanASCII() {
        head = false;
        arm1 = false;
        arm2 = false;
        leg1 = false;
        leg2 = false;
    }

    public void add() {
        if (!head) head = true;
        else if (!arm1) arm1 = true;
        else if (!arm2) arm2 = true;
        else if (!leg1) leg1 = true;
        else if (!leg2) leg2 = true;
    }

    public void show() {
        System.out.println("----------");
        System.out.println("|        |");
        System.out.print("|       ");
        if (arm1) System.out.print("\\");
        else System.out.print(" ");
        if (head) System.out.print("O");
        else System.out.print(" ");
        if (arm2) System.out.println("/");
        else System.out.println(" ");
        if (leg1 || leg2) System.out.println("|        |");
        else System.out.println("|         ");
        System.out.print("|       ");
        if (leg1) System.out.print("/");
        else System.out.print(" ");
        System.out.print(" ");
        if (leg2) System.out.println("\\");
        else System.out.println(" ");
        System.out.println("|__________");
    }
}
