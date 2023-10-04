package assignment.oodj_groupassignment;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment extends javax.swing.JFrame {

    public Payment() {
        initComponents();
        try
        {
            //Getting balance of the customer
            ReadLogonUserInfo RLUI = new ReadLogonUserInfo();
            String userInfo = RLUI.readLogonInfo();
            String[] userInfoArr = userInfo.split(" ", 10);
            String userBalanceStr = userInfoArr[3];
            double userBalanceDouble = Double.valueOf(userBalanceStr);
            balance.setText(userBalanceStr);

            //Reading everything in cart and store them into array
            File cartFile = new File("Cart.txt");
            Scanner s = new Scanner(cartFile);
            String totalPriceStr = ("");
            String[] cartFoodArr = new String[0];
            while (s.hasNext())
            {
                String cartInfo = s.nextLine();
                if (cartInfo.contains("FOOD"))
                {
                    String[] cartInfoArr = cartInfo.split(" ", 10);
                     //Reading total price from total price file
                    BufferedReader totalPriceReader = new BufferedReader (new FileReader("TotalPrice.txt"));
                    totalPriceStr = totalPriceReader.readLine();
                    double totalPriceDouble = Double.valueOf(totalPriceStr);
                    totalPriceReader.close();
                    //Getting an array of what food is in the cart
                    cartFoodArr = Arrays.copyOf(cartFoodArr, cartFoodArr.length + 1);
                    cartFoodArr[cartFoodArr.length - 1] = cartInfoArr[2];
                }
            }
            s.close();
            totalPrice.setText(totalPriceStr);
            orderList.setListData(cartFoodArr);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaymentPanel = new javax.swing.JPanel();
        confirmPayment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JList<>();
        cardTopUpLabel = new javax.swing.JLabel();
        cartLabel = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();
        totalPriceLabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("Payment"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        PaymentPanel.setBackground(new java.awt.Color(255, 153, 153));

        confirmPayment.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        confirmPayment.setText("Confirm Payment");
        confirmPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPaymentActionPerformed(evt);
            }
        });

        orderList.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(orderList);

        cardTopUpLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        cardTopUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardTopUpLabel.setText("Payment");

        cartLabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cartLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartLabel.setText("Order :");

        balance.setEditable(false);
        balance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        balanceLabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        balanceLabel.setText("Account Balance :");

        totalPrice.setEditable(false);
        totalPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        totalPrice.setToolTipText("");
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });

        totalPriceLabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceLabel.setText("Total Price :");

        back.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentPanelLayout = new javax.swing.GroupLayout(PaymentPanel);
        PaymentPanel.setLayout(PaymentPanelLayout);
        PaymentPanelLayout.setHorizontalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(415, 415, 415))
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaymentPanelLayout.createSequentialGroup()
                                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(cartLabel))
                                    .addComponent(balanceLabel)
                                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalPriceLabel)))
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addGap(521, 521, 521)
                        .addComponent(confirmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        PaymentPanelLayout.setVerticalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                            .addComponent(totalPriceLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addComponent(cartLabel)
                        .addGap(50, 50, 50)
                        .addComponent(balanceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(confirmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed

    private void confirmPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPaymentActionPerformed
        double userBalance = Double.valueOf(balance.getText());
        double totalPriceDouble = Double.valueOf(totalPrice.getText());
        if (userBalance < totalPriceDouble)
        {
            JOptionPane.showMessageDialog(this, "Insufficient Balance, Please Top-up.");
            this.setVisible(false);
            CustomerMainMenu mm = new CustomerMainMenu();
            mm.setVisible(true);
        }
        else
        {
            double afterPayment = userBalance - totalPriceDouble;
            try
            {
                //Reading everything in logon user info file and store into string
                ReadLogonUserInfo RLUI = new ReadLogonUserInfo();
                String userInfo = RLUI.readLogonInfo();
                //Updating balance
                String[] userInfoArr = userInfo.split(" ", 10);
                userInfoArr[3] = Double.toString(afterPayment);
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
                
                //Updating the array that contain the full contents of customer account file
                for (int i=0; i<customerAccountFileContent.length; i++)
                {
                    if (customerAccountFileContent[i].contains(userInfoArr[0]))
                    {
                        customerAccountFileContent[i]=(userInfoArr[0] + " " + userInfoArr[1] + " " + userInfoArr[2] + " " + userInfoArr[3] + " ACCOUNT");
                        break;
                    }
                }
                
                //Write the updated array into customer account file
                BufferedWriter customerAccountFileUpdate = new BufferedWriter(new FileWriter("CustomerAccount.txt"));
                for (int i=0; i<customerAccountFileContent.length; i++)
                {
                    customerAccountFileUpdate.write(customerAccountFileContent[i] + "\n");
                }
                customerAccountFileUpdate.close();
                
                //Creating order
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date longDate = new Date();
                //Generating date in simple format
                String date = formatter.format(longDate);
                
                //Generating the line in the file that contains the information about the order
                String[] orderLine = {(userInfoArr[0] + " " + date + " " + Double.toString(totalPriceDouble) + " FEED0 " + "COMP0")};
                
                //Reading the cart file to see what are the food that should be in the order
                File cartFile = new File("Cart.txt");
                Scanner c = new Scanner(cartFile);
                String[] cartFoodArr = new String[0];
                while (c.hasNext())
                {
                    String cartInfo = c.nextLine();
                    //Only reading the line that have the information of food
                    if (cartInfo.contains("FOOD"))
                    {
                        String[] cartInfoArr = cartInfo.split(" ", 10);
                        //Getting an array of what food is in the cart
                        cartFoodArr = Arrays.copyOf(cartFoodArr, cartFoodArr.length + 1);
                        cartFoodArr[cartFoodArr.length - 1] = (cartInfoArr[0]+" "+ cartInfoArr[1] + " " +cartInfoArr[2]);
                    }
                }
                //Combining the array that contain the order information and the food array
                //which turns into the full order
                int orderLineLength = orderLine.length;
                int cartFoodArrLength = cartFoodArr.length;
                String[] fullOrder = new String[orderLineLength+cartFoodArrLength];
                System.arraycopy(orderLine, 0, fullOrder, 0, orderLineLength);
                System.arraycopy(cartFoodArr, 0, fullOrder, orderLineLength, cartFoodArrLength);
                
                //Wrting order to text file
                File orderFile = new File("Order.txt");
                FileWriter orderFileWriter = new FileWriter(orderFile, true);
                for (int i=0; i<fullOrder.length; i++)
                {
                    orderFileWriter.write(fullOrder[i] + "\n");
                }
                orderFileWriter.write("\n");
                orderFileWriter.close();
                
                //Indicate the user that the order is created
                JOptionPane.showMessageDialog(this, "Order Successfully Created!");
                this.setVisible(false);
                CustomerMainMenu mm = new CustomerMainMenu();
                mm.setVisible(true);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
        
        
    }//GEN-LAST:event_confirmPaymentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        FoodMenu fm = new FoodMenu();
        fm.setVisible(true);
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaymentPanel;
    private javax.swing.JButton back;
    private javax.swing.JTextField balance;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel cardTopUpLabel;
    private javax.swing.JLabel cartLabel;
    private javax.swing.JButton confirmPayment;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> orderList;
    private javax.swing.JTextField totalPrice;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
