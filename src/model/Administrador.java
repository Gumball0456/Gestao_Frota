/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Controlers.BicicletaController;
import Controlers.CarroController;
import Controlers.MotoController;
import javax.swing.JOptionPane;

/**
 *
 * @author kd
 */
public class Administrador extends User{
    
    
    public Administrador(String nome, String username, String password){
        super(nome,username,password);
        
    }
    
    public Administrador(){
        this("","","");
    }
    
    public void editarAdmin(Administrador admin){
        
        
    }
    
    
    public void adicionarVeiculo(String codigo,String cor,String marca,String modelo,String ano,String localidade,boolean emManutencao,int numPortas){
        
        CarroController carroController = new CarroController();
        boolean success = carroController.adicionarCarro(codigo, cor, marca, modelo, ano, localidade, emManutencao, numPortas);
        
        if(success)
            JOptionPane.showMessageDialog(null, "Carro adicionado com succes!");
        else
            JOptionPane.showMessageDialog(null, "Erro!");
    }
    
    public void adicionarMoto(String codMoto,String cor, String marca, String modelo,String ano, String localidade, int capacetes, boolean emManutencao){
        
        MotoController motoController = new MotoController();
        boolean success = motoController.adicionarMoto(codMoto, cor, marca, modelo, ano, localidade, capacetes, emManutencao);
        
        if(success)
            JOptionPane.showMessageDialog(null, "Moto adicionada com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Erro!");
    }
    
    public void adicionar(String codigo, String cor, String marca, String modelo, String ano,String localidade,int capacetes, boolean emManutencao){
        
        BicicletaController bicicletaController = new BicicletaController();
        boolean success = bicicletaController.adicionarBicicleta(codigo, cor, marca, modelo, ano, localidade, capacetes, emManutencao);
        
        if(success)
            JOptionPane.showMessageDialog(null, "Bciccleta Adicionada com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "ERRO!");
    }
    public void adicionarCondutor(){
        
    }
    
    public void removerCondutor(){
        
    }
}
