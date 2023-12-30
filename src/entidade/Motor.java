    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author _Yuye_
 */
public class Motor {
    
    private int codMotor;
    private int numCliente;
    private boolean estaLigado;
    private boolean emManutencao;

    public Motor(int codMotor, int numCliente, boolean estaLigado, boolean emManutencao) {
        this.codMotor = codMotor;
        this.numCliente = numCliente;
        this.estaLigado = estaLigado;
        this.emManutencao = emManutencao;
    }

    public int getCodMotor() {
        return codMotor;
    }

    public void setCodMotor(int codMotor) {
        this.codMotor = codMotor;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estarLigado) {
        this.estaLigado = estarLigado;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }
    
    public void ligar(){
        
    }
    
    public void desligar(){
        
    }
    
    public void realizarManutencao(){
        
    }

    @Override
    public String toString() {
        return "Motor{" + "codMotor=" + codMotor + ", numCliente=" + numCliente + ", estarLigado=" + estaLigado + ", emManutencao=" + emManutencao + '}';
    }
}
