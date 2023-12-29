/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class Bicicleta extends Veiculo{
    
    private short tamanho;
    private Pneu pneu;
    
    public Bicicleta(short tamanho, Pneu pneu){
        
        this.tamanho = tamanho;
        this.pneu = pneu;
        
    }
    public Bicicleta(){
        
        super();
    }
    
    public void setTamanho(short tamanho){
        
        this.tamanho = (tamanho < 0) ? 0 : tamanho;
        
    }
    
    public short getTamanho(){
        
        return tamanho;
        
    }
    
    public void setPneu(Pneu pneu){
        
        this.pneu = pneu;
        
    }
    
    public Pneu getPneu(){
        
        return pneu;
        
    }
    @Override
    public void ligarMotor(){
        
    }
    
    @Override
    public void desligarMotor(){
        
    }
}
