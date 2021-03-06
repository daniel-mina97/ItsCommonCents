package JPanels;

import Enums.BudgetCategory;
import DataManagement.DataHandler;
import DataManagement.DatabaseConnection;
import ItsCommonCents.InputFilter;
import ItsCommonCents.InputValidator;

public class AddExpensesPanel extends javax.swing.JPanel {

    private DataHandler database;
    
    public AddExpensesPanel(DatabaseConnection connection) {
        initComponents();
        database = new DataHandler(connection);
        InputFilter.giveTextBoxFilterForDollars(amountSpentInput);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addExpensesPanel = new javax.swing.JPanel();
        addExpensesLabel = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<>();
        amountSpentLabel = new javax.swing.JLabel();
        amountSpentInput = new javax.swing.JTextField();
        categoryLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(526, 371));

        addExpensesPanel.setBackground(new java.awt.Color(255, 255, 255));
        addExpensesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addExpensesLabel.setText("Add Expenses");

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(BudgetCategory.getComboBoxLabels()));

        amountSpentLabel.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        amountSpentLabel.setText("Amount Spent");

        categoryLabel.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        categoryLabel.setText("Category");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addExpensesPanelLayout = new javax.swing.GroupLayout(addExpensesPanel);
        addExpensesPanel.setLayout(addExpensesPanelLayout);
        addExpensesPanelLayout.setHorizontalGroup(
            addExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addExpensesPanelLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(addExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addExpensesPanelLayout.createSequentialGroup()
                        .addComponent(addExpensesLabel)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addExpensesPanelLayout.createSequentialGroup()
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(amountSpentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addExpensesPanelLayout.createSequentialGroup()
                        .addComponent(categoryLabel)
                        .addGap(141, 141, 141)
                        .addComponent(amountSpentLabel)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addExpensesPanelLayout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(197, 197, 197))))
        );
        addExpensesPanelLayout.setVerticalGroup(
            addExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addExpensesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addExpensesLabel)
                .addGap(23, 23, 23)
                .addGroup(addExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountSpentLabel)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountSpentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addExpensesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addExpensesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        int selectedCategoryIndex = categoryComboBox.getSelectedIndex();
        double dollarInput = InputValidator.convertUserInput(amountSpentInput);
        if (inputCheck(selectedCategoryIndex, dollarInput)){
            database.writeToExpenses(selectedCategoryIndex, dollarInput);
            categoryComboBox.setSelectedIndex(0);
            amountSpentInput.setText("");
        }
        database.printSelectAllFromExpenses();
    }//GEN-LAST:event_submitButtonActionPerformed

    private boolean inputCheck(int selectedIndex, double dollarInput){
        return selectedIndex != 0 && dollarInput != 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addExpensesLabel;
    private javax.swing.JPanel addExpensesPanel;
    private javax.swing.JTextField amountSpentInput;
    private javax.swing.JLabel amountSpentLabel;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
