/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import model.Condutor;



/**
 *
 * @author kd
 */
public class CondutorController {
    
    
    public boolean adicionarCondutor(String codigo, String nome ,String dataNascimento, String sexo){
        boolean flag = false;
        if((codigo != null && codigo.length() > 0) && (nome != null && nome.length() > 0) && (dataNascimento != null && dataNascimento.length() > 0) && (sexo != null && sexo.length() > 0) ){
        Condutor condutor = new Condutor(codigo,nome,dataNascimento,sexo);
        condutor.adicionarCondutor(condutor);
        flag = true;
        
        }
            
          return flag;
    }
}
