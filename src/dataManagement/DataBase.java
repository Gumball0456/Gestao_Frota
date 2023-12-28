/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataManagement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gumball
 */
public class DataBase {
    public static Path pathToFile;
    
    public static List<String> readFile(Path pathToFile){
        List<String> lines = null;
        
        if(Files.exists(pathToFile)){
            try{
                lines = Files.readAllLines(pathToFile,Charset.defaultCharset());
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "There was an internal error! Please, contact your System Administrator", "Login Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return lines;
    }
    
    public static boolean credentialsExist(String username, String password){
        pathToFile = Paths.get("Dados", "passwords");
        List<String> credentialsList = readFile(pathToFile);
        
        String credentials[];
        
        for (String string : credentialsList) {
            credentials = string.split(";");
            
            //In case there is a blank line
            if(credentials.length > 0){
                if(credentials[0].compareTo(username) == 0 && credentials[1].compareTo(password) == 0)
                    return true;
            }
        }
        return false;
    }
}
