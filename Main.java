import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense("2025-10-14", "Food", "Lunch", 120.50));
        expenses.add(new Expense("2025-10-14", "Travel", "Bus", 30.00));

        ExpenseService s = new ExpenseService();
        System.out.println("Total Expense: " + s.totalExpense(expenses));
    }
}
