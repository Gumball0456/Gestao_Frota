/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import entidade.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author _Yuye_
 */
public class FrotaVeicular {
    
    ArrayList <Veiculo> listaDeVeiculos = new ArrayList ();
    
    public void adicionarVeiculo(Veiculo e){
        
        listaDeVeiculos.add(e);
        
    }
    
    public void removerVeiculo(Carro i){
        
        listaDeVeiculos.remove(i);
        
    }
    
    public void imprimir(){
        for (Veiculo i: listaDeVeiculos){
            System.out.println(i);
        }
            
    }
    
}
