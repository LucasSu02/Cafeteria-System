package assignment.oodj_groupassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TopUpOnlineBanking extends javax.swing.JFrame {

    public TopUpOnlineBanking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OnlineBankingPanel = new javax.swing.JPanel();
        bankLabel1 = new javax.swing.JLabel();
        bankAccountIDInput = new javax.swing.JTextField();
        bankLabel2 = new javax.swing.JLabel();
        bankPasswordInput = new javax.swing.JPasswordField();
        cardTopUpLabel = new javax.swing.JLabel();
        bankLabel = new javax.swing.JLabel();
        bankNameInput = new javax.swing.JTextField();
        confirmOnlineBankingInfo = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("Online Banking"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        OnlineBankingPanel.setBackground(new java.awt.Color(204, 255, 102));

        bankLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        bankLabel1.setText("Bank Password :");

        bankAccountIDInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bankAccountIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankAccountIDInputActionPerformed(evt);
            }
        });

        bankLabel2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        bankLabel2.setText("Bank Account ID :");

        bankPasswordInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        cardTopUpLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        cardTopUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardTopUpLabel.setText("Online Banking");

        bankLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        bankLabel.setText("Bank Name :");

        bankNameInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bankNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankNameInputActionPerformed(evt);
            }
        });

        confirmOnlineBankingInfo.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        confirmOnlineBankingInfo.setText("Confirm Online Banking Info");
        confirmOnlineBankingInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOnlineBankingInfoActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OnlineBankingPanelLayout = new javax.swing.GroupLayout(OnlineBankingPanel);
        OnlineBankingPanel.setLayout(OnlineBankingPanelLayout);
        OnlineBankingPanelLayout.setHorizontalGroup(
            OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OnlineBankingPanelLayout.createSequentialGroup()
                .addGroup(OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OnlineBankingPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OnlineBankingPanelLayout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankLabel1)
                            .addComponent(bankLabel2)
                            .addComponent(bankLabel))
                        .addGap(18, 18, 18)
                        .addGroup(OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bankNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(bankAccountIDInput)
                            .addComponent(bankPasswordInput))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OnlineBankingPanelLayout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addGroup(OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OnlineBankingPanelLayout.createSequentialGroup()
                        .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(415, 415, 415))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OnlineBankingPanelLayout.createSequentialGroup()
                        .addComponent(confirmOnlineBankingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(445, 445, 445))))
        );
        OnlineBankingPanelLayout.setVerticalGroup(
            OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OnlineBankingPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankLabel)
                    .addComponent(bankNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankLabel2)
                    .addComponent(bankAccountIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OnlineBankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankLabel1)
                    .addComponent(bankPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(confirmOnlineBankingInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineBankingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OnlineBankingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bankNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankNameInputActionPerformed

    private void bankAccountIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankAccountIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankAccountIDInputActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        TopUp tu = new TopUp();
        tu.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void confirmOnlineBankingInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOnlineBankingInfoActionPerformed
        //The input of the card information is obtained and stored in string variable
        String bankName = bankNameInput.getText();
        String bankAccountID = bankAccountIDInput.getText();
        char[] bankPasswordChar = bankPasswordInput.getPassword();
        String bankPassword = String.valueOf(bankPasswordChar);
        //Because there is no way for the program to check if the information are correct
        //Hence the program only check if the user input something
        if (bankName.equals("") || bankAccountID.equals("") || bankPassword.equals(""))
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
        
        
    }//GEN-LAST:event_confirmOnlineBankingInfoActionPerformed

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
            java.util.logging.Logger.getLogger(TopUpOnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopUpOnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopUpOnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopUpOnlineBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopUpOnlineBanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OnlineBankingPanel;
    private javax.swing.JButton back;
    private javax.swing.JTextField bankAccountIDInput;
    private javax.swing.JLabel bankLabel;
    private javax.swing.JLabel bankLabel1;
    private javax.swing.JLabel bankLabel2;
    private javax.swing.JTextField bankNameInput;
    private javax.swing.JPasswordField bankPasswordInput;
    private javax.swing.JLabel cardTopUpLabel;
    private javax.swing.JButton confirmOnlineBankingInfo;
    // End of variables declaration//GEN-END:variables
}
