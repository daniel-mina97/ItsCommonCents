package ItsCommonCents;

import DataManagement.DatabaseConnection;
import Forms.MainFrame;
import Forms.SettingsInitializer;
import javax.swing.JFrame;

public class ItsCommonCents {

    private static DatabaseConnection connection;
    
    public static void main(String[] args) {
        
        connection = new DatabaseConnection();
        MainFrame frame = new MainFrame();
        //SettingsInitializer frame = new SettingsInitializer();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
