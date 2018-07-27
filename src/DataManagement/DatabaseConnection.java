
package DataManagement;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    
    private final static String DBURL = "jdbc:sqlite:CommonCents.db";
    private final static String DATABASE_FILE_PATH = "CommonCents.db";
    private final Connection connection;
    
    
    public DatabaseConnection() {
        connection = connectToDatabase();
        if(isDatabaseEmpty()) {
            createTables();
        }
    }
            
    private Connection connectToDatabase() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DBURL);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    private boolean isDatabaseEmpty() {
        File database = new File(DATABASE_FILE_PATH);
        return database.exists();
    }
    
    private void createTables() {
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
        
    private void executeSQL(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
