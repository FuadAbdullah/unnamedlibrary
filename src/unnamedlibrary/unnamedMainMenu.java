/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unnamedlibrary;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author fab07
 */
public class unnamedMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form unnamedMainMenu
     */
    public unnamedMainMenu() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        panCenter = new javax.swing.JPanel();
        panControl = new javax.swing.JPanel();
        panButtons = new javax.swing.JPanel();
        btnBorrow = new javax.swing.JButton();
        btnRenew = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu - unnamed Library Management System");
        setMaximumSize(new java.awt.Dimension(804, 450));
        setMinimumSize(new java.awt.Dimension(804, 450));
        setName("mainMenuFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(804, 450));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(51, 51, 51));
        panMain.setMaximumSize(new java.awt.Dimension(800, 400));
        panMain.setMinimumSize(new java.awt.Dimension(800, 400));
        panMain.setPreferredSize(new java.awt.Dimension(800, 400));
        panMain.setLayout(new java.awt.BorderLayout());

        panTop.setBackground(new java.awt.Color(43, 44, 45));
        panTop.setMaximumSize(new java.awt.Dimension(804, 116));
        panTop.setMinimumSize(new java.awt.Dimension(804, 116));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("unnamed Library Management System");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Logged in as Librarian <Librarian ID>, hello <username>!");

        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.setToolTipText("Logs out current user");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panTopLayout.createSequentialGroup()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panMain.add(panTop, java.awt.BorderLayout.PAGE_START);

        panCenter.setBackground(new java.awt.Color(34, 34, 34));
        panCenter.setMaximumSize(new java.awt.Dimension(800, 284));
        panCenter.setMinimumSize(new java.awt.Dimension(800, 284));
        panCenter.setPreferredSize(new java.awt.Dimension(800, 284));

        panControl.setBackground(new java.awt.Color(48, 48, 48));
        panControl.setMaximumSize(new java.awt.Dimension(800, 426));
        panControl.setMinimumSize(new java.awt.Dimension(800, 426));
        panControl.setPreferredSize(new java.awt.Dimension(800, 426));

        panButtons.setMaximumSize(new java.awt.Dimension(788, 414));
        panButtons.setMinimumSize(new java.awt.Dimension(788, 414));
        panButtons.setLayout(new java.awt.GridLayout(1, 0));

        btnBorrow.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        btnBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/book1.png"))); // NOI18N
        btnBorrow.setText("   Borrow");
        btnBorrow.setToolTipText("Opens borrowing form");
        btnBorrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        panButtons.add(btnBorrow);

        btnRenew.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        btnRenew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow1.png"))); // NOI18N
        btnRenew.setText("   Renew");
        btnRenew.setToolTipText("Opens borrow renew form");
        btnRenew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewActionPerformed(evt);
            }
        });
        panButtons.add(btnRenew);

        btnReturn.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/checked1.png"))); // NOI18N
        btnReturn.setText("   Return");
        btnReturn.setToolTipText("Opens borrow return form");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panButtons.add(btnReturn);

        btnHistory.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/history1.png"))); // NOI18N
        btnHistory.setText("   History");
        btnHistory.setToolTipText("Opens borrowing history page");
        btnHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panButtons.add(btnHistory);

        javax.swing.GroupLayout panControlLayout = new javax.swing.GroupLayout(panControl);
        panControl.setLayout(panControlLayout);
        panControlLayout.setHorizontalGroup(
            panControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panControlLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panControlLayout.setVerticalGroup(
            panControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panControlLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(panButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panCenterLayout = new javax.swing.GroupLayout(panCenter);
        panCenter.setLayout(panCenterLayout);
        panCenterLayout.setHorizontalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panCenterLayout.setVerticalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCenterLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(panControl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        panMain.add(panCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(panMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // TO COMMENT
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Logging out!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            new unnamedLogin().setVisible(true);
            this.dispose();
        } else {
            // Do nothing
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // This method closes main menu and opens borrowing form
    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        // TODO add your handling code here:
        new unnamedBorrowMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewActionPerformed
        // TODO add your handling code here:
        new unnamedRenewMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRenewActionPerformed

    private void initGUI(){
        
        // This anon class handles window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Closing Window", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (selection == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
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
                new unnamedMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnRenew;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panButtons;
    private javax.swing.JPanel panCenter;
    private javax.swing.JPanel panControl;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panTop;
    // End of variables declaration//GEN-END:variables
}
