/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Controlers.AdminController;
import Controlers.LoginController;
import apresentacao.AdminView;
import apresentacao.LoginView;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gumball
 */
public class Inicio extends JFrame{
    LoginView loginView = new LoginView();
    LoginController loginController = new LoginController(loginView);
    
    AdminView adminView = new AdminView();
    AdminController adminController = new AdminController(adminView);
    
    JPanel panels[] = {loginView, adminView};
    
    public Inicio(){
       super("Gestor de Frotas LDA");
    }
    
    public void showPanel(int panelNumber){
        add(panels[panelNumber]);
    }

    public void removePanel(int i) {
        remove(panels[i]);
    }
}
