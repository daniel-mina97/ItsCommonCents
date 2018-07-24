package ItsCommonCents;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class InputFilter {
    
    public static void giveTextBoxFilterForDollars(JTextField textBox) {
        DollarDocumentFilter dollarFilter = new DollarDocumentFilter();
        AbstractDocument textBoxDocument = (AbstractDocument) textBox.getDocument();
        textBoxDocument.setDocumentFilter(dollarFilter);
    }
}



