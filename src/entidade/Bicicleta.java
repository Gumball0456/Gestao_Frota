/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author _Yuye_
 */
public class Bicicleta extends Veiculo{
    
    private int tamanho;
    private Pneu pneu;

    public Bicicleta(int tamanho, Pneu pneu, String codVeiuclo, String cor, String marca, String modelo, String ano, String localidade, boolean emManutencao) {
        super(codVeiuclo, cor, marca, modelo, ano, localidade, emManutencao);
        this.tamanho = tamanho;
        this.pneu = pneu;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }    
}
