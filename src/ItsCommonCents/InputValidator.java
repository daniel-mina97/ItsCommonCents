package ItsCommonCents;

import java.lang.Character;

public class InputValidator {
    
    public static boolean canConvertStringToDollars(String input) {
        int decimalPlacesCount = 0;
        boolean decimalPointPassed = false;
        for(char c : input.toCharArray()) {
            if(Character.isDigit(c) && decimalPlacesCount < 2) {
                if(decimalPointPassed) {
                    decimalPlacesCount++;
                } 
            }
            else if(c == '.' && !decimalPointPassed) {
                decimalPointPassed = true;
            }
            else if (c == '0' && decimalPlacesCount >= 2) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    
}
