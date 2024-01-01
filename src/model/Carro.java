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
    
    private int numPortas;
    private Motor motor;
    private Pneu pneu;
    private boolean motorLigado;
    
    public Carro(){
        super();
    }
    public Carro(int numPortas,String codVeiculo, String cor, String marca, String modelo, String ano, String localidade,boolean emManutenca){
        
        super(codVeiculo, cor,marca,modelo,ano,localidade,emManutenca);
        setNumPortas(numPortas);
        
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
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
    
    public void setMotorLigado(boolean valor){
        
        motorLigado = valor;
        
    }
    
    @Override
    public void ligarMotor(){
        
        setMotorLigado(true);
        
    }
    
    @Override
    public void desligarMotor(){
        
        setMotorLigado(false);
        
    }
    
    public void adicionarCarro(Carro carro){
        
    }
    
    
}
