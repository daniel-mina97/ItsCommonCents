package ItsCommonCents;

import JPanels.AlterBudgetPanel;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputValidator {
    
    //returns numeric value of user input excluding dollar sign, commas, and rounds additional decimals
    //throws exception if invalid characters are present
    public static double convertStringToDollars(String input) throws ParseException{
        if(input.equals("")){
            return 0;
        }
        NumberFormat usDollars = NumberFormat.getInstance(Locale.US);
        try {
            Number inputToNumber = usDollars.parse(input);
            return inputToNumber.doubleValue();
        } catch (ParseException e) {
           throw new IllegalArgumentException("Can't convert String to double");
        }
    }
    
    public static double convertUserInput(javax.swing.JTextField input){
        try {
            double dollarAmount = InputValidator.convertStringToDollars(input.getText());
            return dollarAmount;
        } catch (ParseException ex) {
             Logger.getLogger(AlterBudgetPanel.class.getName()).log(Level.SEVERE, null, ex);
             throw new IllegalArgumentException("Unable to convert string to double");
        }
    }
}
