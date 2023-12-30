/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.ArrayList;
import model.User;

/**
 *
 * @author kd
 */
public class Login {
    
    //private User logged;
    private User user;
    private ArrayList<User> lista = new ArrayList<>();
    
    public Login(){
        
    }
    public boolean validarConta(String username, String password){
        boolean flag = false;
        
        for(User element : lista){
            
            if( element.getUsername().equalsIgnoreCase(username) && element.getPassword().equalsIgnoreCase(password))
                flag = true;
        }
        
        return flag;
        
    }
    
    public void addUser(){
        user = new User("darilton", "admin","admin");
        lista.add(user);
    }
}
