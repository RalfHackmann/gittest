/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.esw.mavenproject3;

/**
 *
 * @author U14
 */
public class NewClass  extends javax.swing.JFrame {
    
    
    /*
    public static void main(String[] args) {
        // Ihr Code zum Ausführen
        System.out.println("Hallo Java!");
        
        new NewJPanel().setVisible(true);
    }
    */
    
    
    
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJPanel().setVisible(true);
            System.out.println("Hallo Java!");
            new NewJFrame().setVisible(true);
        });
    }
    
    
    
}


