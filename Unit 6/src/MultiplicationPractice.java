import java.util.*;

public class MultiplicationPractice {
    static ArrayList<PracticeItem> items = new ArrayList<PracticeItem>();
    static ArrayList<Integer> responses = new ArrayList<Integer>();

    static int correct = 0;

    static Scanner s = new Scanner(System.in);

    public static void generateItems() {
        for (int i=0; i<10; i++) {
            items.add(new PracticeItem((int) (Math.random()*12) + 1, (int) (Math.random()*12) + 1));
        }
    }

    public static void displayQuestion(int i) {
        PracticeItem item = items.get(i);
        System.out.print(item.first + " * " + item.second + " = ");
        int r = s.nextInt();
        if (responses.size() -1 >= i && responses.get(i) != null) {
            responses.set(i, r);
        } else {
            responses.add(r);
        }
        item.attempted = true;
        items.set(i, item);
    }

    public static void checkResponses() {
        for (int i=0; i<10; i++) {
            PracticeItem item = items.get(i);
            int itemResponse = responses.get(i);

            int correctResponse = item.first * item.second;

            if (correctResponse == itemResponse && !items.get(i).correct) correct++;
            item.correct = correctResponse == itemResponse;

            items.set(i, item);
        }
    }

    public static class PracticeItem {
        public int first;
        public int second;
        public boolean attempted;
        public boolean correct;

        public PracticeItem(int first, int second) {
            this.first = first;
            this.second = second;
            attempted = false;
            correct = false;
        }
    }

    public static void main(String[] args) {
        generateItems();
        for (int i=0; i<10; i++) {
            displayQuestion(i);
        }
        checkResponses();
        System.out.println("Congrats, you got " + correct + " out of 10 problems correct. Here are the problems you missed. Please try again.");

        for (int i=0; i<10; i++) {
            PracticeItem item = items.get(i);
            if (!item.correct) {
                displayQuestion(i);
            }
        }

        checkResponses();
        System.out.print("Congrats, you got " + correct + " out of 10 problems correct");
        if (correct != 10) {
            System.out.print(" I'm sure you will do better next time!");
        }
    }
}
