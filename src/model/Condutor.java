/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class Condutor {
    
    private String codCondutor;
    private String nome;
    private String dataNascimento;
    private String  sexo;

    
    public Condutor(){
        
    }
    public Condutor(String codCondutor, String nome, String dataNascimento, String sexo) {
        this.codCondutor = codCondutor;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getCodCondutor() {
        return codCondutor;
    }

    public void setCodCondutor(String codCondutor) {
        this.codCondutor = codCondutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String  getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void adicionarCondutor(Condutor condutor){
        
    }
}
