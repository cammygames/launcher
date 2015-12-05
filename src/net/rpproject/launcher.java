/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rpproject;

import java.awt.EventQueue;
import net.rpproject.gui.window;

/**
 *
 * @author Michael Rosen
 */
public class launcher {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        * Display The Launcher Window
        */
        EventQueue.invokeLater(() -> {
            new window().setVisible(true);
        });
    }    
}
