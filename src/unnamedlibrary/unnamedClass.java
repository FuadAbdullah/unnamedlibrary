/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unnamedlibrary;

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

class unnamedException extends Exception {
    
}

class unnamedBookMenuException extends unnamedException {
    
}
