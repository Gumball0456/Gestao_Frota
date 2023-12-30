/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import login.Login;

/**
 *
 * @author gumball
 */
public class LoginView extends View{
    
   // private User userData;
    private Login login = new Login();
    
    //label and input for username
    JLabel loginError = new JLabel("Hello");
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
        
        //add Label for username and its unput area
        addComponent(usernameL, 1 ,0, 1,1, 0,0, GridBagConstraints.NORTH,GridBagConstraints.NONE,0,0,0,0,5,5);
        addComponent(username, 1 ,1, 1,1, 0,0, GridBagConstraints.CENTER,GridBagConstraints.NONE,0,0,0,10,5,5);
        addComponent(passwordL, 2 ,0, 1,1, 0,0, GridBagConstraints.CENTER,GridBagConstraints.NONE,0,5,0,0,5,5);
        addComponent(password, 2 ,1, 1,1, 0,0, GridBagConstraints.CENTER,GridBagConstraints.NONE,0,0,0,0,5,5);
        addComponent(loginButton, 3 ,1, 1,1, 0,0, GridBagConstraints.CENTER,GridBagConstraints.NONE,0,0,50,0,0,0);
    }   

    public void addLoginButtonEventListener(ActionListener actionListener) {
        loginButton.addActionListener(actionListener);
     
        String username = this.username.getText();
        String password = getUserPassword();
        
        if(login.validarConta(username,password)){
            AdminView adminView = new AdminView();
            adminView.setVisible(true);
        }
    }

    public String getUserName() {
        return username.getText();
    }
    public void showLoginError(String msg){
        JOptionPane.showMessageDialog(this, msg, "Erro de login", JOptionPane.ERROR_MESSAGE);
    }

    public String getUserPassword() {
        char passwordArray[] = password.getPassword();
        
        //JPasswordFied returns an array containing the chars in the password
        String password = new String(passwordArray);
        
        return password;
    }
}
