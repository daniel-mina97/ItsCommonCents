package ItsCommonCents;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class DollarDocumentFilter extends DocumentFilter {

    private final static int MAX_NUMBER_OF_CHARACTERS = 18;
    
    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
            String newString, AttributeSet attrs) throws BadLocationException {
        int lengthOfOldString = fb.getDocument().getLength();
        int lengthOfNewString = newString.length();
        String text = fb.getDocument().getText(0, lengthOfOldString);
        text += newString;
        if(lengthOfOldString + lengthOfNewString - length <= MAX_NUMBER_OF_CHARACTERS &&
                text.matches("[0-9]*[.]?[0-9]?[0-9]?")) {
            super.replace(fb, offset, length, newString, attrs);
        }
    }
}
