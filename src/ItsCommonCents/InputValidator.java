package ItsCommonCents;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

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
}
