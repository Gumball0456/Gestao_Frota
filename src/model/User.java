/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class User {
    
    private String nome;
    private String username;
    private String password;
    
    public User(String nome, String username, String passowrd){
        
       this.nome = nome;
       this.username = username;
       this.password = password;
       
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    
    public String getNome(){
        
        return nome;
        
    }
    
    public void setUsername(String username){
        
        this.username = username;
        
    }
    
    public String getUsername(){
        
        return username;
        
    }
    
    public void setPassword(String password){
        
        this.password = password;
        
    }
    
    public String getPassword(){
        
        return password;
        
    }
}
