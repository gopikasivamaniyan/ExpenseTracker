import java.util.*;

class ExpenseService {
    double totalExpense(List<Expense> list) {
        double sum = 0;
        for (Expense e : list) sum += e.amount;
        return sum;
    }
}
