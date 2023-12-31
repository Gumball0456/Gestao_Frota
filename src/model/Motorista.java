/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class Motorista extends Condutor{
    
    private Veiculo veiculoAssociado;
    private short viagens;
    
    public Motorista( short viagens){
        
        setViagens(viagens);
        
    }
    
    public void setViagens(short viagens){
        
        this.viagens = (viagens < 0) ? 0 : viagens;
        
    }
    
    public short getViagens(){
        
        return viagens;
        
    }
    
    public void setVeiculoAssociado(Veiculo veiculo){
        
        veiculoAssociado = veiculo;
        
    }
    
    public Veiculo getVeiculoAssociado(){
        
        return veiculoAssociado;
        
    }
}
