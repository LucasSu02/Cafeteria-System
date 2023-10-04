package assignment.oodj_groupassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CustomerFeedback extends javax.swing.JFrame {

    public CustomerFeedback() {
        initComponents();
        readFeedbackFood();
    }
    
    void readFeedbackFood()
    {
        try
        {
            //Feedback is done by one food by a time hence only the first food in the file is needed
            String[] feedbackFoodArr = new String[0];
            File ff = new File("FeedbackFood.txt");
            Scanner s = new Scanner(ff);
            //However the whole file is still read and contained into array
            while (s.hasNext())
            {
                String feedbackFoodLine = s.nextLine();
                if (feedbackFoodLine.contains("UNDONE"))
                {
                    feedbackFoodArr = Arrays.copyOf(feedbackFoodArr, feedbackFoodArr.length + 1);
                    feedbackFoodArr[feedbackFoodArr.length - 1] = (feedbackFoodLine);
                }
            }
            s.close();
            
            //Then the array is splited
            //The reason of putting this into exception is that after one food had done, it will be
            //deleted from the file, eventually the file that contain the food that need feedback will
            //be empty, when this happens the split will cause the program will fail because there is
            //nothing in the array. This condition is also used to indicate the completion fo all feedback
            try
            {
                String[] firstLineArr = feedbackFoodArr[0].split(" ", 10);
                feedbackFood.setText(firstLineArr[3]+" "+ firstLineArr[4]);
            }
            catch (Exception o)
            {
                JOptionPane.showMessageDialog(this, "You had completed your feedbacks, Thanks !");
            }
            
            String[] orderFileContent = new String[0];
            String[] feedbackOrderCodes = new String[0];
            
            //The below process is only terminated after all the feedback for food is completed
            //When this happens the array length will be 0 because it is empty
            if (feedbackFoodArr .length == 0)
            {
                //First of all the order code of the order that done its feedback is read
                File orderCodeFile = new File("FeedbackOrderCode.txt");
                Scanner k = new Scanner(orderCodeFile);
                while (k.hasNext())
                {
                    String orderCodeFileLine = k.nextLine();
                    feedbackOrderCodes = Arrays.copyOf(feedbackOrderCodes, feedbackOrderCodes.length + 1);
                    feedbackOrderCodes[feedbackOrderCodes.length - 1] = (orderCodeFileLine);
                }
                k.close();

                //The whole order file is read and recorded in an array
                File orderFile = new File("Order.txt");
                Scanner c = new Scanner(orderFile);
                while (c.hasNext())
                {
                    String orderFileLine = c.nextLine();
                    orderFileContent = Arrays.copyOf(orderFileContent, orderFileContent.length + 1);
                    orderFileContent[orderFileContent.length - 1] = (orderFileLine);
                }
                c.close();
                
                //Then a nested for loop is applied to find all the location of the order that completed its
                //feedback recently to update the indicator for the completion of feedback
                for (int i=0 ; i<orderFileContent.length ; i++)
                {
                    for (int x=0 ; x<feedbackOrderCodes.length ; x++)
                    {
                        if (orderFileContent[i].contains(feedbackOrderCodes[x]))
                        {
                            orderFileContent[i] = orderFileContent[i].replace("FEED0", "FEED1");
                        }
                    }
                }
                
                //Then the updated array is write again into the order file to replace the old data
                BufferedWriter customerAccountFileUpdate = new BufferedWriter(new FileWriter("Order.txt"));
                for (int i=0; i<orderFileContent.length; i++)
                {
                    customerAccountFileUpdate.write(orderFileContent[i] + "\n");
                }
                customerAccountFileUpdate.write("\n");
                customerAccountFileUpdate.close();
                
                //After that the user will go back to the main menu
                this.setVisible(false);
                CustomerMainMenu mm = new CustomerMainMenu();
                mm.setVisible(true);
            }
        }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FeedbackPanel = new javax.swing.JPanel();
        feedbackSubmit = new javax.swing.JButton();
        feedbackLabel = new javax.swing.JLabel();
        accountLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentInput = new javax.swing.JTextArea();
        feedbackFood = new javax.swing.JTextField();
        FeedbackPanel2 = new javax.swing.JPanel();
        accountLabel = new javax.swing.JLabel();
        ratingInput = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("Feedback"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        FeedbackPanel.setBackground(new java.awt.Color(0, 153, 153));

        feedbackSubmit.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        feedbackSubmit.setText("Sumbit");
        feedbackSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackSubmitActionPerformed(evt);
            }
        });

        feedbackLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        feedbackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feedbackLabel.setText("Recent Order Feedback");

        accountLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        accountLabel1.setText("Comments :");

        commentInput.setColumns(20);
        commentInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        commentInput.setRows(5);
        jScrollPane1.setViewportView(commentInput);

        feedbackFood.setEditable(false);
        feedbackFood.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        feedbackFood.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        feedbackFood.setToolTipText("");

        FeedbackPanel2.setBackground(new java.awt.Color(153, 255, 153));

        accountLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        accountLabel.setText("Ratings :");

        ratingInput.setBackground(new java.awt.Color(255, 255, 255));
        ratingInput.setForeground(new java.awt.Color(51, 51, 51));
        ratingInput.setMaximum(5);
        ratingInput.setPaintLabels(true);
        ratingInput.setPaintTicks(true);

        javax.swing.GroupLayout FeedbackPanel2Layout = new javax.swing.GroupLayout(FeedbackPanel2);
        FeedbackPanel2.setLayout(FeedbackPanel2Layout);
        FeedbackPanel2Layout.setHorizontalGroup(
            FeedbackPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FeedbackPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountLabel)
                    .addComponent(ratingInput, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FeedbackPanel2Layout.setVerticalGroup(
            FeedbackPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingInput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FeedbackPanelLayout = new javax.swing.GroupLayout(FeedbackPanel);
        FeedbackPanel.setLayout(FeedbackPanelLayout);
        FeedbackPanelLayout.setHorizontalGroup(
            FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeedbackPanelLayout.createSequentialGroup()
                .addGap(0, 385, Short.MAX_VALUE)
                .addComponent(feedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(445, 445, 445))
            .addGroup(FeedbackPanelLayout.createSequentialGroup()
                .addGroup(FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FeedbackPanelLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(accountLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(FeedbackPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FeedbackPanelLayout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(feedbackFood, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FeedbackPanelLayout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(feedbackSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FeedbackPanelLayout.setVerticalGroup(
            FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(feedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(feedbackFood, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FeedbackPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(feedbackSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FeedbackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FeedbackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void feedbackSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackSubmitActionPerformed
        try
        {
            String[] feedbackFood = new String[0];
            //The file that contains all the food that need feedback is read and recorded in an array
            //The indication for the food that its feedback is not done is "UNDONE"
            File ff = new File("FeedbackFood.txt");
            Scanner s = new Scanner(ff);
            while (s.hasNext())
            {
                String feedbackFoodLine = s.nextLine();
                if (feedbackFoodLine.contains("UNDONE"))
                {
                    feedbackFood = Arrays.copyOf(feedbackFood, feedbackFood.length + 1);
                    feedbackFood[feedbackFood.length - 1] = (feedbackFoodLine);
                }
            }
            
            //A new string array is created to store the feedback content
            String[] feedbackContent = new String[3];
            //Then all the feedback from the user is obtained
            int rating = ratingInput.getValue();
            String comment = commentInput.getText();
            //This is to check if the user gave any comment or not
            char[] commentChar = comment.toCharArray();
            if (commentChar.length == 0)
            {
                comment = "No_comment";
            }
            //Then the space in the comment is removed to maintain the format of the textfile
            comment = comment.replaceAll(" ", "_");
            feedbackFood[0] = feedbackFood[0].replace(" UNDONE", "");
            //Then all the feedback and the food order information is stored in the array
            feedbackContent[0] = feedbackFood[0];
            feedbackContent[1] = String.valueOf(rating);
            feedbackContent[2] = comment;
            
            //The first food that had done its feedback is deleted
            feedbackFood[0] = ("");
            
            //Writing whats left back into file
            File f = new File("FeedbackFood.txt");
            FileWriter fw1 = new FileWriter(f);
            for (int i=0 ; i<feedbackFood.length ; i++)
            {
                if (feedbackFood[i].contains("UNDONE"))
                {
                    fw1.write(feedbackFood[i]+"\n");
                }
            }
            fw1.close();
            
            //The feedback is appended into the file that contains feedback
            File writeFeedback = new File("Feedbacks.txt");
            FileWriter feedbackWriter = new FileWriter(writeFeedback, true);
            for (int i=0 ; i<feedbackContent.length ; i++)
            {
                feedbackWriter.write(feedbackContent[i] + " ");
            }
            feedbackWriter.write("\n");
            feedbackWriter.close();
            
            //The comment input field for the user is cleared and prepared for next feedback
            commentInput.setText("");
            //Then the function of reading the food that need feedback from the file is called again
            readFeedbackFood();
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_feedbackSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FeedbackPanel;
    private javax.swing.JPanel FeedbackPanel2;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel accountLabel1;
    private javax.swing.JTextArea commentInput;
    private javax.swing.JTextField feedbackFood;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JButton feedbackSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider ratingInput;
    // End of variables declaration//GEN-END:variables
}
