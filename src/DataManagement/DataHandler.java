package DataManagement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.sql.SQLException;
import Enums.BudgetCategory;
import java.text.DecimalFormat;

public class DataHandler {
    
    DatabaseConnection databaseConnection;
    
    public DataHandler(DatabaseConnection connection){
        this.databaseConnection = connection;
    }
    
    public void writeToSpendingLimits(int category, double amount){
        deleteOldLimit(category);
        writeNewLimit(category, amount);
    }
    
    private void deleteOldLimit(int category) {
        String sql = "DELETE FROM spending_limits WHERE category="
                + category + ";";
        databaseConnection.executeSQL(sql);
    }
    
    private void writeNewLimit(int category, double amount) {
        String sql = "INSERT INTO spending_limits VALUES("
                + category + ", "
                + amount + ");";
        databaseConnection.executeSQL(sql);
    }
    
    public void writeToExpenses(int category, double amountSpent){
        String sql = "INSERT INTO expenses VALUES( date('now'),"
                + category + ", "
                + amountSpent + ");";
        databaseConnection.executeSQL(sql);
    }
    
    public Object[][] getBudgetOfCurrentMonth() {
        ArrayList<Object[]> rowsForMainViewPanel = new ArrayList<>();
        try {
            String sql = "SELECT * FROM expenses WHERE date >= date('now', "
                    + "'start of month') AND date <= date('now', "
                    + "'start of month', '+1 month', '-1 day')";
            ResultSet results = databaseConnection.executeQuery(sql);
            LinkedHashMap expensesMap = getExpensesFromResultSet(results);
            sql = "SELECT * FROM spending_limits";
            results = databaseConnection.executeQuery(sql);
            LinkedHashMap spendingLimitsMap = getSpendingLimitsFromResultsSet(results);
            BudgetCategory.Category[] categories = BudgetCategory.Category.values();
            Integer currentCategoryInt;
            Double expenseForCategory;
            Double limitForCategory;
            for(BudgetCategory.Category category : categories) {
                currentCategoryInt = BudgetCategory.convertCategoryToInt(category);
                expenseForCategory = (Double) expensesMap.get(currentCategoryInt);
                limitForCategory = (Double) spendingLimitsMap.get(currentCategoryInt);
                if(limitForCategory != null) {
                    Object[] rowForMainViewPanel = {BudgetCategory.getBudgetCategoryString(currentCategoryInt),
                            expenseForCategory,
                            limitForCategory,
                            useOnlyTwoDecimals(limitForCategory - expenseForCategory)};
                    rowsForMainViewPanel.add(rowForMainViewPanel);
                }
            }
            return rowsForMainViewPanel.toArray(new Object[rowsForMainViewPanel.size()][]);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    private LinkedHashMap<Integer, Double> getExpensesFromResultSet(ResultSet results) throws SQLException {
        BudgetCategory.Category[] categories = BudgetCategory.Category.values();
        LinkedHashMap<Integer, Double> expensesMap = new LinkedHashMap<>();
        for(BudgetCategory.Category category : categories) {
            expensesMap.put(BudgetCategory.convertCategoryToInt(category), 0.0);
        }
        int currentCategory;
        double currentAmount;
        while(results.next()) {
            currentCategory = results.getInt("category");
            currentAmount = expensesMap.get(currentCategory);
            expensesMap.put(currentCategory, currentAmount + results.getDouble("amount_spent"));
        }
        return expensesMap;
    }
    
    private LinkedHashMap<Integer, Double> getSpendingLimitsFromResultsSet(ResultSet results) throws SQLException {
        BudgetCategory.Category[] categories = BudgetCategory.Category.values();
        LinkedHashMap<Integer, Double> spendingLimitsMap = new LinkedHashMap<>();
        for(BudgetCategory.Category category : categories) {
            spendingLimitsMap.put(BudgetCategory.convertCategoryToInt(category), null);
        }
        while(results.next()) {
            spendingLimitsMap.put(results.getInt("category"), results.getDouble("spending_limit"));
        }
        return spendingLimitsMap;
    }
    
    private Double useOnlyTwoDecimals(Double value) {
        DecimalFormat twoDecimalForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDecimalForm.format(value));
    }
    
    public void printSelectAllFromExpenses() {
        try {
            String sql = "SELECT * FROM expenses;";
            ResultSet results = databaseConnection.executeQuery(sql);
            System.out.println("-------------------------------------------------------------");
            while (results.next()) {
                System.out.println(String.format("%-17s%-17s%21.2f", results.getString("date"),
                        BudgetCategory.getBudgetCategoryString(results.getInt("category")),
                        results.getDouble("amount_spent")));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void printSelectAllFromSpendingLimits() {
        try {
            String sql = "SELECT * FROM spending_limits;";
            ResultSet results = databaseConnection.executeQuery(sql);
            System.out.println("-------------------------------------------------------------");
            while (results.next()) {
                System.out.println(String.format("%-17s%-21.2f", BudgetCategory.getBudgetCategoryString(results.getInt("category")),
                        results.getDouble("spending_limit")));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }       
    }
}
