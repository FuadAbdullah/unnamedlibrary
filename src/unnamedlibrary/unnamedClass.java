/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unnamedlibrary;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author FuadAbdullah
 */

// <editor-fold defaultstate="collapsed" desc="Document Listener Class"> 
// This document listener is made concrete due to limitation
// with JFrame form
class unnamedDocumentListener implements DocumentListener {
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        // TO BE OVERRIDDEN
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        // TO BE OVERRIDDEN
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // TO BE OVERRIDDEN
       
    }
}
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Validation Class"> 
// This abstract class contains the fundamental methods required of a validation
abstract class unnamedStringValidation {
    
    private String title, msg, regex, nregex;
    
    public unnamedStringValidation() {
        title = "Invalid input type!";
        msg = "Field can only consist of letters, numbers and spacing.";
        regex = "^[a-zA-Z0-9 ]+";
        nregex = "[^a-zA-Z0-9 ]";
    }
    
    public unnamedStringValidation(String title, String msg, String regex, String nregex) {
        this.title = title;
        this.msg = msg;
        this.regex = regex;
        this.nregex = nregex;
    }
    
    public unnamedStringValidation(String msg, String regex, String nregex) {
        title = "Invalid input type!";
        this.msg = msg;
        this.regex = regex;
        this.nregex = nregex;
    }
    
    public void setRegex(String regex){
        this.regex = regex;
    }
    
    public void setNegateRegex(String nregex){
        this.nregex = nregex;
    }
    
    public void setPopup(String title, String msg){
        this.title = title;
        this.msg = msg;
    }
    
    public String getRegex(){
        return regex;
    }
    
    public String getNegateRegex(){
        return nregex;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getMessage(){
        return msg;
    }
    
    public void runPopup(){
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.WARNING_MESSAGE);
    }
    
    public void runValidate(JTextField txt){
        Runnable doDelete = new Runnable(){
            public void set(){
                String input = txt.getText();
                boolean matching = input.matches(getRegex());
                if (!matching && !"".equals(input)) {
                    runPopup();
                    // String output = input.substring(0, input.length() - 1);
                    // String illegalSymbols = input.replaceAll(getRegex(), "");
                    // String output = input.replaceAll(illegalSymbols, "");
                    String output = input.replaceAll(getNegateRegex(), "");
                    txt.setText(output);
                }
            }
            @Override
            public void run(){
                set();
            }
        };
        SwingUtilities.invokeLater(doDelete);
    }
    
}

// This subclass handles username validation
class unnamedUsernameValidation extends unnamedStringValidation {
    
    public unnamedUsernameValidation() {
        super();
        setPopup("Invalid username!", "Username can only consist of letters, numbers and escaped symbols.");
        setRegex("^[-a-zA-Z0-9!@#$%^&*()\\{\\}\\[\\]\"\';\\\\/?|.,><~`_+=]+");
        setNegateRegex("[^-a-zA-Z0-9!@#$%^&*()\\{\\}\\[\\]\"\';\\\\/?|.,><~`_+=]");
    }
}

// This subclass handles password validation
class unnamedPasswordValidation extends unnamedStringValidation {
    
    public unnamedPasswordValidation() {
        super();
        setPopup("Invalid password!", "Password can only consist of letters, numbers and escaped symbols.");
        setRegex("^[-a-zA-Z0-9!@#$%^&*()\\{\\}\\[\\]\"\';\\\\/?|.,><~`_+=]+");
        setNegateRegex("[^-a-zA-Z0-9!@#$%^&*()\\{\\}\\[\\]\"\';\\\\/?|.,><~`_+=]");
    }
    
    public void runValidate(JPasswordField txt){
        Runnable doDelete = new Runnable(){
            public void set(){
                String input = String.valueOf(txt.getPassword());
                boolean matching = input.matches(getRegex());
                if (!matching && !"".equals(input)) {
                    runPopup();
                    // String output = input.substring(0, input.length() - 1);
                    // String illegalSymbols = input.replaceAll(getRegex(), "");
                    // String output = input.replaceAll(illegalSymbols, "");
                    String output = input.replaceAll(getNegateRegex(), "");
                    txt.setText(output);
                }
            }
            @Override
            public void run(){
                set();
            }
        };
        SwingUtilities.invokeLater(doDelete);
    }
}

// This subclass handles email validation
class unnamedEmailValidation extends unnamedStringValidation {
    
    public unnamedEmailValidation() {
        super();
        setPopup("Invalid email address!", "Email must follow the format 'abc123@mail.com'.");
        setRegex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }
    
    public boolean runValidate(JTextField txt, boolean dispenseMessage){
        boolean invalidEmail = false;
        String input = txt.getText();
        boolean matching = input.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        if (matching == false && !"".equals(input)) {
            if (dispenseMessage) {
                runPopup();
            }
            String output = "";
            txt.setText(output);
            invalidEmail = true;
        };
        return invalidEmail;
    }
    
}

