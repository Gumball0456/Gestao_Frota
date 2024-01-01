/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import model.Bicicleta;

/**
 *
 * @author kd
 */
public class BicicletaController {
    
    public boolean adicionarBicicleta(String codBicicleta, String cor,String marca, String modelo,String ano,String localidade,int tamanho, boolean emManutencao){
        boolean flag = false;
        
        if((codBicicleta != null && codBicicleta.length() > 0) && (marca != null && marca.length() > 0) && (tamanho > 0)){
            Bicicleta bicicleta = new Bicicleta();
            bicicleta.adicionarBicicleta(bicicleta);
            flag = true;
            
        }
        
        
        return flag;
    }
}
