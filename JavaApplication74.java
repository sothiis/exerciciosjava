/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

import javax.swing.JOptionPane;

/**
 *
 * @author jamille
 */
public class JavaApplication74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //        janela de dialogo
       JOptionPane.showMessageDialog(null, "olá");
       String numero = JOptionPane.showInputDialog("digite um numero");
       double n = Double.parseDouble(numero);
    }
    
}
