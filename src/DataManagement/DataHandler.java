/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;


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
    
}
