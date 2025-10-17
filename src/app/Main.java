package app;

import model.Expense;
import service.ExpenseService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseService service = new ExpenseService();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. List Expenses");
            System.out.println("3. Show Total Spending");
            System.out.println("4. Show Category Totals");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Category: ");
                    String category = sc.nextLine();
                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    System.out.print("Note: ");
                    String note = sc.nextLine();
                    service.addExpense(new Expense(date, category, amount, note));
                    break;
                case 2:
                    service.listExpenses();
                    break;
                case 3:
                    System.out.println("Total Spending: " + service.getTotalSpending());
                    break;
                case 4:
                    service.getCategoryTotals().forEach((k,v) -> 
                        System.out.println(k + " : " + v)
                    );
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

