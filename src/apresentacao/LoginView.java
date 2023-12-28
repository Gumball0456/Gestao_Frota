/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author gumball
 */
public class LoginView extends View{
    //label and input for username
    JLabel usernameL = new JLabel("Usuario");
    JTextField username = new JTextField("", 20);
    
    
    //laber and input for password
    JLabel passwordL = new JLabel("Palavra-Passe");
    JPasswordField password = new JPasswordField("", 20);
    
    //login button
    JButton loginButton = new JButton("Login");
    
    public LoginView(){
        super();
        username.setBorder(null);
        password.setBorder(null);
        
        //define maring for elements
        Insets insets = new Insets(10, 5, 10, 5);
        
        //add Label for username and its unput area
        addComponent(usernameL, 0, 0, 1, 1, insets);
        addComponent(username, 0, 1, 1, 1, insets);
        
        //add Label for password and its unput area
        addComponent(passwordL, 1, 0, 1, 1, insets);
        addComponent(password, 1, 1, 1, 1, insets);
        
        //add button
        addComponent(loginButton, 2, 1, 1, 1, insets);
    }   

    public void addLoginButtonEventListener(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
    }

    public String getUserName() {
        return username.getText();
    }

    public String getUserPassword() {
        char passwordArray[] = password.getPassword();
        
        //JPasswordFied returns an array containing the chars in the password
        String password = new String(passwordArray);
        
        return password;
    }
}
