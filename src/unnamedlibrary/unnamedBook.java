/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unnamedlibrary;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.NumberFormatter;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author fab07
 */
public class unnamedBook extends javax.swing.JFrame {

    String brtxt, ctxt, btxt, ext, cspecies, brID, cID, bID, saveDir;
    boolean cerr, berr, brerr; // Client error, book error, borrow date error, borrowing id error
    boolean fetchedClient, fetchedBook, fetchedBorrow;// Booleans for client, book and borrow fetch statuses
    boolean isOverdue, hasRenewed, hasFine, hasReturned; 
    final String bpfix = "BOO", brpfix = "BOR"; // For book and borrow ID prefixes
    Color fgtxt = new Color(187,187,187); // Default foreground color for text
    int newBookID; // To store new book ID
    
    /**
     * Creates new form unnamedBook
     */
    public unnamedBook() {
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
        btnCancel = new javax.swing.JButton();
        lblBookDetailsTitle = new javax.swing.JLabel();
        panCenter = new javax.swing.JPanel();
        panFormCont = new javax.swing.JPanel();
        panBar = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        lblActionButton = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        panForm = new javax.swing.JPanel();
        lblBookTitle = new javax.swing.JLabel();
        lblBookGenre = new javax.swing.JLabel();
        lblBookSummary = new javax.swing.JLabel();
        lblBookQuantity = new javax.swing.JLabel();
        lblBookPublisher = new javax.swing.JLabel();
        lblBookAuthor = new javax.swing.JLabel();
        lblArrivalDate = new javax.swing.JLabel();
        txtBookTitle = new javax.swing.JTextField();
        txtBookGenre = new javax.swing.JTextField();
        txtBookPublisher = new javax.swing.JTextField();
        txtPublishDate = new javax.swing.JFormattedTextField();
        txtArrivalDate = new javax.swing.JFormattedTextField();
        txtBookQuantity = new javax.swing.JFormattedTextField();
        txtBookAuthor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBookSummary = new javax.swing.JTextArea();
        lblPublishDate = new javax.swing.JLabel();
        cbxBookID = new javax.swing.JComboBox<>();
        lblBookID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage books - unnamed Library Management System");
        setName("unnamedBook"); // NOI18N
        setResizable(false);

        panMain.setBackground(new java.awt.Color(51, 51, 51));
        panMain.setMaximumSize(new java.awt.Dimension(600, 680));
        panMain.setMinimumSize(new java.awt.Dimension(600, 680));
        panMain.setPreferredSize(new java.awt.Dimension(600, 680));
        panMain.setLayout(new java.awt.BorderLayout());

        panTop.setBackground(new java.awt.Color(43, 44, 45));
        panTop.setMaximumSize(new java.awt.Dimension(1218, 160));
        panTop.setMinimumSize(new java.awt.Dimension(1218, 160));

        btnCancel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnCancel.setText("Return");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblBookDetailsTitle.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        lblBookDetailsTitle.setText("Book Management");

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBookDetailsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap())
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(lblBookDetailsTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panMain.add(panTop, java.awt.BorderLayout.PAGE_START);

        panCenter.setBackground(new java.awt.Color(34, 34, 34));
        panCenter.setLayout(new java.awt.GridLayout());

        panFormCont.setBackground(new java.awt.Color(28, 28, 28));
        panFormCont.setLayout(new java.awt.BorderLayout());

        panBar.setBackground(new java.awt.Color(33, 31, 31));
        panBar.setMaximumSize(new java.awt.Dimension(609, 80));
        panBar.setMinimumSize(new java.awt.Dimension(609, 80));
        panBar.setPreferredSize(new java.awt.Dimension(609, 80));

        btnDelete.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblActionButton.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblActionButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblActionButton.setText("Action Button(s):");

        btnUpdate.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAdd.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panBarLayout = new javax.swing.GroupLayout(panBar);
        panBar.setLayout(panBarLayout);
        panBarLayout.setHorizontalGroup(
            panBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBarLayout.createSequentialGroup()
                        .addComponent(lblActionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panBarLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18))))
        );
        panBarLayout.setVerticalGroup(
            panBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblActionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnReset))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panFormCont.add(panBar, java.awt.BorderLayout.PAGE_END);

        panForm.setBackground(new java.awt.Color(28, 28, 28));

        lblBookTitle.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblBookTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBookTitle.setText("Book Title:");

        lblBookGenre.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblBookGenre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBookGenre.setText("Book Genre:");

        lblBookSummary.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblBookSummary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBookSummary.setText("Book Summary:");

        lblBookQuantity.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblBookQuantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBookQuantity.setText("Quantity Available:");

        lblBookPublisher.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblBookPublisher.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBookPublisher.setText("Book Publisher:");

        lblBookAuthor.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblBookAuthor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBookAuthor.setText("Book Author:");

        lblArrivalDate.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblArrivalDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArrivalDate.setText("Book Arrival Date:");

        txtBookTitle.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtBookTitle.setText("Title of the book");

        txtBookGenre.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtBookGenre.setText("Genre of the book");

        txtBookPublisher.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtBookPublisher.setText("Publisher of the book");

        txtPublishDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtPublishDate.setText("01/01/2001");
        txtPublishDate.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N

        txtArrivalDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtArrivalDate.setText("01/01/2001");
        txtArrivalDate.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N

        txtBookQuantity.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("######"))));
        txtBookQuantity.setText("0");
        txtBookQuantity.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N

        txtBookAuthor.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtBookAuthor.setText("Author of the book");

        txtBookSummary.setColumns(20);
        txtBookSummary.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtBookSummary.setLineWrap(true);
        txtBookSummary.setRows(3);
        txtBookSummary.setText("Summary of the book");
        jScrollPane2.setViewportView(txtBookSummary);

        lblPublishDate.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        lblPublishDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPublishDate.setText("Book Publish Date:");

        cbxBookID.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxBookID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book ID" }));
        cbxBookID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBookID.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        lblBookID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBookID.setText("Load Existing Book:");

        javax.swing.GroupLayout panFormLayout = new javax.swing.GroupLayout(panForm);
        panForm.setLayout(panFormLayout);
        panFormLayout.setHorizontalGroup(
            panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormLayout.createSequentialGroup()
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panFormLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblBookQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBookPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBookSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblBookGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblPublishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPublishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(txtBookGenre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBookTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtBookAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        panFormLayout.setVerticalGroup(
            panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBookID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookTitle)
                    .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBookGenre))
                .addGap(26, 26, 26)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFormLayout.createSequentialGroup()
                        .addComponent(lblBookSummary)
                        .addGap(87, 87, 87)
                        .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookQuantity))
                        .addGap(17, 17, 17)
                        .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookPublisher))
                        .addGap(18, 18, 18)
                        .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookAuthor)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFormLayout.createSequentialGroup()
                        .addComponent(lblPublishDate)
                        .addGap(26, 26, 26)
                        .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArrivalDate)
                            .addComponent(txtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPublishDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        panFormCont.add(panForm, java.awt.BorderLayout.CENTER);

        panCenter.add(panFormCont);

        panMain.add(panCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(panMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selection = JOptionPane.showConfirmDialog(null, "Closing this form now will cancel any book editing, deleting or adding process. Continue?", "Returning to main menu!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (selection == JOptionPane.YES_OPTION) {
            new unnamedMainMenu().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void getTodayDate(JFormattedTextField txt){
        // To get current date
        Calendar bdate = Calendar.getInstance();
        SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
        
        // To display date into publish date textfield
        txt.setText(datef.format(bdate.getTime()));
        
    }
    
    // NOTE TO SELF FOR TOMORROW
    // IMPLEMENT DELETE > UPDATE and lastly LOAD FROM EXISTING BOOK ID
    // FOLLOW THIS ORDER WILL BE MUCH EASIER
    // This method handles addition of books into the system
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        // Declaring file extension used
        ext = ".txt";        
        saveDir = System.getProperty("user.dir") + "\\src\\localdb\\";
        // Formatting ID into formal 6-digit mask
        DecimalFormat dc = new DecimalFormat("000000");
        try {
            // Fetching IDs from the textfields
            bID = dc.format(newBookID);
            // Storing Borrowing entries into variables
            // Check if the date is unset or left empty
            if ("".equals(txtPublishDate.getText()) || "01/01/2001".equals(txtPublishDate.getText())) {
                JOptionPane.showMessageDialog(null, "Publish date is empty or unset! Autosetting value to today's date", "Invalid publish date!", JOptionPane.ERROR_MESSAGE);
                getTodayDate(txtPublishDate); // Setting publish textfield to today's date
            }
            if ("".equals(txtArrivalDate.getText()) || "01/01/2001".equals(txtArrivalDate.getText())) {
                JOptionPane.showMessageDialog(null, "Arrival date is empty or unset! Autosetting value to today's date", "Invalid arrival date!", JOptionPane.ERROR_MESSAGE);
                getTodayDate(txtArrivalDate); // Setting publish textfield to today's date
            }
            String bTitle = txtBookTitle.getText();
            String bGenre = txtBookGenre.getText();
            String bSummary = txtBookSummary.getText();
            String bQuantity = txtBookQuantity.getText();
            String bPublisher = txtBookAuthor.getText();
            String bAuthor = txtBookPublisher.getText();
            String bPublishDate = txtPublishDate.getText();
            String bArrivalDate = txtArrivalDate.getText();
            // Checking if book quantity to be added is 0
            if (Integer.parseInt(bQuantity) == 0) {
                JOptionPane.showMessageDialog(null, "Book quantity to be added cannot be 0! Autosetting value to 1.", "Invalid book quantity!", JOptionPane.ERROR_MESSAGE);
                bQuantity = "1";
            }
            // FileWriter and PrintWriter to create and write into book.txt
            try {
                // FileWriter to write into a new file called book.txt
                FileWriter bd = new FileWriter(saveDir + "book.txt", true); 
                // PrintWriter to print into book.txt
                PrintWriter bdp = new PrintWriter(bd); 
                // To print the line into Borrowing textfile
                bdp.println(bpfix + bID + ":" +
                             bTitle + ":" +
                             bGenre + ":" +
                             bSummary + ":" +
                             bQuantity + ":" +
                             bAuthor + ":" + 
                             bPublisher + ":" +
                             bPublishDate + ":" +
                             bArrivalDate + ":" + 
                             "false"); // false to indicate hasn't been deleted status
                bdp.close();
                // To display completed borrowing process status
                JOptionPane.showMessageDialog(null, "Book is successfully added! Press OK to return to book management form.", "Adding book succeeded!", JOptionPane.INFORMATION_MESSAGE);
                // To refresh new ID 
                borrowIncrementor();
                JOptionPane.showMessageDialog(null, newBookID);
                // To reload the book information
                // Integrate the reload part with combo box implementation of Book ID
            } catch (IOException ex) {
                Logger.getLogger(unnamedBorrowMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please check your input to proceed.", "Invalid insertion detected!", JOptionPane.ERROR_MESSAGE);
            // Continue with displaying which field was affected. ensure it appears before the mnessagebox
        }
                
    }//GEN-LAST:event_btnAddActionPerformed
    
    // This method will check through borrowing.txt and look for latest ID and increments from there
    private void borrowIncrementor(){
        // This is to ensure the entire method have access to the matchedID array
        String[] matchedID = null;
        try {
            saveDir = System.getProperty("user.dir") + "\\src\\localdb\\";
            // For debugging purpose only
            // JOptionPane.showMessageDialog(null, bID);
            File booktxt = new File(saveDir + "book.txt");
            Scanner inputFile;
            try {
                inputFile = new Scanner(booktxt);
                // Read lines from the file until no more are left.
                while (inputFile.hasNext())
                {
                   // Read the next line.
                   String bEntry = inputFile.nextLine();
                   // Split the line by using the delimiter ":" (semicolon) and store into array.
                   matchedID = bEntry.split(":");
                   matchedID[0] = matchedID[0].replace("BOO", "");
                }
                inputFile.close();
                newBookID = Integer.parseInt(matchedID[0]) + 1;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(unnamedBorrowMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid input! Book ID can only consist of numbers", "Invalid input type!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void initGUI(){
        // Set the initial value for new book
        borrowIncrementor();
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
                new unnamedBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxBookID;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblActionButton;
    private javax.swing.JLabel lblArrivalDate;
    private javax.swing.JLabel lblBookAuthor;
    private javax.swing.JLabel lblBookDetailsTitle;
    private javax.swing.JLabel lblBookGenre;
    private javax.swing.JLabel lblBookID;
    private javax.swing.JLabel lblBookPublisher;
    private javax.swing.JLabel lblBookQuantity;
    private javax.swing.JLabel lblBookSummary;
    private javax.swing.JLabel lblBookTitle;
    private javax.swing.JLabel lblPublishDate;
    private javax.swing.JPanel panBar;
    private javax.swing.JPanel panCenter;
    private javax.swing.JPanel panForm;
    private javax.swing.JPanel panFormCont;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panTop;
    private javax.swing.JFormattedTextField txtArrivalDate;
    private javax.swing.JTextField txtBookAuthor;
    private javax.swing.JTextField txtBookGenre;
    private javax.swing.JTextField txtBookPublisher;
    private javax.swing.JFormattedTextField txtBookQuantity;
    private javax.swing.JTextArea txtBookSummary;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JFormattedTextField txtPublishDate;
    // End of variables declaration//GEN-END:variables
}