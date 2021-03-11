/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unnamedlibrary;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author FuadAbdullah
 */
public class unnamedLoginMenu extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="Login Menu Private Variables"> 
    // Description for private variables
    // -------------------------------------
    // lID stores librarian ID
    // saveDir stores working directory
    // username stores librarian username
    // filledUsername flag to check if username field is filled in
    // filledPassword flag to check if password field is filled in
    // -------------------------------------
    private String lID, saveDir, username;
    private boolean filledUsername = false, filledPassword = false;
    // </editor-fold>
    
    // Login menu constructor
    public unnamedLoginMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        panMain = new javax.swing.JPanel();
        panTop = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        spTitle = new javax.swing.JSeparator();
        panCenter = new javax.swing.JPanel();
        panCredentials = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        spCredentials = new javax.swing.JSeparator();
        lblDesigner = new javax.swing.JLabel();
        lblGitHub = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login to unnamed Library Management System");
        setBackground(new java.awt.Color(0, 0, 0));
        setName("loginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        panMain.setBackground(new java.awt.Color(51, 51, 51));
        panMain.setMaximumSize(new java.awt.Dimension(800, 600));
        panMain.setMinimumSize(new java.awt.Dimension(800, 600));
        panMain.setPreferredSize(new java.awt.Dimension(800, 600));
        panMain.setLayout(new java.awt.BorderLayout());

        panTop.setBackground(new java.awt.Color(43, 44, 45));

        lblTitle.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("unnamed Library Management System");

        lblSubtitle.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        lblSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitle.setText("Logging in as Librarian");

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblTitle))
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lblSubtitle)))
                .addContainerGap(206, Short.MAX_VALUE))
            .addComponent(spTitle, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(7, 7, 7)
                .addComponent(spTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblSubtitle)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panMain.add(panTop, java.awt.BorderLayout.PAGE_START);

        panCenter.setBackground(new java.awt.Color(34, 34, 34));

        panCredentials.setBackground(new java.awt.Color(48, 48, 48));
        panCredentials.setMaximumSize(new java.awt.Dimension(800, 426));
        panCredentials.setMinimumSize(new java.awt.Dimension(800, 426));

        lblUsername.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblPassword.setText("Password:");

        btnLogin.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setToolTipText("Login to your Librarian account");
        btnLogin.setActionCommand("");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setToolTipText("Opens registration form");
        btnRegister.setActionCommand("");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtPassword.setToolTipText("Insert your password");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtUsername.setToolTipText("Insert your username");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCredentialsLayout = new javax.swing.GroupLayout(panCredentials);
        panCredentials.setLayout(panCredentialsLayout);
        panCredentialsLayout.setHorizontalGroup(
            panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCredentialsLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panCredentialsLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegister))
                    .addGroup(panCredentialsLayout.createSequentialGroup()
                        .addGroup(panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panCredentialsLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(spCredentials)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        panCredentialsLayout.setVerticalGroup(
            panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCredentialsLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(spCredentials, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCredentialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnLogin))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        lblDesigner.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 8)); // NOI18N
        lblDesigner.setText("Designed by: Fuad Abdullah");

        lblGitHub.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lblGitHub.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/github1.png"))); // NOI18N
        lblGitHub.setText("GitHub");
        lblGitHub.setToolTipText("Opens GitHub page.");
        lblGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGitHubMouseClicked(evt);
            }
        });

        lblLinkedin.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lblLinkedin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/linkedin1.png"))); // NOI18N
        lblLinkedin.setText("LinkedIn");
        lblLinkedin.setToolTipText("Opens LinkedIn page");
        lblLinkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkedinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panCenterLayout = new javax.swing.GroupLayout(panCenter);
        panCenter.setLayout(panCenterLayout);
        panCenterLayout.setHorizontalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCenterLayout.createSequentialGroup()
                .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panCenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblGitHub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLinkedin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDesigner))
                    .addComponent(panCredentials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panCenterLayout.setVerticalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCenterLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(panCredentials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesigner, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCenterLayout.createSequentialGroup()
                        .addGroup(panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGitHub)
                            .addComponent(lblLinkedin))
                        .addContainerGap())))
        );

        panMain.add(panCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(panMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="Button Events">
    // This method allows password field to get focus once enter is pressed in username field
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    // This method authorize the librarian login attempt via login button
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (accountValidator()) {
            JOptionPane.showMessageDialog(null, "Login successfully! Redirecting you to the main menu.", "Account Authenticated Successfully!", JOptionPane.INFORMATION_MESSAGE);
            startSession();
            new unnamedMainMenu().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authentication failed! Your username or password may be wrong.", "Account Authentication Failed!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    // This method allows for either login or register button to get focus once enter is pressed in password field
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        if (btnLogin.isVisible()) {
            btnLogin.doClick();
        }
        else{
            btnRegister.requestFocus();
        }
    }//GEN-LAST:event_txtPasswordActionPerformed

    // This method allows for the opening of Github page via Github icon click
    private void lblGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitHubMouseClicked
        // TODO add your handling code here:
        String url = "https://github.com/FuadAbdullah/unnamedlibrary";
        
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong while trying to access the website", "Uh-oh!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblGitHubMouseClicked

    // This method allows for the opening of Linkedin profile via Linkedin icon click
    private void lblLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkedinMouseClicked
        // TODO add your handling code here:
        String url = "https://www.linkedin.com/in/muhammad-fuad-abdullah-4b4812193/";
        
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong while trying to access the website", "Uh-oh!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblLinkedinMouseClicked

    // This method opens librarian registration form via register button
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        new unnamedRegisterMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Methods"> 
    
    // This method determines if btnLogin should be displayed or not depending on boolean flag statuses
    private void showLoginButton(){
        if (filledUsername && filledPassword){
            btnLogin.setVisible(true);
        }
        else
        {
            btnLogin.setVisible(false);
        }
    }
    
    // This method authorize the librarian using inserted username and password
    private boolean accountValidator() {
        // TODO add your handling code here:
        boolean isAuthenticated = false;
        try {
            // To get directory  
            saveDir = System.getProperty("user.dir") + "\\src\\localdb\\";
            // To get the username nad password
            String tempUser = txtUsername.getText();
            String tempPass = String.valueOf(txtPassword.getPassword());
            // To rename original book.txt to book.bak
            File librariantext = new File(saveDir + "librarian.txt");
            // To check if clientBak.txt is present or not
            if (!librariantext.exists()){
                librariantext.createNewFile();
            }
            // This is to instantiate the file opened earlier
            Scanner inputFile = new Scanner(librariantext);
            // This array is to contain all lines
            String[] matchedID;
            // This is only for debugging!
            // boolean itWorked = false;
            // Read lines from the file until no more are left.
            while (inputFile.hasNext())
            {
                // This is for debugging only!
                // JOptionPane.showMessageDialog(null, "In loop");
                // Read the next line.
                String lEntry = inputFile.nextLine();
                // Split the line by using the delimiter ":" (semicolon) and store into array.
                matchedID = lEntry.split(":");
                // Check if the read line has current book ID
                if (tempUser.equals(matchedID[1]) && tempPass.equals(matchedID[2])) {
                    isAuthenticated = true;
                    lID = matchedID[0].replace("LIB", "");
                    username = matchedID[1];
                }
            }
            // Close the clientBak.txt reader
            inputFile.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return isAuthenticated;
    }
    
    // This method is to create a temporary session that stores relevant user detail
    private void startSession(){
        try {
        // To get directory  
       saveDir = System.getProperty("user.dir") + "\\src\\localdb\\";
        File cache = new File(saveDir + "cache.txt");
        if (!cache.exists()) {
            cache.createNewFile();
        }
        FileWriter ld = new FileWriter(saveDir + "cache.txt", true); 
        PrintWriter ldp = new PrintWriter(ld);
        ldp.println(lID + ":" + username);
        ldp.close();
        } catch (Exception ex) {
            
        }
    }
    
    // This method will check and create the directory if it is not available. Usually for first run
    private void createDir(){
        try {
            saveDir = System.getProperty("user.dir") + "\\src\\localdb\\";
            Path dir = Paths.get(saveDir);
            Files.createDirectories(dir);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // This method will check and create all the necessary files if it is not available. Usually for first run
    private void createDB(){
        try {
            saveDir = System.getProperty("user.dir") + "\\src\\localdb\\";
            File librariantxt = new File(saveDir + "librarian.txt");
            File booktxt = new File(saveDir + "book.txt");
            File borrowtxt = new File(saveDir + "borrowing.txt");
            File clienttxt = new File(saveDir + "client.txt");
            if (!librariantxt.exists()) {
                librariantxt.createNewFile();
            }
            if (!booktxt.exists()) {
                booktxt.createNewFile();
            }
            if (!borrowtxt.exists()) {
                borrowtxt.createNewFile();
            }
            if (!clienttxt.exists()) {
                clienttxt.createNewFile();
            }
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    // This is form load method
    private void initGUI(){
        // Create the required directory for first time boot
        createDir();
        // Create the required database textfiles for first time boot
        createDB();
        btnLogin.setVisible(false); // This will prevent the login button from being pressed right after startup
        // This anon class handles textfield changes for username entry
        txtUsername.getDocument().addDocumentListener(new unnamedDocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                if (txtUsername.getText().equals("")){
                    filledUsername = false;
                }
                else {
                    filledUsername = true;
                }
                showLoginButton();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if (txtUsername.getText().equals("")){
                    filledUsername = false;
                }
                showLoginButton();
            }
        });
        
        // This anon class handles textfield changes for password entry
        txtPassword.getDocument().addDocumentListener(new unnamedDocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                if (txtPassword.getText().equals("")){
                    filledPassword = false;
                } 
                else {
                    filledPassword = true;
                }
                showLoginButton();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if (txtPassword.getText().equals("")){
                    filledPassword = false;
                }
                showLoginButton();
            }
        });

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
    
    // </editor-fold>
    
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
                new unnamedLoginMenu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblDesigner;
    private javax.swing.JLabel lblGitHub;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panCenter;
    private javax.swing.JPanel panCredentials;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panTop;
    private javax.swing.JSeparator spCredentials;
    private javax.swing.JSeparator spTitle;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
