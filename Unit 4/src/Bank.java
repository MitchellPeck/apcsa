public class Bank {
    private static double balance;

    public Bank() {
        balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public static void deposit(double amount) {
        balance += amount;
    }

    public static void bet(double amount) {
        balance -= amount;
    }
}
