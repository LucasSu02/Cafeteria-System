package assignment.oodj_groupassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TopUpCard extends javax.swing.JFrame {

    public TopUpCard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopUpCardPanel = new javax.swing.JPanel();
        bankLabel = new javax.swing.JLabel();
        cardNoLabel1 = new javax.swing.JLabel();
        bankNameInput = new javax.swing.JTextField();
        cardNoInput = new javax.swing.JTextField();
        CCVInput = new javax.swing.JTextField();
        CCVLabel = new javax.swing.JLabel();
        confirmCard = new javax.swing.JButton();
        back = new javax.swing.JButton();
        cardTopUpLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("Top-Up Card"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        TopUpCardPanel.setBackground(new java.awt.Color(204, 255, 102));

        bankLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        bankLabel.setText("Bank Name :");

        cardNoLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        cardNoLabel1.setText("Card No. :");

        bankNameInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bankNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankNameInputActionPerformed(evt);
            }
        });

        cardNoInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cardNoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNoInputActionPerformed(evt);
            }
        });

        CCVInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CCVInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCVInputActionPerformed(evt);
            }
        });

        CCVLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        CCVLabel.setText("CCV :");

        confirmCard.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        confirmCard.setText("Confirm Card Info");
        confirmCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCardActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        cardTopUpLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        cardTopUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardTopUpLabel.setText("Credit / Debit Card");

        javax.swing.GroupLayout TopUpCardPanelLayout = new javax.swing.GroupLayout(TopUpCardPanel);
        TopUpCardPanel.setLayout(TopUpCardPanelLayout);
        TopUpCardPanelLayout.setHorizontalGroup(
            TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopUpCardPanelLayout.createSequentialGroup()
                .addGroup(TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopUpCardPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TopUpCardPanelLayout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TopUpCardPanelLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addGroup(TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardNoLabel1)
                            .addComponent(bankLabel)
                            .addComponent(CCVLabel))
                        .addGap(29, 29, 29)
                        .addGroup(TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CCVInput, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TopUpCardPanelLayout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(confirmCard, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        TopUpCardPanelLayout.setVerticalGroup(
            TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopUpCardPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankLabel)
                    .addComponent(bankNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNoLabel1))
                .addGap(40, 40, 40)
                .addGroup(TopUpCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCVInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCVLabel))
                .addGap(45, 45, 45)
                .addComponent(confirmCard, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopUpCardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopUpCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopUpCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bankNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankNameInputActionPerformed

    private void cardNoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNoInputActionPerformed

    private void CCVInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCVInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCVInputActionPerformed

    private void confirmCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmCardActionPerformed
        //The input of the card information is obtained and stored in string variable
        String bankName = bankNameInput.getText();
        String cardNo = cardNoInput.getText();
        String CCV = CCVInput.getText();
        //Because there is no way for the program to check if the information are correct
        //Hence the program only check if the user input something
        if (bankName.equals("") || cardNo.equals("") || CCV.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please input sufficient card information.");
        }
        else
        {
            try
            {
                //The information of the amount that the user want to top up is obtained
                BufferedReader totalPriceReader = new BufferedReader (new FileReader("TopUpAmount.txt"));
                String topUpAmountStr = totalPriceReader.readLine();
                double topUpAmountDouble = Double.valueOf(topUpAmountStr);
                totalPriceReader.close();

                //Then the original balance of the user is also obtained and converted into double
                ReadLogonUserInfo RLUI = new ReadLogonUserInfo();
                String userInfo = RLUI.readLogonInfo();
                String[] userInfoArr = userInfo.split(" ", 10);
                String userBalanceStr = userInfoArr[3];
                double userBalanceDouble = Double.valueOf(userBalanceStr);

                //The new balance is calculated
                double newUserBalanceDouble = userBalanceDouble + topUpAmountDouble;

                //Reading everything in logon user info file and store into string
                String logonUserInfo = RLUI.readLogonInfo();
                //Updating balance
                userInfoArr = logonUserInfo.split(" ", 10);
                userInfoArr[3] = Double.toString(newUserBalanceDouble);
                //Updating the logon user file with new balance
                BufferedWriter bf = new BufferedWriter(new FileWriter("LogonUserInfo.txt"));
                bf.write(userInfoArr[0] + " " + userInfoArr[1] + " " + userInfoArr[2] + " " + userInfoArr[3] + " ACCOUNT");
                bf.close();
                //Update the main customer account file
                //Getting everything in an array
                File customerAccountFile = new File("CustomerAccount.txt");
                Scanner s = new Scanner(customerAccountFile);
                String[] customerAccountFileContent = new String[0];
                while (s.hasNext())
                {
                    String customerInfo = s.nextLine();
                    if (customerInfo.contains("ACCOUNT"))
                    {
                        customerAccountFileContent = Arrays.copyOf(customerAccountFileContent, customerAccountFileContent.length + 1);
                        customerAccountFileContent[customerAccountFileContent.length - 1] = customerInfo;
                    }
                }
                s.close();
                
                //Find the location of the array that contain the user information and update
                for (int i=0; i<customerAccountFileContent.length; i++)
                {
                    if (customerAccountFileContent[i].contains(userInfoArr[0]))
                    {
                        customerAccountFileContent[i]=(userInfoArr[0] + " " + userInfoArr[1] + " " + userInfoArr[2] + " " + userInfoArr[3] + " ACCOUNT");
                        break;
                    }
                }
                //Write into customer account file
                BufferedWriter customerAccountFileUpdate = new BufferedWriter(new FileWriter("CustomerAccount.txt"));
                for (int i=0; i<customerAccountFileContent.length; i++)
                {
                    customerAccountFileUpdate.write(customerAccountFileContent[i] + "\n");
                }
                customerAccountFileUpdate.close();
                
                JOptionPane.showMessageDialog(this, "Top-up Successful.");
                this.setVisible(false);
                CustomerMainMenu mm = new CustomerMainMenu();
                mm.setVisible(true);  
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");
            }
        }   
    }//GEN-LAST:event_confirmCardActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        TopUp tu = new TopUp();
        tu.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TopUpCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopUpCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopUpCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopUpCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopUpCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCVInput;
    private javax.swing.JLabel CCVLabel;
    private javax.swing.JPanel TopUpCardPanel;
    private javax.swing.JButton back;
    private javax.swing.JLabel bankLabel;
    private javax.swing.JTextField bankNameInput;
    private javax.swing.JTextField cardNoInput;
    private javax.swing.JLabel cardNoLabel1;
    private javax.swing.JLabel cardTopUpLabel;
    private javax.swing.JButton confirmCard;
    // End of variables declaration//GEN-END:variables
}
