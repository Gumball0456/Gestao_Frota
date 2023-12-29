/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;

/**
 *
 * @author kd
 */
public class RotaLogistica {
    
    private String origem;
    private String destino;
    private ArrayList<Veiculo> veiculosAssociados = new ArrayList<>();
    
    public RotaLogistica(String origem, String destino){
        
        this.origem = origem;
        this.destino = destino;
        
    }
    
    public void setOrigem(String origem){
        
        this.origem = origem;
        
    }
    
    public String getOrigem(){
        
        return origem;
        
    }
    
    public void setDestino( String destino ){
        
        this.destino = destino;
        
    }
    
    public String getDestino(){
        
        return destino;
        
    }
}
