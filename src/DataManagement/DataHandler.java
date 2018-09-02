package DataManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import Enums.BudgetCategory;

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
