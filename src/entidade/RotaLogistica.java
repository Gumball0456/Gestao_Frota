/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.ArrayList;

/**
 *
 * @author _Yuye_
 */
public class RotaLogistica {
    
    private String origem;
    private String destino;
    
    ArrayList <Veiculo> VeiculosAssociados = new ArrayList ();

    public RotaLogistica(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Veiculo> getVeiculosAssociados() {
        return VeiculosAssociados;
    }

    public void setVeiculosAssociados(ArrayList<Veiculo> VeiculosAssociados) {
        this.VeiculosAssociados = VeiculosAssociados;
    }
    
    public void associarVeiculo (Veiculo veiculo){
        
    }
    
    public void desassociarVeiculo (Veiculo veiculo){
        
    }
    
    public void calcularRotaOptimizada (String localidades){
        
    }
}
