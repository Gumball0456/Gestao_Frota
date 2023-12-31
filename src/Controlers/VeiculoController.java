/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import model.Carro;

/**
 *
 * @author kd
 */
public class VeiculoController {
    
    public boolean adicionarVeiculo(String codVeiculo,String cor,String marca,String modelo,String ano, String localidade, boolean emManutencao){
        
        boolean flag = false;
        if((codVeiculo.length()>0) &&( cor.length() > 0) && (marca.length() > 0) && (modelo.length() > 0) && (ano.length() > 0) && (localidade.length() > 0) )
            flag = true;
        Carro veiculo = new Carro(codVeiculo, cor, marca, modelo, ano, localidade, emManutencao);
        
        veiculo.adicionarCarro(veiculo);
        
        return flag;
    }
    
}
