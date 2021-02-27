/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unnamedlibrary;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author fab07
 */
public class unnamedBorrowMenu extends javax.swing.JFrame {

    /**
     * Creates new form unnamedBorrowMenu
     */
    public unnamedBorrowMenu() {
        initComponents();
        initGUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        panTop = new javax.swing.JPanel();
        cbxClientID = new javax.swing.JComboBox<>();
        lblClientID = new javax.swing.JLabel();
        txtClientID = new javax.swing.JFormattedTextField();
        btnLoadBook = new javax.swing.JButton();
        txtBookID = new javax.swing.JFormattedTextField();
        lblBookID = new javax.swing.JLabel();
        txtBorrowDate = new javax.swing.JFormattedTextField();
        btnGetDate = new javax.swing.JButton();
        lblBorrowDate = new javax.swing.JLabel();
        btnCalendar = new javax.swing.JButton();
        panCenter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1218, 820));
        setMinimumSize(new java.awt.Dimension(1218, 820));
        setPreferredSize(new java.awt.Dimension(1218, 820));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(51, 51, 51));
        panMain.setMaximumSize(new java.awt.Dimension(1218, 820));
        panMain.setMinimumSize(new java.awt.Dimension(1218, 820));
        panMain.setPreferredSize(new java.awt.Dimension(1218, 820));
        panMain.setLayout(new java.awt.BorderLayout());

        panTop.setBackground(new java.awt.Color(43, 44, 45));

        cbxClientID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Staff", "Student" }));
        cbxClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClientIDActionPerformed(evt);
            }
        });

        lblClientID.setText("Staff/Student ID:");

        txtClientID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("######"))));
        txtClientID.setText("Staff/Student ID");
        txtClientID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClientIDFocusGained(evt);
            }
        });

        btnLoadBook.setText("Load Book Information");

        txtBookID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("######"))));
        txtBookID.setText("Book ID");
        txtBookID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBookIDFocusGained(evt);
            }
        });

        lblBookID.setText("Book ID:");

        txtBorrowDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtBorrowDate.setText("DD/MM/YYYY");
        txtBorrowDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBorrowDateFocusGained(evt);
            }
        });

        btnGetDate.setText("Get Current Date");

        lblBorrowDate.setText("Borrowing Date:");

        btnCalendar.setText("Open Calendar");

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblClientID, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lblBookID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBorrowDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxClientID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBookID)
                    .addComponent(txtBorrowDate))
                .addGap(6, 6, 6)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addComponent(btnCalendar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetDate))
                    .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnLoadBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtClientID, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(658, Short.MAX_VALUE))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClientID)
                    .addComponent(cbxClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoadBook)
                    .addComponent(lblBookID)
                    .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGetDate)
                            .addComponent(btnCalendar)
                            .addComponent(txtBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBorrowDate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panMain.add(panTop, java.awt.BorderLayout.PAGE_START);

        panCenter.setBackground(new java.awt.Color(34, 34, 34));

        javax.swing.GroupLayout panCenterLayout = new javax.swing.GroupLayout(panCenter);
        panCenter.setLayout(panCenterLayout);
        panCenterLayout.setHorizontalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1218, Short.MAX_VALUE)
        );
        panCenterLayout.setVerticalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        panMain.add(panCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(panMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientIDActionPerformed
        // TODO add your handling code here:
        
        int ctype = cbxClientID.getSelectedIndex(); // Get client type
        
        if (ctype == 0) {
            lblClientID.setText("Staff/Student ID:");
            txtClientID.setText("Staff/Student ID");
        } else {
            try {
            lblClientID.setText(cbxClientID.getSelectedItem().toString() + " ID:");
            txtClientID.setText(cbxClientID.getSelectedItem().toString() + " ID");
            } catch (Exception e) {
            // Popup messagebox to inform user of unexpected error
            }
        }
    }//GEN-LAST:event_cbxClientIDActionPerformed

    private void txtClientIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClientIDFocusGained
        // TODO add your handling code here:
        
        String[] ctype = new String[]{"Staff/Student ID", "Staff ID", "Student ID"};
        String temp = txtClientID.getText();
        
        if (Arrays.asList(ctype).contains(temp)) {
            txtClientID.setText("");
        }
        
        
    }//GEN-LAST:event_txtClientIDFocusGained

    private void txtBookIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBookIDFocusGained
        // TODO add your handling code here:
        if ("Book ID".equals(txtBookID.getText())) {
            txtBookID.setText("");
        }
    }//GEN-LAST:event_txtBookIDFocusGained

    private void txtBorrowDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBorrowDateFocusGained
        // TODO add your handling code here:
        if ("DD/MM/YYYY".equals(txtBorrowDate.getText())) {
            txtBorrowDate.setText("");
        }
    }//GEN-LAST:event_txtBorrowDateFocusGained

    
    
    private void initGUI(){
        
    }
    
    
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
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatDarkLaf");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unnamedBorrowMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnGetDate;
    private javax.swing.JButton btnLoadBook;
    private javax.swing.JComboBox<String> cbxClientID;
    private javax.swing.JLabel lblBookID;
    private javax.swing.JLabel lblBorrowDate;
    private javax.swing.JLabel lblClientID;
    private javax.swing.JPanel panCenter;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panTop;
    private javax.swing.JFormattedTextField txtBookID;
    private javax.swing.JFormattedTextField txtBorrowDate;
    private javax.swing.JFormattedTextField txtClientID;
    // End of variables declaration//GEN-END:variables
}