// This subclass handles name validation
class unnamedNameValidation extends unnamedStringValidation {
    
    public unnamedNameValidation() {
        super();
        setPopup("Invalid name!", "Name can only consist of letters and spacing.");
        setRegex("^[a-zA-Z ]+");
        setNegateRegex("[^a-zA-Z ]");
    }
}

// This is a subclass of name validation but focuses on first name validation
class unnamedFirstNameValidation extends unnamedNameValidation {
    public unnamedFirstNameValidation(){
        super();
        setPopup("Invalid first name!", "First name can only consist of letters and spacing.");
    }
}

// This is a subclass of name validation but focuses on last name validation
class unnamedLastNameValidation extends unnamedNameValidation {
     public unnamedLastNameValidation(){
        super();
        setPopup("Invalid last name!", "Last name can only consist of letters and spacing.");
    }
}

// This subclass handles home address validation
class unnamedAddressValidation extends unnamedStringValidation {
    public unnamedAddressValidation() {
        super();
        setPopup("Invalid home address!", "Home address can only consist of letters, numbers, spacing and acceptable symbols.");
        setRegex("^[-a-zA-Z0-9()&., ]+");
        setNegateRegex("[^-a-zA-Z0-9()&., ]");
    }
    
    public void runValidate(JTextArea txt){
        Runnable doDelete = new Runnable(){
            public void set(){
                String input = txt.getText();
                boolean matching = input.matches(getRegex());
                if (!matching && !"".equals(input)) {
                    runPopup();
                    // String output = input.substring(0, input.length() - 1);
                    // String illegalSymbols = input.replaceAll(getRegex(), "");
                    // String output = input.replaceAll(illegalSymbols, "");
                    String output = input.replaceAll(getNegateRegex(), "");
                    txt.setText(output);
                }
            }
            @Override
            public void run(){
                set();
            }
        };
        SwingUtilities.invokeLater(doDelete);
    }
    
}

// This subclass handles book title naming validation
class unnamedTitleValidation extends unnamedStringValidation {
    unnamedTitleValidation(){
        super();
        setPopup("Invalid book title!", "Book title can only consist of letters, numbers, spacing and escaped symbols.");
        setRegex("^[-a-zA-Z0-9!@#$%^&*()\\{\\}\\[\\]\"\';\\\\/?|.,><~`_+= ]+");
        setNegateRegex("[^-a-zA-Z0-9!@#$%^&*()\\{\\}\\[\\]\"\';\\\\/?|.,><~`_+= ]");
    }
}

// This subclass handles book genre validation
class unnamedGenreValidation extends unnamedStringValidation {
    unnamedGenreValidation(){
        super();
        setPopup("Invalid book genre!", "Book genre can only consist of letters, numbers, spacing and acceptable symbols.");
        setRegex("^[-a-zA-Z0-9()&., ]+");
        setNegateRegex("[^-a-zA-Z0-9()&., ]");
    }
}

// This subclass handles book summary validation
class unnamedSummaryValidation extends unnamedStringValidation {
    unnamedSummaryValidation(){
        super();
        setPopup("Invalid book summary!", "Book summary can only consist of letters, numbers, spacing and acceptable symbols.");
        setRegex("^[-a-zA-Z0-9()&., ]+");
        setNegateRegex("[^-a-zA-Z0-9()&., ]");
    }
    
    public void runValidate(JTextArea txt){
        Runnable doDelete = new Runnable(){
            public void set(){
                String input = txt.getText();
                boolean matching = input.matches(getRegex());
                if (!matching && !"".equals(input)) {
                    runPopup();
                    // String output = input.substring(0, input.length() - 1);
                    // String illegalSymbols = input.replaceAll(getRegex(), "");
                    // String output = input.replaceAll(getRegex(), "");
                    String output = input.replaceAll(getNegateRegex(), "");
                    txt.setText(output);
                }
            }
            @Override
            public void run(){
                set();
            }
        };
        SwingUtilities.invokeLater(doDelete);
    }
}

// This subclass handles book publisher validation
class unnamedPublisherValidation extends unnamedStringValidation {
    unnamedPublisherValidation(){
        super();
        setPopup("Invalid book publisher!", "Book publisher can only consist of letters, numbers, spacing and acceptable symbols.");
        setRegex("^[-a-zA-Z0-9()&., ]+");
        setNegateRegex("[^-a-zA-Z0-9()&., ]");
    }
}

// This subclass handles book author validation
class unnamedAuthorValidation extends unnamedStringValidation {
    unnamedAuthorValidation(){
        super();
        setPopup("Invalid book author!", "Book author can only consist of letters, numbers, spacing and acceptable symbols.");
        setRegex("^[-a-zA-Z0-9()&., ]+");
        setNegateRegex("[^-a-zA-Z0-9()&., ]");
    }
}
// </editor-fold>

