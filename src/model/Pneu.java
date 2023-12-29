/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class Pneu {
    
    private short tamanho;
    
    public Pneu( short tamanho ){
        
        setTamanho(tamanho);
        
    }
    
    public void setTamanho(short tamanho){
        
        this.tamanho = (tamanho < 0)? 0: tamanho;
        
    }
    
    public short getTamanho(){
        
        return tamanho;
        
    }
}
