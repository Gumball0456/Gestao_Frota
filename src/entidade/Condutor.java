/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author _Yuye_
 */
public class Condutor {
    
    private String nome;
    private String dataDeNascimento;
    private String codCondutor;
    private char sexo;

    public Condutor(String nome, String dataDeNascimento, String codCondutor, char sexo) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.codCondutor = codCondutor;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCodCondutor() {
        return codCondutor;
    }

    public void setCodCondutor(String codCondutor) {
        this.codCondutor = codCondutor;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }   
}
