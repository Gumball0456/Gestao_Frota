/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author _Yuye_
 */
public class Pneu {
    
    private float tamanho;
    private int cod;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Pneu(float tamanho, int cod) {
        this.tamanho = tamanho;
        this.cod = cod;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }   

    @Override
    public String toString() {
        return "Pneu{" + "tamanho=" + tamanho + '}';
    }
    
    
}
