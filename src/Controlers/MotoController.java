/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import model.Moto;

/**
 *
 * @author kd
 */
public class MotoController {
    
    public boolean adicionarMoto(String codMoto,String cor, String marca, String modelo,String ano, String localidade, int capacetes, boolean emManutencao){
        
        boolean flag = false;
        
        if((codMoto != null && codMoto.length() > 0) && (cor != null && cor.length() > 0) && (capacetes != 0)){
            
            Moto moto = new Moto();
            moto.adicionarMoto(moto);
            
            flag = true;
        }
        
        return flag;
    }
    
}
