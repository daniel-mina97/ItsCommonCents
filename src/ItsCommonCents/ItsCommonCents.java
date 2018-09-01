package ItsCommonCents;

import DataManagement.DatabaseConnection;
import Forms.MainFrame;
import javax.swing.JFrame;

public class ItsCommonCents {

    private static DatabaseConnection connection;
    
    public static void main(String[] args) {
        
        connection = new DatabaseConnection();
        MainFrame frame = new MainFrame(connection);
        //SettingsInitializer frame = new SettingsInitializer();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
