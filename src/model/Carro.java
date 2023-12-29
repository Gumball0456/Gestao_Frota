/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class Carro extends Veiculo{
    
    private short numPortas;
    private Motor motor;
    private Pneu pneu;
    
    
    public Carro(String codVeiculo, String cor, String marca, String modelo, String ano, String localidade,boolean emManutenca){
        
        super(codVeiculo, cor,marca,modelo,ano,localidade,emManutenca);
    }

    public short getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(short numPortas) {
        this.numPortas = numPortas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }
    
    @Override
    public void ligarMotor(){
        
    }
    
    @Override
    public void desligarMotor(){
        
    }
    
    
}
