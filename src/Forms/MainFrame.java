package Forms;

import DataManagement.DatabaseConnection;
import JPanels.AddExpensesPanel;
import JPanels.AlterBudgetPanel;
import JPanels.EditExpensesPanel;
import JPanels.GraphDataPanel;
import JPanels.MainViewPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {
    
    private final DatabaseConnection connection;
    
    public MainFrame(DatabaseConnection connection) {
        this.connection = connection;
        initComponents();
        initPanels();
        setUpLayout();
    }
    
    private void initPanels() {
        alterBudgetPanel = new AlterBudgetPanel(connection);
        addExpensesPanel = new AddExpensesPanel(connection);
        editExpensesPanel = new EditExpensesPanel(connection);
        graphDataPanel = new GraphDataPanel(connection);
        mainViewPanel = new MainViewPanel(connection);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        alterBudgetButton = new javax.swing.JButton();
        graphDataButton = new javax.swing.JButton();
        addExpensesButton = new javax.swing.JButton();
        editExpensesButton = new javax.swing.JButton();
        mainViewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame");
        setName("Form"); // NOI18N

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setLayout(new java.awt.CardLayout());

        exitButton.setText("Exit");
        exitButton.setToolTipText("");
        exitButton.setName("exitButton"); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        alterBudgetButton.setText("Alter Budget Contraints");
        alterBudgetButton.setName("alterBudgetButton"); // NOI18N
        alterBudgetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterBudgetButtonActionPerformed(evt);
            }
        });

        graphDataButton.setText("View Data as Graph");
        graphDataButton.setActionCommand("Add Expenditures");
        graphDataButton.setName("graphDataButton"); // NOI18N
        graphDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphDataButtonActionPerformed(evt);
            }
        });

        addExpensesButton.setText("Add Expenditures");
        addExpensesButton.setName("addExpensesButton"); // NOI18N
        addExpensesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpensesButtonActionPerformed(evt);
            }
        });

        editExpensesButton.setText("Edit Expenditures");
        editExpensesButton.setName("editExpensesButton"); // NOI18N
        editExpensesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editExpensesButtonActionPerformed(evt);
            }
        });

        mainViewButton.setText("Main Screen");
        mainViewButton.setActionCommand("Add Expenditures");
        mainViewButton.setName("mainViewButton"); // NOI18N
        mainViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addExpensesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alterBudgetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editExpensesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(graphDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(mainViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(alterBudgetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(addExpensesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(editExpensesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(graphDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap())
        );

        mainPanel.getAccessibleContext().setAccessibleName("mainPanel");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterBudgetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterBudgetButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "alterBudget");
    }//GEN-LAST:event_alterBudgetButtonActionPerformed

    private void graphDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphDataButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "graphData");
    }//GEN-LAST:event_graphDataButtonActionPerformed

    private void addExpensesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpensesButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "addExpenses");
    }//GEN-LAST:event_addExpensesButtonActionPerformed

    private void editExpensesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editExpensesButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "editExpenses");
    }//GEN-LAST:event_editExpensesButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void mainViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainViewButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        mainViewPanel.RefreshTable();
        card.show(mainPanel, "mainView");
    }//GEN-LAST:event_mainViewButtonActionPerformed
    
    private void setUpLayout(){
        mainPanel.setLayout(cl);
        
        mainPanel.add(mainViewPanel, "mainView");
        mainPanel.add(alterBudgetPanel, "alterBudget");
        mainPanel.add(addExpensesPanel, "addExpenses");
        mainPanel.add(editExpensesPanel, "editExpenses");
        mainPanel.add(graphDataPanel, "graphData");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExpensesButton;
    private javax.swing.JButton alterBudgetButton;
    private javax.swing.JButton editExpensesButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton graphDataButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton mainViewButton;
    // End of variables declaration//GEN-END:variables
    private CardLayout cl = new CardLayout();
    private AlterBudgetPanel alterBudgetPanel;
    private AddExpensesPanel addExpensesPanel;
    private EditExpensesPanel editExpensesPanel;
    private GraphDataPanel graphDataPanel;
    private MainViewPanel mainViewPanel;
    

}
