package assignment.oodj_groupassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CurrentOrder extends javax.swing.JFrame {

    public CurrentOrder() {
        initComponents();
        
        try
        {
            //Reading everything from the file that contains the information of the logged on account only
            ReadLogonUserInfo RLUI = new ReadLogonUserInfo();
            String accountInfo = RLUI.readLogonInfo();
            //The string is splited into array to obtain the customerID
            String[] infoArr = accountInfo.split(" ", 10);
            String customerID = infoArr[0];
            
            //The order file is scanned and to search for the order that is not completed
            File orderFile = new File("Order.txt");
            Scanner s = new Scanner(orderFile);
            String orderDateTime;
            String[] orderedFood = new String[0];
            String[] singleOrder = new String[0];
            String[] fullOrder = new String[0];
            String[] displayAllOrder = new String[0];
            while (s.hasNext())
            {
                String orderFileLine = s.nextLine();
                //This is to reset the indication if there is uncompleted order in this line
                int have = 0;
                //The indication of not completed order is "COMP0" in the test file
                if (orderFileLine.contains("COMP0") && orderFileLine.contains(customerID))
                {
                    //This indicates that there is uncompleted order
                    have = 1;
                    //The information of the uncompleted order is obtained and manipulated to make it easer to understand
                    //by the user and to be display
                    String[] orderLineArray = orderFileLine.split(" ", 10);
                    orderDateTime = (orderLineArray[1]+" "+orderLineArray[2]+"     Total Price: RM"+orderLineArray[3]);
                    
                    //This is to store the food in the order into an array
                    while (true)
                    {
                        String foodLine = s.nextLine();
                        if(foodLine.contains("FOOD"))
                        {
                            String [] foodLineArray = foodLine.split(" ", 10);
                            //This is the logic of appending new things into an array
                            orderedFood = Arrays.copyOf(orderedFood, orderedFood.length + 1);
                            orderedFood[orderedFood.length - 1] = (foodLineArray[1] + " " + foodLineArray[2]);
                        }
                        else                        
                        {
                            //The process has to stop until there is no "FOOD" or else it will go to another order
                            //and take the food from there
                            break;
                        }
                    }
                    
                    //This is the logic of combining 2 arrays into one
                    String[] singleOrderDateTime = {orderDateTime};
                    int singleOrderDateTimeLength = singleOrderDateTime.length;
                    int orderedFoodLength = orderedFood.length;
                    singleOrder = new String[singleOrderDateTimeLength+orderedFoodLength];
                    System.arraycopy(singleOrderDateTime, 0, singleOrder, 0, singleOrderDateTimeLength);
                    System.arraycopy(orderedFood, 0, singleOrder, singleOrderDateTimeLength, orderedFoodLength);
                }
                //Then the array and string that stores previous loop data so that it doesn't interupt the new loop
                orderDateTime = ("");
                orderedFood = new String[0];
                
                //This indicates that there is uncompleted order in this loop hence the program will combine the information
                //obtained on this loop with the one from the previous loop
                //In this case the program can show more than 1 uncompleted order
                if (have == 1);
                {
                    int fullOrderLength = fullOrder.length;
                    int singleOrderLength = singleOrder.length;
                    displayAllOrder = new String[fullOrderLength+singleOrderLength];
                    System.arraycopy(fullOrder, 0, displayAllOrder, 0, fullOrderLength);
                    System.arraycopy(singleOrder, 0, displayAllOrder, fullOrderLength, singleOrderLength);
                    fullOrder = displayAllOrder;
                }
                singleOrder = new String[0];
            }
            s.close();
            //After that the array that stores the uncompleted order information is displayed to the user
            order.setListData(displayAllOrder);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "There is no current order.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CurrentOrderPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        order = new javax.swing.JList<>();
        back = new javax.swing.JButton();
        cardTopUpLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        CurrentOrderPanel.setBackground(new java.awt.Color(153, 255, 153));

        order.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(order);

        back.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        cardTopUpLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        cardTopUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardTopUpLabel.setText("Current Order");

        javax.swing.GroupLayout CurrentOrderPanelLayout = new javax.swing.GroupLayout(CurrentOrderPanel);
        CurrentOrderPanel.setLayout(CurrentOrderPanelLayout);
        CurrentOrderPanelLayout.setHorizontalGroup(
            CurrentOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentOrderPanelLayout.createSequentialGroup()
                .addGroup(CurrentOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CurrentOrderPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CurrentOrderPanelLayout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CurrentOrderPanelLayout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        CurrentOrderPanelLayout.setVerticalGroup(
            CurrentOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CurrentOrderPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(cardTopUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CurrentOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CurrentOrderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        CustomerMainMenu mm = new CustomerMainMenu();
        mm.setVisible(true);
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
            java.util.logging.Logger.getLogger(CurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CurrentOrderPanel;
    private javax.swing.JButton back;
    private javax.swing.JLabel cardTopUpLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> order;
    // End of variables declaration//GEN-END:variables
}
