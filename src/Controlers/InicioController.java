/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import apresentacao.AdminView;
import apresentacao.LoginView;
import javax.swing.JPanel;
import main.Inicio;

/**
 *
 * @author gumball
 */
public class InicioController {
    private static Inicio frame;
    public final int LOGIN_VIEW = 0;
    public final int ADMIN_VIEW  = 1;
    public final int GESTOR_DE_FROTA_VIEW = 2;
    
    static LoginView loginView = new LoginView();
    LoginController loginController = new LoginController(loginView);
    
    static AdminView adminView = new AdminView();
    AdminController adminController = new AdminController(adminView);
    
    static JPanel panels[] = {loginView, adminView};
    
    
    
    public InicioController(Inicio frame){
        this.frame = frame;
    }
    
    public static void removePanel(int panelNumber) {
        frame.removePanel(panels[panelNumber]);
    }
    public static void showPanel(int panelNumber){
        frame.showPanel(panels[panelNumber]);
        frame.setVisible(true);
    }
}
