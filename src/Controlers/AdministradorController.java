/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import model.Administrador;

/**
 *
 * @author kd
 */
public class AdministradorController {
    
    
    
    public boolean editarAdmin(String nome, String username, String password){
        
        boolean flag = false;
        if((nome.length() > 0) && (username.length() > 0) && (password.length() > 0)){
            Administrador admin = new Administrador();
            admin.editarAdmin(admin);            
            flag = true;
        }
            
            
        return flag;
    }
    
}
