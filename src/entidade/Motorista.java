/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author _Yuye_
 */
public class Motorista extends Condutor{
    
    private Veiculo veiculoAssociado;
    private int numViagens;

    public Motorista(Veiculo veiculoAssociado, int numViagens, String nome, String dataDeNascimento, String codCondutor, char sexo) {
        super(nome, dataDeNascimento, codCondutor, sexo);
        this.veiculoAssociado = veiculoAssociado;
        this.numViagens = numViagens;
    }

    public Veiculo getVeiculoAssociado() {
        return veiculoAssociado;
    }

    public void setVeiculoAssociado(Veiculo veiculoAssociado) {
        this.veiculoAssociado = veiculoAssociado;
    }

    public int getNumViagens() {
        return numViagens;
    }

    public void setNumViagens(int numViagens) {
        this.numViagens = numViagens;
    }
    
    public void associarVeiculo(Veiculo veiculo){
           
    }
    
}
