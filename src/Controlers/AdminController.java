/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import apresentacao.AdminView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author gumball
 */
public class AdminController {
    AdminView adminView;
    
    public AdminController(AdminView adminView){
        this.adminView = adminView;
    
    //Add event listeners
        adminView.AddEventListenerShowVehicles(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                adminView.showVehiclesSelected();
            }
        });
        
        adminView.AddEventListenerShowDrivers(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                adminView.showDriversSelected();
            }
        });
    }
    
}
