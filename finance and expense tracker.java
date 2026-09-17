import java.util.Scanner;
public class FinanceTracker {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;
    static String[] type = new String[MAX];
    static String[] category = new String[MAX];
    static double[] amount = new double[MAX];
    static int count = 0;
    static double balance = 0;

    static void addIncome() {
        System.out.print("Enter income amount: ₹");
        double money = sc.nextDouble();
        System.out.print("Enter income source: ");
        String source = sc.next();
        type[count] = "Income";
        category[count] = source;
        amount[count] = money;
        count++;
        balance += money;
        System.out.println("Income added successfully!");
    }
    static void addExpense() {
        System.out.print("Enter expense amount: ₹");
        double money = sc.nextDouble();
        System.out.print("Enter expense category: ");
        String expenseCategory = sc.next();
        type[count] = "Expense";
        category[count] = expenseCategory;
        amount[count] = money;
        count++;
        balance -= money;
        System.out.println("Expense added successfully!");
    }
    static void viewTransactions() {
        if (count == 0) {
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("\n----- TRANSACTION HISTORY -----");
        for (int i = 0; i < count; i++) {
            System.out.println(
                (i + 1) + ". " +
                type[i] + " | " +
                category[i] + " | ₹" +
                amount[i]
            );
        }
    }
    static void showSummary() {
        double totalIncome = 0;
        double totalExpense = 0;
        for (int i = 0; i < count; i++) {
            if (type[i].equals("Income")) {
                totalIncome += amount[i];
            } else {
                totalExpense += amount[i];
            }
        }
        System.out.println("\n----- FINANCIAL SUMMARY -----");
        System.out.println("Total Income  : ₹" + totalIncome);
        System.out.println("Total Expense : ₹" + totalExpense);
        System.out.println("Balance       : ₹" + balance);
    }
    //main
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n================================");
            System.out.println(" PERSONAL FINANCE TRACKER");
            System.out.println("================================");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. View Financial Summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addIncome();
                    break;
                case 2:
                    addExpense();
                    break;
                case 3:
                    viewTransactions();
                    break;
                case 4:
                    showSummary();
                    break;
                case 5:
                    System.out.println("Thank you for using Finance Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}