package Forms;

import ItsCommonCents.InputValidator;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SettingsInitializer extends javax.swing.JFrame {

    public SettingsInitializer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yearlyIncomeLabel = new javax.swing.JLabel();
        housingLabel = new javax.swing.JLabel();
        groceriesLabel = new javax.swing.JLabel();
        entertainmentLabel = new javax.swing.JLabel();
        miscellaneousLabel = new javax.swing.JLabel();
        transportationLabel = new javax.swing.JLabel();
        yearlyIncomeInput = new javax.swing.JTextField();
        housingInput = new javax.swing.JTextField();
        groceriesInput = new javax.swing.JTextField();
        entertainmentInput = new javax.swing.JTextField();
        transportationInput = new javax.swing.JTextField();
        miscellaneousInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Settings");

        yearlyIncomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yearlyIncomeLabel.setText("Yearly Income:");

        housingLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        housingLabel.setText("Housing/Rent:");

        groceriesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        groceriesLabel.setText("Groceries:");

        entertainmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        entertainmentLabel.setText("Entertainment:");

        miscellaneousLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        miscellaneousLabel.setText("Miscellaneous:");

        transportationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        transportationLabel.setText("Transportation:");

        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(entertainmentLabel)
                            .addComponent(groceriesLabel)
                            .addComponent(housingLabel)
                            .addComponent(yearlyIncomeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearlyIncomeInput)
                            .addComponent(housingInput)
                            .addComponent(groceriesInput)
                            .addComponent(entertainmentInput, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transportationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transportationInput, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(miscellaneousLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(miscellaneousInput, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlyIncomeLabel)
                    .addComponent(yearlyIncomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housingLabel)
                    .addComponent(housingInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groceriesLabel)
                    .addComponent(groceriesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entertainmentLabel)
                    .addComponent(entertainmentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transportationLabel)
                    .addComponent(transportationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miscellaneousLabel)
                    .addComponent(miscellaneousInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        /* Needs to: make sure total budget is less than or equal to income
        and transfer budget data between forms OR save directly to local database.
        */
        
        //ALSO we need to clarify - is each budget category per month or per year?
        
        double yearlyIncome = returnValidDollarAmount(yearlyIncomeInput.getText());
        double housing = returnValidDollarAmount(housingInput.getText());
        double groceries = returnValidDollarAmount(groceriesInput.getText());
        double entertainment = returnValidDollarAmount(entertainmentInput.getText());
        double transport = returnValidDollarAmount(transportationInput.getText());
        double misc = returnValidDollarAmount(miscellaneousInput.getText());
        
        double totalBudget = housing + groceries + entertainment + transport + misc;
        
        //!!!!!Bug: still computes income if an invalid character is entered
        if(totalBudget <= yearlyIncome){
            System.out.println("Within Income");
            //save information to database (all individual budgets + yearly income)
            //move onto next screen
        }else{
            System.out.println("Over Income");
            //present error dialogue box to user
        }      
    }//GEN-LAST:event_saveButtonMouseClicked

    
    
    private static double returnValidDollarAmount(String input) {
        try {
            return InputValidator.convertStringToDollars(input);
        } catch (ParseException ex) {
            Logger.getLogger(SettingsInitializer.class.getName()).log(Level.SEVERE, null, ex);
            throw new IllegalArgumentException(); //!!!!! idk if this is how to handle this this.
        }
    }
    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsInitializer().setVisible(true);
            }
        });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField entertainmentInput;
    private javax.swing.JLabel entertainmentLabel;
    private javax.swing.JTextField groceriesInput;
    private javax.swing.JLabel groceriesLabel;
    private javax.swing.JTextField housingInput;
    private javax.swing.JLabel housingLabel;
    private javax.swing.JTextField miscellaneousInput;
    private javax.swing.JLabel miscellaneousLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField transportationInput;
    private javax.swing.JLabel transportationLabel;
    private javax.swing.JTextField yearlyIncomeInput;
    private javax.swing.JLabel yearlyIncomeLabel;
    // End of variables declaration//GEN-END:variables
}
