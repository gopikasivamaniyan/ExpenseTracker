package service;

import model.Expense;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExpenseService {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense e) {
        expenses.add(e);
    }

    public double getTotalSpending() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    public Map<String, Double> getCategoryTotals() {
        return expenses.stream()
                .collect(Collectors.groupingBy(Expense::getCategory,
                        Collectors.summingDouble(Expense::getAmount)));
    }

    public void listExpenses() {
        expenses.forEach(System.out::println);
    }
}


