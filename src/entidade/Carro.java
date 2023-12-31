/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author _Yuye_
 */
public class Carro extends Veiculo {
    
   private int numPortas;
   private Motor motor;
   private Pneu pneu;

    public Carro(int numPortas, Motor motor, Pneu pneu, String codVeiuclo, String cor, String marca, String modelo, String ano, String localidade, boolean emManutencao) {
        super(codVeiuclo, cor, marca, modelo, ano, localidade, emManutencao);
        this.numPortas = numPortas;
        this.motor = motor;
        this.pneu = pneu;
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

    @Override
    public String toString() {
        return "Carro{" + "numPortas=" + numPortas + ", motor=" + motor + ", pneu=" + pneu + '}';
    }
    
    
}
