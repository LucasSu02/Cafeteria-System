package assignment.oodj_groupassignment;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TopUp extends javax.swing.JFrame {

    public TopUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopUpPanel = new javax.swing.JPanel();
        amountLabel = new javax.swing.JLabel();
        topUpMethod = new javax.swing.JComboBox<>();
        amountLabel1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        topUpLabel = new javax.swing.JLabel();
        confirmTopUp = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("TopUp"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        TopUpPanel.setBackground(new java.awt.Color(204, 255, 102));

        amountLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        amountLabel.setText("Top-up Method :");

        topUpMethod.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        topUpMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit / Debit Card", "Online Banking" }));
        topUpMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topUpMethodActionPerformed(evt);
            }
        });

        amountLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        amountLabel1.setText("Amount :");

        amount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        topUpLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        topUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topUpLabel.setText("Top-Up");

        confirmTopUp.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        confirmTopUp.setText("Confirm Top-up");
        confirmTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTopUpActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopUpPanelLayout = new javax.swing.GroupLayout(TopUpPanel);
        TopUpPanel.setLayout(TopUpPanelLayout);
        TopUpPanelLayout.setHorizontalGroup(
            TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopUpPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TopUpPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLabel1)
                            .addComponent(confirmTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopUpPanelLayout.createSequentialGroup()
                        .addComponent(amountLabel)
                        .addGap(279, 279, 279)))
                .addGap(415, 415, 415))
            .addGroup(TopUpPanelLayout.createSequentialGroup()
                .addGroup(TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopUpPanelLayout.createSequentialGroup()
                        .addGap(618, 618, 618)
                        .addGroup(TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topUpMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TopUpPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(401, Short.MAX_VALUE))
        );
        TopUpPanelLayout.setVerticalGroup(
            TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopUpPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(topUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(topUpMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(TopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel1)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(confirmTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmTopUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTopUpActionPerformed
        //The choice of top up method chosed by the user is obtained
        String choice = topUpMethod.getSelectedItem().toString();
        String card = "Credit / Debit Card";
        String onlineBanking = "Online Banking";
        
        try
        {
            //The input of the amount that the user want to top up is converted into double
            //and stored in a double variable
            double topUpAmount = Double.valueOf(amount.getText());
            File topUpFile = new File("TopUpAmount.txt");
            FileWriter topUpFileWriter = new FileWriter(topUpFile);
            topUpFileWriter.write(Double.toString(topUpAmount));
            topUpFileWriter.close();
            
            //Then different object is created according to the choice of top-up method
            if (choice.equals(card))
            {
                this.setVisible(false);
                TopUpCard tpc = new TopUpCard();
                tpc.setVisible(true);
            }
            else if (choice.equals(onlineBanking))
            {
                this.setVisible(false);
                TopUpOnlineBanking tuob = new TopUpOnlineBanking();
                tuob.setVisible(true);
            }
        }
        catch (Exception e)
        {
            //The program will fail if the user input non integer hence the program will
            //indicate the user to give integer input
            JOptionPane.showMessageDialog(this, "Please input numbers.");
        }
        
        
    }//GEN-LAST:event_confirmTopUpActionPerformed

    private void topUpMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topUpMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topUpMethodActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        CustomerMainMenu mm = new CustomerMainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopUpPanel;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel amountLabel1;
    private javax.swing.JButton back;
    private javax.swing.JButton confirmTopUp;
    private javax.swing.JLabel topUpLabel;
    private javax.swing.JComboBox<String> topUpMethod;
    // End of variables declaration//GEN-END:variables
}
