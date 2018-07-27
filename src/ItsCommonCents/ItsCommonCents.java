package ItsCommonCents;

import DataManagement.DatabaseConnection;
import Forms.SettingsInitializer;
import javax.swing.JFrame;

public class ItsCommonCents {

    private static DatabaseConnection connection;
    
    public static void main(String[] args) {
        
        connection = new DatabaseConnection();
        
        SettingsInitializer frame = new SettingsInitializer();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
