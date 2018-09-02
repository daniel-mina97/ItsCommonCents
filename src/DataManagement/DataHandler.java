/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import java.sql.ResultSet;
import java.sql.SQLException;

//need a better class name probably - if you think of one just refactor
public class DataHandler {
    
    DatabaseConnection databaseConnection;
    
    public DataHandler(DatabaseConnection connection){
        this.databaseConnection = connection;
    }
    
    public void writeToSpendingLimits(int sequence, double amount){
        String sql = "INSERT INTO spending_limits VALUES("
                + sequence + ", "
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
                    + results.getInt("category") + "\t"
                System.out.println(String.format("%-17s%-17s%21.2f", results.getString("date"),
                        results.getDouble("amount_spent")));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
