/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gumball
 */
public class Inicio extends JFrame{
    public Inicio(){
       super("Gestor de Frotas LDA");
    }
    
    public void showPanel(JPanel panel){
        add(panel);
    }

    public void removePanel(JPanel panel) {
        remove(panel);
    }
}
