/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import apresentacao.LoginView;
import javax.swing.JFrame;

/**
 *
 * @author gumball
 */
public class Inicio {
    public static void main(String args[]){
       JFrame frame = new JFrame("Gestor de Frotas LDA");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000,800);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      
       LoginView login = new LoginView();
       frame.add(login);
       frame.setVisible(true);
    }
}
