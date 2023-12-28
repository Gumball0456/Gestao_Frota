/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import apresentacao.LoginView;
import dataManagement.DataBase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gumball
 */
public class LoginController {
    private LoginView loginView;
    
    public LoginController(LoginView loginview){
        this.loginView = loginview;
        
        loginView.addLoginButtonEventListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String enteredUsername = loginview.getUserName();
                String enteredPassword = loginview.getUserPassword();
                
                System.out.println("Hello, you clicked on me!");
                if(autenthicateUser(enteredUsername, enteredPassword))
                    System.out.println("Login Valido!");
                else
                    System.out.println("Login invalido!");
                }
        });
    }
    
    private boolean autenthicateUser(String enteredUsername, String Enteredpassword){
        boolean validLogin = DataBase.credentialsExist(enteredUsername, Enteredpassword);
        return validLogin;
    }
}
