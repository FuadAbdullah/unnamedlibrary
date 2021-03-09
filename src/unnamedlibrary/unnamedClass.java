/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unnamedlibrary;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author fab07
 */

// This document listener is made concrete due to limitation
// with JFrame form
class unnamedClass implements DocumentListener {
    
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

abstract class unnamedException extends Exception {
    public unnamedException(String exc){
        super(exc);
    }
    
}

class unnamedBookMenuException extends unnamedException {
    private Color fgtxt = new Color(187,187,187); // Default foreground color for text
    
    public unnamedBookMenuException(String exc) {
        super(exc);
    }
    
    public void highlightBookMenu(JLabel lbl){
        lbl.setForeground(Color.yellow);
    }
    
    public void dehighlightBookMenu(JLabel lbl){
        lbl.setForeground(fgtxt);
    }
    
}
