/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import main.Inicio;

/**
 *
 * @author gumball
 */
public class InicioController {
    private static Inicio frame;
    
    public InicioController(Inicio frame){
        this.frame = frame;
    }
    
    public static void removePanel(int i) {
        frame.removePanel(i);
    }
    public static void showPanel(int panelNumber){
        frame.showPanel(panelNumber);
        frame.setVisible(true);
    }
}
