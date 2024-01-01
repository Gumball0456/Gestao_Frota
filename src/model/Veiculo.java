/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public abstract class Veiculo {
    
    private String codVeiculo;
    private String cor;
    private String marca;
    private String modelo;
    private String ano;
    private String localidade;
    private boolean emManutencao;

    public Veiculo(String codVeiculo, String cor, String marca, String modelo, String ano, String localidade, boolean emManutencao) {
        this.codVeiculo = codVeiculo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.localidade = localidade;
        this.emManutencao = emManutencao;
    }
    
    public Veiculo(){
        this("0000","preta","Toyota","corolla","1999","Luanda",false);
    }

    public String getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(String codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }
    
    public abstract void ligarMotor();
    public abstract void desligarMotor();
    
    
    
    
}
