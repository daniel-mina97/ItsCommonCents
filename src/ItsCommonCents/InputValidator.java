package ItsCommonCents;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class InputValidator {
    
    //returns numeric value of user input excluding dollar sign, commas, and rounds additional decimals
    //throws exception if invalid characters are present
    public static double convertStringToDollars(String input) throws ParseException{
        //accounts for user not utilizing a category
        if(input.equals("")){
            System.out.println("empty textbox"); //for testing purposes
            return 0;
        }
        
        StringBuilder userInput = new StringBuilder(input);
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        
        //ignore dollar sign at front if necessary
        if(userInput.charAt(0) == '$'){
            userInput.deleteCharAt(0);
        }
        
        try {
            Number inputToNumber = format.parse(userInput.toString());
            double usDollars = inputToNumber.doubleValue();
            double nearestCent = Math.round(usDollars * 100.0) / 100.0;
            System.out.println(nearestCent); // for testing purposes
            return nearestCent;
        } catch (ParseException e) {
            //!!!!!Need to create an error dialogue box when user has invalid input!!!!!
            System.out.println("invalid character"); // for testing purposes
            return -1;
        }
    }
    
    
    
}
