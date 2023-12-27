/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
    
    //constraints to set position
    GridBagConstraints c = new GridBagConstraints();
    
    private void addComponent(Component component, int row, int column, int width, int height){
        c.gridx = column;
        c.gridy = row;
        c.gridheight = height;
        c.gridwidth = width;
        add(component,c);
    }
    
    public LoginView(){
        super();
        setLayout(new GridBagLayout());
        username.setBorder(null);
        password.setBorder(null);
        
        //define maring for elements
        c.insets =  new Insets(10, 5, 10, 5);
        
        //add Label for username and its unput area
        addComponent(usernameL, 0, 0, 1, 1);
        addComponent(username, 0, 1, 1, 1);
        
        //add Label for password and its unput area
        addComponent(passwordL, 1, 0, 1, 1);
        addComponent(password, 1, 1, 1, 1);
        
        //add button
        addComponent(loginButton, 2, 1, 1, 1);
    }   
}
