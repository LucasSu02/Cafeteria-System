package assignment.oodj_groupassignment;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class CustomerLogin extends javax.swing.JFrame {

    public CustomerLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LoginPanel = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        systemName = new javax.swing.JLabel();
        accountID = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        AdminLogin = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(242, 242, 242));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("Login"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        LoginPanel.setBackground(new java.awt.Color(255, 153, 153));

        login.setBackground(new java.awt.Color(204, 204, 255));
        login.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        systemName.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        systemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemName.setText("APU Cafeteria Ordering System");

        accountID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        passwordLabel.setText("Password :");

        accountLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        accountLabel.setText("Account ID :");

        AdminLogin.setBackground(new java.awt.Color(0, 204, 204));
        AdminLogin.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        AdminLogin.setText("Manager Login");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(0, 279, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(systemName, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(506, 506, 506))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel)
                    .addComponent(accountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountID, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(systemName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel))
                .addGap(55, 55, 55)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        int correctID = 0;
        String loginID = accountID.getText();
        char[] loginPasswordChar = password.getPassword();
        String loginPassword = String.valueOf(loginPasswordChar);

        String token = "guest";
        CustomerLoginClass adminLogin = new CustomerLoginClass(loginID, loginPassword);
        if (!loginID.contains("ADMIN")) // filters out customer login
        {
            token = adminLogin.login();
        }
        if (!token.equals("guest"))
        {
            File logonUserInfo = new File("LogonUserInfo.txt");
            FileWriter fw = null;
            try {
                fw = new FileWriter(logonUserInfo);
                fw.write(token);
                fw.write("\n");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            adminLogin.loginLog();
            this.setVisible(false);
            CustomerMainMenu mm = new CustomerMainMenu();
            mm.setVisible(true);
            mm.setTitle("APU Cafeteria Ordering System");
            mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mm.setResizable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Wrong credentials, Please try again.");
            accountID.setText("");
            password.setText("");
        }

    }//GEN-LAST:event_loginActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        // TODO add your handling code here:
        ManagerLogin manager = new ManagerLogin();
        this.setVisible(false);
        manager.setVisible(true);
        manager.setTitle("APU Cafeteria Ordering System");
        manager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        manager.setResizable(false);
        manager.setSize(1280,720);
    }//GEN-LAST:event_AdminLoginActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JTextField accountID;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel systemName;
    // End of variables declaration//GEN-END:variables
}
