/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class Moto extends Veiculo{
    
    private Motor motor;
    private Pneu pneu;
    private short capacetes;
    
    
    public Moto(Motor motor,Pneu pneu,short capacetes,String cod,String cor,String marca, String modelo, String ano, String localidade,boolean emManutencao){
        
        super(cod,cor,marca,modelo,ano,localidade,emManutencao);
        
    }
    
    public void setCapacetes(short capacetes){
        
        this.capacetes = (capacetes < 0) ? 0 : capacetes ;
        
    }
    
    public short getCapacetes(){
        
        return capacetes;
        
    }
    
    public void setPneu(Pneu pneu){
        
        this.pneu = pneu ;
        
    }
    
    public Pneu getPneu(){
        
        return pneu;
        
    }
    
    public void setMotor(Motor motor){
        
        this.motor = motor;
        
    }
    
    public Motor getMotor(){
        
        return motor;
        
    }
    @Override
    public void ligarMotor(){
        
    }
    
    @Override
    public void desligarMotor(){
        motor = new Motor();
        motor.setLigado(true);
    }

   
}
