/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.oodj_groupassignment;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author wongj
 */
public class AllOrders extends javax.swing.JFrame {

    /**
     * Creates new form ManageOrder
     */
    public AllOrders() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        storage = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        customerID = new javax.swing.JTextField();
        feedbacked = new javax.swing.JTextField();
        orderStatus = new javax.swing.JTextField();
        foodID = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JList<>();
        jLabel26 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        foodName = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        completeButton = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        rateFeedback = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(200, 182, 226));

        storage.setEditable(false);
        storage.setBackground(new java.awt.Color(200, 182, 226));
        storage.setColumns(1);
        storage.setForeground(new java.awt.Color(200, 182, 226));
        storage.setRows(1);
        storage.setToolTipText("");
        storage.setAutoscrolls(false);
        storage.setBorder(null);
        storage.setCaretColor(new java.awt.Color(200, 182, 226));
        storage.setDisabledTextColor(new java.awt.Color(200, 182, 226));
        storage.setFocusable(false);
        storage.setSelectedTextColor(new java.awt.Color(200, 182, 226));
        storage.setSelectionColor(new java.awt.Color(200, 182, 226));

        jLabel22.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setText("Customer ID :");

        jLabel23.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel23.setText("Feedback Status :");

        jLabel24.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 204));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel24.setText("Order Status :");

        jLabel25.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("Food ID :");

        customerID.setBackground(new java.awt.Color(168, 164, 206));
        customerID.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        customerID.setForeground(new java.awt.Color(255, 255, 204));

        feedbacked.setBackground(new java.awt.Color(168, 164, 206));
        feedbacked.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        feedbacked.setForeground(new java.awt.Color(255, 255, 204));

        orderStatus.setBackground(new java.awt.Color(168, 164, 206));
        orderStatus.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        orderStatus.setForeground(new java.awt.Color(255, 255, 204));

        foodID.setBackground(new java.awt.Color(168, 164, 206));
        foodID.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        foodID.setForeground(new java.awt.Color(255, 255, 204));

        searchButton.setBackground(new java.awt.Color(73, 92, 131));
        searchButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 204));
        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(73, 92, 131));
        clearButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 204));
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        orderList.setBackground(new java.awt.Color(168, 164, 206));
        orderList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        orderList.setForeground(new java.awt.Color(255, 255, 204));
        orderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(orderList);

        jLabel26.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 204));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("Date :");

        date.setBackground(new java.awt.Color(168, 164, 206));
        date.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 204));

        deleteButton.setBackground(new java.awt.Color(73, 92, 131));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 204));
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        foodName.setBackground(new java.awt.Color(168, 164, 206));
        foodName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        foodName.setForeground(new java.awt.Color(255, 255, 204));

        jLabel27.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 204));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("Food Name :");

        completeButton.setBackground(new java.awt.Color(73, 92, 131));
        completeButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        completeButton.setForeground(new java.awt.Color(255, 255, 204));
        completeButton.setSelected(true);
        completeButton.setText("Complete Order");
        completeButton.setEnabled(false);
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(122, 134, 182));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("manage ORDER");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 255, 51));
        logout.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 0, 0));
        logout.setText("Log Out");
        logout.setAlignmentY(0.0F);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setIconTextGap(0);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        menuButton.setBackground(new java.awt.Color(73, 92, 131));
        menuButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuButton.setForeground(new java.awt.Color(255, 255, 204));
        menuButton.setText("Manage Menu");
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });

        orderButton.setBackground(new java.awt.Color(73, 92, 131));
        orderButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        orderButton.setForeground(new java.awt.Color(255, 255, 204));
        orderButton.setText("Manage Order");
        orderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderButtonMouseClicked(evt);
            }
        });

        rateFeedback.setBackground(new java.awt.Color(73, 92, 131));
        rateFeedback.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rateFeedback.setForeground(new java.awt.Color(255, 255, 204));
        rateFeedback.setText("Rating & Feedback");
        rateFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rateFeedbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(rateFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rateFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(feedbacked, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foodName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodID, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(storage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feedbacked, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(foodName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126))))
                    .addComponent(jScrollPane2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rateFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rateFeedbackMouseClicked
        // this button calls the RateFeedback form
        RateFeedback feedback = new RateFeedback();
        feedback.setVisible(true);
        this.setVisible(false);
        feedback.setTitle("APU Cafeteria Ordering System");
        feedback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        feedback.setResizable(false);
    }//GEN-LAST:event_rateFeedbackMouseClicked

    private void orderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_orderButtonMouseClicked

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        // this button calls the EditFoodMenu form
        EditFoodMenu menu = new EditFoodMenu();
        menu.setVisible(true);
        this.setVisible(false);
        menu.setTitle("APU Cafeteria Ordering System");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
    }//GEN-LAST:event_menuButtonMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // this button calls the ManagerLogin form
        ManagerLogin ALog = new ManagerLogin();
        ALog.setVisible(true);
        this.setVisible(false);
        ALog.setTitle("APU Cafeteria Ordering System");
        ALog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ALog.setResizable(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        // this button calls methods to change the order completion status
        int a;
        if (completeButton.getModel().isSelected() && orderList.getSelectedValue() != null) {
            orderStatus.setText("COMP1");
            completeButton.setText("Undo Complete Order");
            a = 1;
        }
        else
        {
            completeButton.setText("Complete Order");
            orderStatus.setText("COMP0");
            a = 0;
        }

        int b = orderList.getSelectedIndex();
        String[] index = storage.getText().split(" ");
        int[] intIndex = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            intIndex[i] = Integer.parseInt(index[i]);
        }
        // overwrites the data into text file
        AllOrderClass completeOrder = new AllOrderClass();
        completeOrder.readOrder();
        completeOrder.completeOrder(intIndex[b], a);
        completeOrder.writeOrderFile();
    }//GEN-LAST:event_completeButtonActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // button to delete a order record from the file
        int deleteFood = orderList.getSelectedIndex();
        String[] index = storage.getText().split(" ");
        int[] intIndex = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            intIndex[i] = Integer.parseInt(index[i]);
        }
        AllOrderClass deleteData = new AllOrderClass();
        deleteData.readOrder();
        deleteData.deleteOrder(intIndex[deleteFood]);
        deleteData.writeOrderFile();
        ((DefaultListModel) orderList.getModel()).remove(deleteFood);
        JOptionPane.showMessageDialog(this, "Selected order has been deleted.");

    }//GEN-LAST:event_deleteButtonMouseClicked

    private void orderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListMouseClicked
        // copies the selected field from the list to the left side text fields and enables the manager to edit order status
        int a;
        if (orderList.getSelectedValue() != null)
        {
            completeButton.setEnabled(true);
            feedbacked.setText(""); orderStatus.setText(""); foodID.setText("");
            customerID.setText(""); foodName.setText(""); date.setText("");

            String[] editFoodArr = orderList.getSelectedValue().split(" ");
            a = orderList.getSelectedIndex();
            System.out.println(a);
            customerID.setText(editFoodArr[0]);
            customerID.setEditable(false);
            feedbacked.setText(editFoodArr[4]);
            feedbacked.setEditable(false);
            orderStatus.setText(editFoodArr[5]);
            orderStatus.setEditable(false);
            foodID.setText(editFoodArr[7]);
            foodID.setEditable(false);
            foodName.setText(editFoodArr[8]);
            foodName.setEditable(false);
            date.setText(editFoodArr[1]);
            date.setEditable(false);
            if (orderStatus.getText().equals("COMP0"))
            {
                completeButton.setText("Complete Order");
                completeButton.setSelected(false);
            }
            else
            {
                completeButton.setText("Undo Complete Order");
                completeButton.setSelected(true);
            }

        }
    }//GEN-LAST:event_orderListMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // clears all the display field and temporary data storage
        String[] clearList = new String[0];
        orderList.setListData(clearList);
        customerID.setEditable(true);
        feedbacked.setText("");
        feedbacked.setEditable(true);
        orderStatus.setText("");
        orderStatus.setEditable(true);
        foodID.setText("");
        foodID.setEditable(true);
        customerID.setText("");
        customerID.setEditable(true);
        foodName.setText("");
        foodName.setEditable(true);
        date.setText("");
        date.setEditable(true);
        storage.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // calls methods to search for matching order record with user input
        String[] clearList = new String[0];
        orderList.setListData(clearList);
        String cID = customerID.getText().trim();
        String sStatus = feedbacked.getText().trim();
        String oStatus = orderStatus.getText().trim();
        String fID = foodID.getText().trim();
        String fName = foodName.getText().trim().replaceAll(" ", "_");
        String d = date.getText().trim();
        if (!d.isEmpty()) {
            try {
                String[] temp = d.split("/");
                int test1, test2, test3;
                test1 = Integer.parseInt(temp[0]);
                test2 = Integer.parseInt(temp[1]);
                test3 = Integer.parseInt(temp[2]);
                if (test1 > 31 || test1 < 1 || test2 > 12 || test2 < 1 || test3 > 3000 || test3 < 1900) {
                    NumberFormatException thr = new NumberFormatException();
                    throw thr;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                    "Date can only be in format of DD/MM/YYYY");
                e.printStackTrace();
            }
        }
        AllOrderClass search = new AllOrderClass();
        search.readOrder();
        String[] searchStr1 = {cID, d, sStatus, oStatus};
        String[] searchStr2 = {fID, fName};
        List<Integer> index = search.checkOrder(searchStr1, searchStr2);
        storage.setVisible(false);
        storage.setText("");
        for(Integer integer: index)
            storage.append(String.valueOf(integer) + " ");
        if (index.get(index.size() - 1) == 0)
            JOptionPane.showMessageDialog(this,"No matching record found.");
        else
        {
            List<String> output = new ArrayList<String>();
            String tempStorage;
            for (int i = 0; i < (index.size() - 1); i++)
            {
                tempStorage = (search.data.get(index.get(i)));
                tempStorage = tempStorage.replaceAll("!"," ");
                tempStorage = tempStorage.replaceAll("@"," ");
                output.add(tempStorage);
            }
            String[] menuPrint = output.toArray(new String[0]);
            orderList.setListData(menuPrint);
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // this button calls the Menu form
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);
        menu.setTitle("APU Cafeteria Ordering System");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JToggleButton completeButton;
    private javax.swing.JTextField customerID;
    private javax.swing.JTextField date;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField feedbacked;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField foodID;
    private javax.swing.JTextField foodName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JList<String> orderList;
    private javax.swing.JTextField orderStatus;
    private javax.swing.JButton rateFeedback;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextArea storage;
    // End of variables declaration//GEN-END:variables
}
