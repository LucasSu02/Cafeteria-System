package assignment.oodj_groupassignment;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerMainMenu extends javax.swing.JFrame {

    public CustomerMainMenu() {
        initComponents();
        try
        {
            //This is to read the infrmation of the logged on user
            //The main thing is his name and the balance
            ReadLogonUserInfo RLUI = new ReadLogonUserInfo();
            String accountInfo = RLUI.readLogonInfo();
            String[] infoArr = accountInfo.split(" ", 10);
            String name = infoArr[1];
            String balance = infoArr[3];
            welcome.setText("Welcome " + name);
            accountBalance.setText("RM"+balance);
        }
        catch(Exception e)
        {
            System.out.println("test");
            JOptionPane.showMessageDialog(this, "Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenuPanel = new javax.swing.JPanel();
        welcome = new javax.swing.JTextField();
        viewMenu = new javax.swing.JButton();
        topUp = new javax.swing.JButton();
        balanceLabel = new javax.swing.JLabel();
        accountBalance = new javax.swing.JTextField();
        currentOrder = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        orderHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("MainMenu"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        MainMenuPanel.setBackground(new java.awt.Color(204, 204, 255));

        welcome.setEditable(false);
        welcome.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomeActionPerformed(evt);
            }
        });

        viewMenu.setBackground(new java.awt.Color(255, 153, 153));
        viewMenu.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        viewMenu.setText("View Menu");
        viewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMenuActionPerformed(evt);
            }
        });

        topUp.setBackground(new java.awt.Color(204, 255, 102));
        topUp.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        topUp.setText("Top-up");
        topUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topUpActionPerformed(evt);
            }
        });

        balanceLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        balanceLabel.setText("Account Balance :");

        accountBalance.setEditable(false);
        accountBalance.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        currentOrder.setBackground(new java.awt.Color(153, 255, 153));
        currentOrder.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        currentOrder.setText("Current Order");
        currentOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentOrderActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(153, 51, 255));
        logout.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        orderHistory.setBackground(new java.awt.Color(153, 153, 153));
        orderHistory.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        orderHistory.setText("Order History");
        orderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuPanelLayout = new javax.swing.GroupLayout(MainMenuPanel);
        MainMenuPanel.setLayout(MainMenuPanelLayout);
        MainMenuPanelLayout.setHorizontalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuPanelLayout.createSequentialGroup()
                        .addComponent(balanceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 399, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuPanelLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuPanelLayout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuPanelLayout.createSequentialGroup()
                        .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(viewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                            .addComponent(topUp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(293, 293, 293))))
        );
        MainMenuPanelLayout.setVerticalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(accountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainMenuPanel.getAccessibleContext().setAccessibleName("MainMenuPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomeActionPerformed
        
    }//GEN-LAST:event_welcomeActionPerformed

    private void viewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuActionPerformed
        try
        {
            //Clearing cart file to make sure that the cart is empty before the user want to make order
            FileWriter fwM = new FileWriter("Cart.txt", false);
            PrintWriter pwM = new PrintWriter(fwM, false);
            pwM.flush();
            pwM.close();
            fwM.close();
            
            //This is the portion where the program will check if there is orders that havent complete its feedback
            FileWriter fwo = new FileWriter("FeedbackOrderCode.txt", false);
            PrintWriter pwo = new PrintWriter(fwo, false);
            pwo.flush();
            pwo.close();
            fwo.close();
            
            //This is to read the logged on ID to be used as comparison
            BufferedReader logonUserInfoM = new BufferedReader(new FileReader("LogonUserInfo.txt"));
            String accountInfoM = logonUserInfoM.readLine();
            logonUserInfoM.close();
            String[] infoArrM = accountInfoM.split(" ", 10);
            String customerIDM = infoArrM[0];
            
            //Then the whole order file is scanned to find if there is order with uncompleted feedback that
            //belongs to the account
            File orderFileM = new File("Order.txt");
            Scanner c = new Scanner(orderFileM);
            String orderDateTime;
            //This is used to indicate if there is any
            int yes = 0;
            while (c.hasNext())
            {
                String orderFileLineM = c.nextLine();
                if (orderFileLineM.contains("FEED0") && orderFileLineM.contains("COMP1") && orderFileLineM.contains(customerIDM))
                {
                    //The indication is changed if there is order that need feedback
                    yes = 1;
                }
            }
            c.close();
            
            //The indication is used as control here
            if (yes == 1)
            {
                //The information of the loggon user account is obtained again
                BufferedReader logonUserInfo = new BufferedReader(new FileReader("LogonUserInfo.txt"));
                String accountInfo = logonUserInfo.readLine();
                logonUserInfo.close();
                String[] infoArr = accountInfo.split(" ", 10);
                String customerID = infoArr[0];

                //The file that is going to be used to contain all the food that needed feedback is cleared
                FileWriter fwf = new FileWriter("FeedbackFood.txt", false);
                PrintWriter pwf = new PrintWriter(fwf, false);
                pwf.flush();
                pwf.close();
                fwf.close();
                
                //The file that is going to be used to store the order code that needed feedback for its food
                //is also cleared
                FileWriter fwfoc = new FileWriter("FeedbackOrderCode.txt", false);
                PrintWriter pwfoc = new PrintWriter(fwfoc, false);
                pwfoc.flush();
                pwfoc.close();
                fwfoc.close();

                //The order file is then scanned again to search for every order that needed feedback
                File orderFile = new File("Order.txt");
                Scanner s = new Scanner(orderFile);
                String orderCode;
                String[] feedbackFood = new String[0];
                while (s.hasNext())
                {
                    String orderFileLine = s.nextLine();
                    //This is control used to find the order that need feedback
                    if (orderFileLine.contains("FEED0") && orderFileLine.contains("COMP1") && orderFileLine.contains(customerID))
                    {
                        //The line that contains the information of the order is splited into array to take only the required information
                        String[] orderFileLineArray = orderFileLine.split(" ", 10);
                        
                        orderCode = (orderFileLineArray[0]+" "+orderFileLineArray[1]+" "+orderFileLineArray[2]);
                        //Then the order code of the order that needs feedback is appended into the file
                        File foc = new File("FeedbackOrderCode.txt");
                        FileWriter fwoc = new FileWriter(foc, true);
                        fwoc.write(orderCode+"\n");
                        fwoc.close();
                         
                        while (true)
                        {
                            //Then the food that belongs to the order is read and recorded into an array
                            String foodLine = s.nextLine();
                            if(foodLine.contains("FOOD"))
                            {
                                String[] foodLineArr = foodLine.split(" ", 10);
                                feedbackFood = Arrays.copyOf(feedbackFood, feedbackFood.length + 1);
                                feedbackFood[feedbackFood.length - 1] = (orderCode +" "+ foodLineArr[1] +" "+ foodLineArr[2] + " UNDONE");
                            }
                            else                        
                            {
                                //The loop have to stop after it doesent see "FOOD" because
                                //this indicates that the order is ended
                                //By doing this the program wont go read food from other order
                                break;
                            }
                        }                   
                    }
                }
                s.close();
                
                //Then the array that contains the food that needed feedback is appended into the file
                File f = new File("FeedbackFood.txt");
                FileWriter fw1 = new FileWriter(f, true);
                for (int i=0 ; i<feedbackFood.length ; i++)
                {
                    fw1.write(feedbackFood[i]+"\n");
                }
                fw1.close();
                
                //Then the program will stop the user to go into the view menu section
                //The user will led to the feedback page and have to complete the feedback before making new order
                JOptionPane.showMessageDialog(this, "You have some feedback that is not completed, You have to provide feedbacks to order again.");
                this.setVisible(false);
                CustomerFeedback fb = new CustomerFeedback();
                fb.setVisible(true);
            }
            else
            {
                //If there is no order that need feedback the program will let the user go to the food menu page
                this.setVisible(false);
                FoodMenu fm = new FoodMenu();
                fm.setVisible(true);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewMenuActionPerformed

    private void topUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topUpActionPerformed
        this.setVisible(false);
        TopUp tu = new TopUp();
        tu.setVisible(true);
    }//GEN-LAST:event_topUpActionPerformed

    private void currentOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentOrderActionPerformed
        this.setVisible(false);
        CurrentOrder co = new CurrentOrder();
        co.setVisible(true);
    }//GEN-LAST:event_currentOrderActionPerformed

    private void orderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderHistoryActionPerformed
        this.setVisible(false);
        OrderHistory oh = new OrderHistory();
        oh.setVisible(true);
    }//GEN-LAST:event_orderHistoryActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try
        {
            //This is to clear the file that contains the imformation of the logged on account
            FileWriter fw = new FileWriter("LogonUserInfo.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
        this.setVisible(false);
        CustomerLogin l = new CustomerLogin();
        l.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainMenuPanel;
    private javax.swing.JTextField accountBalance;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton currentOrder;
    private javax.swing.JButton logout;
    private javax.swing.JButton orderHistory;
    private javax.swing.JButton topUp;
    private javax.swing.JButton viewMenu;
    private javax.swing.JTextField welcome;
    // End of variables declaration//GEN-END:variables
}
