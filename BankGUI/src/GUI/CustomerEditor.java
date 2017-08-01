/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



/**
 *
 * @author hsedi
 */
public class CustomerEditor extends javax.swing.JFrame {

    private ArrayList<String> AccountNumbers = new ArrayList<>();
    private ArrayList<String> customersNames = new ArrayList<>();
    private DefaultListModel listModel = new DefaultListModel();
    private static CustomerAccount cusAcc;
    private CreateCustomer newCustomer = new CreateCustomer();
    
    /**
     * Creates new form CustomerEditor
     */
    public CustomerEditor() {
        
        initComponents();
        AccountNumbers = (ArrayList<String>) getAllCustomersDetails();
        customersNames = (ArrayList<String>) getCustomerName();
        for (int i = 0; i < AccountNumbers.size(); i++) {
            String getAccountNumber = AccountNumbers.get(i);
            String getName = customersNames.get(i);
            listModel.addElement(getAccountNumber+"-"+getName);
            System.out.println(listModel.getElementAt(i));            
        }   
        jListCustomer.setModel(listModel);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnCreateCustomer = new javax.swing.JButton();
        jbtnSelectCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCustomer = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customers");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jbtnCreateCustomer.setBackground(new java.awt.Color(102, 102, 255));
        jbtnCreateCustomer.setText("Create");
        jbtnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCreateCustomerActionPerformed(evt);
            }
        });

        jbtnSelectCustomer.setBackground(new java.awt.Color(102, 102, 255));
        jbtnSelectCustomer.setText("Select");
        jbtnSelectCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelectCustomerActionPerformed(evt);
            }
        });

        jListCustomer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListCustomer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSelectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnCreateCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSelectCustomer)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void jbtnSelectCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelectCustomerActionPerformed
        // TODO add your handling code here:
        if (jListCustomer.getSelectedIndex() != -1) {
            String data = jListCustomer.getSelectedValue();
            System.out.println("GG "+data);
            String[] curruntCustomerAccountNumber = data.split("-");
            getCurrentCusAccNo(curruntCustomerAccountNumber[0]);
            cusAcc = new CustomerAccount();
            cusAcc.setVisible(true);
            
        }else{
        JOptionPane.showMessageDialog(null, "Please select a customer first", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbtnSelectCustomerActionPerformed

    private void jbtnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCreateCustomerActionPerformed
        // TODO add your handling code here:
        newCustomer.setVisible(true);
    }//GEN-LAST:event_jbtnCreateCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jListCustomer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCreateCustomer;
    private javax.swing.JButton jbtnSelectCustomer;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> getAllCustomersDetails() {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.getAllCustomersDetails();
    }

    private static List<String> getCustomerName() {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.getCustomerName();
    }

    private static void getCurrentCusAccNo(java.lang.String accNO) {
        com.bankservice.CustomerWebService_Service service = new com.bankservice.CustomerWebService_Service();
        com.bankservice.CustomerWebService port = service.getCustomerWebServicePort();
        port.getCurrentCusAccNo(accNO);
    }
    
}
