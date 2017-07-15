/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author hsedi
 */
public class CustomerAccount extends javax.swing.JFrame {

    private String accNo;
    private String BD;
    private String balance;
    private ArrayList<String> stringDeatails = new ArrayList<>();
    
    /** Creates new form CustomerAccount */
    public CustomerAccount() {
        initComponents();
        accNo = sendCusAccNo();//get current customer acoountNumber
        BD = setCustomerBD(accNo);//get current customer birth day
        balance = Double.toString(setBalance(accNo));
        System.out.println(BD);
        System.out.println("sended "+accNo);//for debugging
        stringDeatails = (ArrayList<String>) sendAllStringDetails(accNo);// get all default string data of the customer
        System.out.println("kk"+stringDeatails);// for debuging purpose
        
        //setting the textfieds
        jTxtCustomerName.setText(stringDeatails.get(0));
        jTextAreaAddress.setText(stringDeatails.get(1));
        jTxtCustomerMobile.setText(stringDeatails.get(2));
        jTxtCustomerEmail.setText(stringDeatails.get(3));
        jTxtCustomerAccountType.setText(stringDeatails.get(4));
        jTxtCustomerAccountNumber.setText(stringDeatails.get(5));
        jTxtCustomerCard.setText(stringDeatails.get(6));
        jTxtCustomerBD.setText(BD);
        jTxtCustomerBalance.setText(accNo);
        jTxtCustomerBalance.setText(balance);
        jTxtCustomerSortCode.setText(Integer.toString(setSortCode(accNo)));
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtCustomerName = new javax.swing.JTextField();
        jTxtCustomerBD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtCustomerMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtCustomerEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtCustomerAccountType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtCustomerAccountNumber = new javax.swing.JTextField();
        jTxtCustomerSortCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtCustomerBalance = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtCustomerCard = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBtnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jBtnSave = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Details");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Name :");

        jTxtCustomerName.setEditable(false);

        jTxtCustomerBD.setEditable(false);

        jLabel2.setText("Birth Date : ");

        jLabel3.setText("Address : ");

        jTxtCustomerMobile.setEditable(false);

        jLabel4.setText("Mobile : ");

        jTxtCustomerEmail.setEditable(false);

        jLabel5.setText("Email : ");

        jTxtCustomerAccountType.setEditable(false);

        jLabel6.setText("Account Type : ");

        jLabel7.setText("Account Number : ");

        jTxtCustomerAccountNumber.setEditable(false);

        jTxtCustomerSortCode.setEditable(false);

        jLabel8.setText("Sort Cord : ");

        jTxtCustomerBalance.setEditable(false);

        jLabel9.setText("Balance : ");

        jTxtCustomerCard.setEditable(false);

        jLabel10.setText("Card : ");

        jBtnEdit.setText("Edit");
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });

        jTextAreaAddress.setEditable(false);
        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(2);
        jTextAreaAddress.setTabSize(5);
        jTextAreaAddress.setToolTipText("");
        jTextAreaAddress.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jBtnSave.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBtnSave.setText("Save");
        jBtnSave.setEnabled(false);
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCustomerCard, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCustomerBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEdit))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCustomerBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSave))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtCustomerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtCustomerAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtCustomerAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtCustomerSortCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtCustomerBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTxtCustomerCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        // TODO add your handling code here:
        
        //enabling components
        jTextAreaAddress.setEnabled(true);
        jBtnSave.setEnabled(true);
        jTxtCustomerAccountNumber.setEnabled(true);
        jTxtCustomerAccountType.setEnabled(true);
        jTxtCustomerBD.setEnabled(true);
        jTxtCustomerBalance.setEnabled(true);
        jTxtCustomerCard.setEnabled(true);
        jTxtCustomerEmail.setEnabled(true);
        jTxtCustomerMobile.setEnabled(true);
        jTxtCustomerName.setEnabled(true);
        jTxtCustomerSortCode.setEnabled(true);
        //enable editing
        jTextAreaAddress.setEditable(true);
        jBtnSave.setEnabled(true);
        jTxtCustomerAccountNumber.setEditable(true);
        jTxtCustomerAccountType.setEditable(true);
        jTxtCustomerBD.setEditable(true);
        jTxtCustomerBalance.setEditable(true);
        jTxtCustomerCard.setEditable(true);
        jTxtCustomerEmail.setEditable(true);
        jTxtCustomerMobile.setEditable(true);
        jTxtCustomerName.setEditable(true);
        jTxtCustomerSortCode.setEditable(true);
    }//GEN-LAST:event_jBtnEditActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jBtnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTxtCustomerAccountNumber;
    private javax.swing.JTextField jTxtCustomerAccountType;
    private javax.swing.JTextField jTxtCustomerBD;
    private javax.swing.JTextField jTxtCustomerBalance;
    private javax.swing.JTextField jTxtCustomerCard;
    private javax.swing.JTextField jTxtCustomerEmail;
    private javax.swing.JTextField jTxtCustomerMobile;
    private javax.swing.JTextField jTxtCustomerName;
    private javax.swing.JTextField jTxtCustomerSortCode;
    // End of variables declaration//GEN-END:variables

   
    
    private static String sendCusAccNo() {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.sendCusAccNo();
    }

    private static java.util.List<java.lang.String> sendAllStringDetails(java.lang.String accNo) {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.sendAllStringDetails(accNo);
    }

    private static String setCustomerBD(java.lang.String accNo) {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.setCustomerBD(accNo);
    }

    private static double setBalance(java.lang.String accNo) {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.setBalance(accNo);
    }

    private static int setSortCode(java.lang.String accNo) {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.setSortCode(accNo);
    }

}