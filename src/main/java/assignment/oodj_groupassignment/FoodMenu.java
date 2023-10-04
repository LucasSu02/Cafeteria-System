package assignment.oodj_groupassignment;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodMenu extends javax.swing.JFrame {

    public FoodMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FoodMenuPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodMenuList = new javax.swing.JList<>();
        payment = new javax.swing.JButton();
        cartLabel = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartList = new javax.swing.JList<>();
        applyFilter = new javax.swing.JButton();
        back = new javax.swing.JButton();
        removeFromCart = new javax.swing.JButton();
        foodMenuLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        totalPriceDisplay = new javax.swing.JTextField();
        FoodMenuPane2 = new javax.swing.JPanel();
        cuisineTypeLabel = new javax.swing.JLabel();
        cuisineType = new javax.swing.JComboBox<>();
        foodType = new javax.swing.JComboBox<>();
        cuisineTypeLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Food Menu"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        FoodMenuPanel.setBackground(new java.awt.Color(255, 153, 153));

        foodMenuList.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(foodMenuList);

        payment.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        payment.setText("Proceed To Payment");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        cartLabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cartLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartLabel.setText("Cart :");

        addToCart.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        addToCart.setText("Add To Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        cartList.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(cartList);

        applyFilter.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        applyFilter.setText("Apply");
        applyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFilterActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        removeFromCart.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        removeFromCart.setText("Remove \nFrom Cart");
        removeFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromCartActionPerformed(evt);
            }
        });

        foodMenuLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        foodMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodMenuLabel.setText("Food Menu");

        totalPriceLabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceLabel.setText("Total Price :");

        totalPriceDisplay.setEditable(false);
        totalPriceDisplay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        totalPriceDisplay.setToolTipText("");
        totalPriceDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceDisplayActionPerformed(evt);
            }
        });

        FoodMenuPane2.setBackground(new java.awt.Color(255, 255, 204));

        cuisineTypeLabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cuisineTypeLabel.setText("Cuisine Type :");
        cuisineTypeLabel.setToolTipText("");

        cuisineType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cuisineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Malay", "Chinese", "Indian", "Western" }));
        cuisineType.setToolTipText("");

        foodType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        foodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Rice", "Noodles", "Bread", "Meat", "Vegetables", "Drinks" }));
        foodType.setToolTipText("");

        cuisineTypeLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cuisineTypeLabel1.setText("Food Type :");
        cuisineTypeLabel1.setToolTipText("");

        javax.swing.GroupLayout FoodMenuPane2Layout = new javax.swing.GroupLayout(FoodMenuPane2);
        FoodMenuPane2.setLayout(FoodMenuPane2Layout);
        FoodMenuPane2Layout.setHorizontalGroup(
            FoodMenuPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodMenuPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FoodMenuPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuisineTypeLabel)
                    .addComponent(cuisineTypeLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FoodMenuPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuisineType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        FoodMenuPane2Layout.setVerticalGroup(
            FoodMenuPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodMenuPane2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(FoodMenuPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuisineTypeLabel)
                    .addComponent(cuisineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FoodMenuPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(foodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuisineTypeLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FoodMenuPanelLayout = new javax.swing.GroupLayout(FoodMenuPanel);
        FoodMenuPanel.setLayout(FoodMenuPanelLayout);
        FoodMenuPanelLayout.setHorizontalGroup(
            FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(foodMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                        .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(FoodMenuPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FoodMenuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(applyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)))
                        .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(cartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeFromCart)
                                .addGap(107, 107, 107)))
                        .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPriceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalPriceLabel)
                            .addComponent(payment))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        FoodMenuPanelLayout.setVerticalGroup(
            FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalPriceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(foodMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FoodMenuPanelLayout.createSequentialGroup()
                                .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cartLabel)
                                    .addComponent(FoodMenuPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(applyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18)
                .addGroup(FoodMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCart)
                    .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeFromCart))
                .addGap(116, 116, 116)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FoodMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FoodMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromCartActionPerformed
        String[] cartContent = new String[0];
        try
        {
            //Reading everything in cart file and store them into array
            File cartFile = new File("Cart.txt");
            Scanner s = new Scanner(cartFile);
            while (s.hasNext())
            {
                //This is the logic of appending new things into an array
                //The array stores everything in the cart file
                String foodInfo = s.nextLine();
                cartContent = Arrays.copyOf(cartContent, cartContent.length + 1);
                cartContent[cartContent.length - 1] = foodInfo;
            }
            s.close();
            
            //Getting know what is wanted to be deleted by the user and find it in the array and delete it
            int i;
            //Obtaining the selected value from jlist
            String deleteFood = cartList.getSelectedValue().toString();
            //Then the for loop is used to find where the food located
            for (i=0; i<cartContent.length; i++)
            {
                if (cartContent[i].contains(deleteFood))
                {
                    //Here is where the food is found and the line is deleted
                    cartContent[i]=("");
                    //Then the program breaks out so that it only delete 1 if there is another same thing in the array
                    break;
                }
            }
            
            //Update the new cart file
            BufferedWriter bf = new BufferedWriter(new FileWriter("Cart.txt"));
            for (i=0; i<cartContent.length; i++)
            {
                //This if control is to prevent writing empty lines into the cart file
                if (cartContent[i] != "")
                {
                    bf.write(cartContent[i] + "\n");
                }
            }
            bf.close();
            
            //Calculating the total price and getting an array of what food is in the cart
            Scanner c = new Scanner(cartFile);
            double totalPrice = 0;
            String[] cartFoodArr = new String[0];
            while (c.hasNext())
            {
                String cartInfo = c.nextLine();
                //This indicates that there is food information contained in the line
                if (cartInfo.contains("FOOD"))
                {
                    //Calculating total price of food in cart
                    //Spliting the whole line into array to obtain the price only
                    String[] cartInfoArr = cartInfo.split(" ", 10);
                    double price = Double.valueOf(cartInfoArr[3]);
                    totalPrice = totalPrice + price;
                     //Writing total price to total price file
                    File f = new File("TotalPrice.txt");
                    FileWriter fw = new FileWriter(f);
                    fw.write(Double.toString(totalPrice));
                    fw.close();
                    //Getting an array of what food is in the cart
                    cartFoodArr = Arrays.copyOf(cartFoodArr, cartFoodArr.length + 1);
                    cartFoodArr[cartFoodArr.length - 1] = (cartInfoArr[1] +" "+ cartInfoArr[2]);
                }
            }
            c.close();
            //Display the total price and the list of foods
            totalPriceDisplay.setText(Double.toString(totalPrice));  
            cartList.setListData(cartFoodArr);
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
        
    }//GEN-LAST:event_removeFromCartActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        CustomerMainMenu mm = new CustomerMainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void applyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFilterActionPerformed
        //Getting input from the user about which filter that the user want to apply from the combobox
        String cuisineChoice = cuisineType.getSelectedItem().toString();
        String foodChoice = foodType.getSelectedItem().toString();
        String[] menuList = new String[0];
        try
        {
            //The food menu file is opened to find for food that statifies the filter
            File foodMenuFile = new File("FoodMenu.txt");
            Scanner s = new Scanner(foodMenuFile);
            //The filter choice is used in the if control
            
            //This is where user dddnt apply any filter hence whole menu is obtained and store into an array
            if (cuisineChoice.equals("Any") && foodChoice.equals("Any"))
            {
                while (s.hasNext())
                {
                    String foodInfo = s.nextLine();
                    String[] foodInfoArr = foodInfo.split(" ", 10);
                    if (foodInfoArr[0].equals("0000"))
                        continue;
                    menuList = Arrays.copyOf(menuList, menuList.length + 1);
                    menuList[menuList.length - 1] = (foodInfoArr[0] +" "+ foodInfoArr[1]);
                }
            }
            
            //This is where the user didnt apply any filter for the type of cuisine (Chinese, Malay...)
            else if (foodChoice.equals("Any"))
            {
                while (s.hasNext())
                {
                    String foodInfo = s.nextLine();
                    //This is to allow only the food that is belong to the type of cuisine to be added into the array
                    if (foodInfo.contains(cuisineChoice))
                    {
                        String[] foodInfoArr = foodInfo.split(" ", 10);
                        menuList = Arrays.copyOf(menuList, menuList.length + 1);
                        menuList[menuList.length - 1] = (foodInfoArr[0] +" "+ foodInfoArr[1]);
                    }
                }
            }
            
            //This is where the the user didnt apply any filter on the type of food (Rice, Noodle...)
            else if (cuisineChoice.equals("Any"))
            {
                while (s.hasNext())
                {
                    String foodInfo = s.nextLine();
                    //This is to allow only the food that is belong to the type of food to be added into the array
                    if (foodInfo.contains(foodChoice))
                    {
                        String[] foodInfoArr = foodInfo.split(" ", 10);
                        menuList = Arrays.copyOf(menuList, menuList.length + 1);
                        menuList[menuList.length - 1] = (foodInfoArr[0] +" "+ foodInfoArr[1]);
                    }
                }
            }
            
            //This is where the user apply filter on both food type and cuisine type
            else
            {
                while (s.hasNext())
                {
                    String foodInfo = s.nextLine();
                    //This is to allow only the food that is belong to the type of food and cuisine to be added into the array
                    if (foodInfo.contains(foodChoice) && foodInfo.contains(cuisineChoice))
                    {
                        String[] foodInfoArr = foodInfo.split(" ", 10);
                        menuList = Arrays.copyOf(menuList, menuList.length + 1);
                        menuList[menuList.length - 1] = (foodInfoArr[0] +" "+ foodInfoArr[1]);
                    }
                }
            }
            s.close();
            
            //Then the array that contain the food that passes teh filter is displayed
            foodMenuList.setListData(menuList);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_applyFilterActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        //Getting the selection of food from the user in the menu jlist to be added into cart
        String selectedFood = foodMenuList.getSelectedValue().toString();
        try
        {
            File foodMenuFile = new File("FoodMenu.txt");
            Scanner s = new Scanner(foodMenuFile);
            while (s.hasNext())
            {
                String foodInfo = s.nextLine();
                //This is to find the food that is selected by the user from the menu file
                if (foodInfo.contains(selectedFood))
                {
                    String[] foodInfoArr = foodInfo.split(" ", 10);
                    String[] cart = {"FOOD", foodInfoArr[0], foodInfoArr[1], foodInfoArr[4]};
                    //Writing them into cart.txt file
                    BufferedWriter bf = new BufferedWriter(new FileWriter("Cart.txt", true));
                    bf.write(cart[0] + " " + cart[1] + " " + cart[2] + " " + cart[3] + "\n");
                    bf.close();
                    break;
                }
                
            }
            s.close();
            
            //Calculating the total price and getting an array of what food is in the cart
            File cartFile = new File("Cart.txt");
            Scanner c = new Scanner(cartFile);
            double totalPrice = 0;
            String[] cartFoodArr = new String[0];
            while (c.hasNext())
            {
                String cartInfo = c.nextLine();
                if (cartInfo.contains("FOOD"))
                {
                    //Calculating total price of food in cart
                    String[] cartInfoArr = cartInfo.split(" ", 10);
                    double price = Double.valueOf(cartInfoArr[3]);
                    totalPrice = totalPrice + price;
                    //Writing total price to total price file
                    File f = new File("TotalPrice.txt");
                    FileWriter fw = new FileWriter(f);
                    fw.write(Double.toString(totalPrice));
                    fw.close();
                    //Getting an array of what food is in the cart
                    cartFoodArr = Arrays.copyOf(cartFoodArr, cartFoodArr.length + 1);
                    cartFoodArr[cartFoodArr.length - 1] = (cartInfoArr[1] +" "+ cartInfoArr[2]);
                }
            }
            c.close();
            
            //Displaying the food that is in the cart that is updated and also the price
            totalPriceDisplay.setText(Double.toString(totalPrice));  
            cartList.setListData(cartFoodArr);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
        
    }//GEN-LAST:event_addToCartActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        this.setVisible(false);
        Payment p = new Payment();
        p.setVisible(true);
    }//GEN-LAST:event_paymentActionPerformed

    private void totalPriceDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FoodMenuPane2;
    private javax.swing.JPanel FoodMenuPanel;
    private javax.swing.JButton addToCart;
    private javax.swing.JButton applyFilter;
    private javax.swing.JButton back;
    private javax.swing.JLabel cartLabel;
    private javax.swing.JList<String> cartList;
    private javax.swing.JComboBox<String> cuisineType;
    private javax.swing.JLabel cuisineTypeLabel;
    private javax.swing.JLabel cuisineTypeLabel1;
    private javax.swing.JLabel foodMenuLabel;
    private javax.swing.JList<String> foodMenuList;
    private javax.swing.JComboBox<String> foodType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton payment;
    private javax.swing.JButton removeFromCart;
    private javax.swing.JTextField totalPriceDisplay;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
