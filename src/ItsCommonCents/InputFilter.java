package ItsCommonCents;

import JPanels.AlterBudgetPanel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class InputFilter {
    
    public static void giveTextBoxFilterForDollars(JTextField textBox) {
        DollarDocumentFilter dollarFilter = new DollarDocumentFilter();
        AbstractDocument textBoxDocument = (AbstractDocument) textBox.getDocument();
        textBoxDocument.setDocumentFilter(dollarFilter);
    }
    
}



