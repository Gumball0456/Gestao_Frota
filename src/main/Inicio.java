/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Controlers.LoginController;
import apresentacao.LoginView;
import javax.swing.JFrame;

/**
 *
 * @author gumball
 */
public class Inicio {
    public static void main(String args[]){
       JFrame frame = new JFrame("Gestor de Frotas LDA");
       LoginView loginView = new LoginView();
       
       LoginController loginController = new LoginController(loginView);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000,800);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      
       
       frame.add(loginView);
       frame.setVisible(true);
    }
}
