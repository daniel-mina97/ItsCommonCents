
package DataManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    
    private final static String DATABASE_URL = "jdbc:sqlite:nbproject/private/CommonCents.db";
    private final Connection connection;
   
    public DatabaseConnection() {
        connection = connectToDatabase();
        createMissingTables();
    }
            
    private Connection connectToDatabase() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DATABASE_URL);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
        
    private void createMissingTables() {
        createExpensesTable();
        createSpendingLimitsTable();
    }
    
    private void createExpensesTable() {
        String sql = "CREATE TABLE IF NOT EXISTS expenses ("
                + " date text,"
                + " category int,"
                + " amount_spent real)";
        executeSQL(sql);
    }
    
    private void createSpendingLimitsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS spending_limits ("
                + " category int,"
                + " spending_limit real)";
        executeSQL(sql);
    }
        
    public void executeSQL(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
