/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels;

import DataManagement.DataHandler;
import DataManagement.DatabaseConnection;
/**
 *
 * @author Ella
 */
public class EditExpensesPanel extends javax.swing.JPanel {

    private final DataHandler database;
    /**
     * Creates new form EditExpensesPanel
     */
    public EditExpensesPanel(DatabaseConnection connection) {
        initComponents();
        database = new DataHandler(connection);
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
        editExpensesLabel = new javax.swing.JLabel();

        addExpensesPanel.setBackground(new java.awt.Color(255, 255, 255));
        addExpensesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addExpensesPanel.setName(""); // NOI18N
        addExpensesPanel.setPreferredSize(new java.awt.Dimension(426, 371));

        editExpensesLabel.setText("Edit Expenses");

        javax.swing.GroupLayout addExpensesPanelLayout = new javax.swing.GroupLayout(addExpensesPanel);
        addExpensesPanel.setLayout(addExpensesPanelLayout);
        addExpensesPanelLayout.setHorizontalGroup(
            addExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addExpensesPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(editExpensesLabel)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        addExpensesPanelLayout.setVerticalGroup(
            addExpensesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addExpensesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editExpensesLabel)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addExpensesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addExpensesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addExpensesPanel;
    private javax.swing.JLabel editExpensesLabel;
    // End of variables declaration//GEN-END:variables
}
