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
                
                if(enteredUsername.isEmpty() && enteredPassword.isEmpty())
                    loginView.showLoginError("Nome de usuario vazio e palavra-passe vazios\nPor favor, especifique o nome de usuario");
                else if(enteredUsername.isEmpty())
                    loginView.showLoginError("Nome de usuario vazio\nPor favor, especifique o nome de usuario");
                else if(enteredPassword.isEmpty())
                    loginView.showLoginError("Palavra-passe vazia\nPor favor, especifique o nome de usuario");
                else{
                    if(autenthicateUser(enteredUsername, enteredPassword)){
                        InicioController.removePanel(0);
                        InicioController.showPanel(1);
                    }else
                        loginView.showLoginError("Login invalido!Nao existe este usuario\nPor favor, verifique as suas credenciais e tente de novo.");
                    }
            }
        });
    }
    
    private boolean autenthicateUser(String enteredUsername, String Enteredpassword){
        boolean validLogin = DataBase.credentialsExist(enteredUsername, Enteredpassword);
        return validLogin;
    }
}
