/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author _Yuye_
 */
public class Moto extends Veiculo{
    
    private int numCapacetes;
    private Motor motor;
    private Pneu pneu;

    public Moto(int numCapacetes, Motor motor, Pneu pneu, String codVeiuclo, String cor, String marca, String modelo, String ano, String localidade, boolean emManutencao) {
        super(codVeiuclo, cor, marca, modelo, ano, localidade, emManutencao);
        this.numCapacetes = numCapacetes;
        this.motor = motor;
        this.pneu = pneu;
    }

    public int getNumCapacetes() {
        return numCapacetes;
    }

    public void setNumCapacetes(int numCapacetes) {
        this.numCapacetes = numCapacetes;
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
}
