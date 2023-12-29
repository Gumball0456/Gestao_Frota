/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kd
 */
public class Motor {
    
    private String codMotor;
    private boolean ligado;
    private boolean emManutencao;

    public Motor() {
    }

    public Motor(String codMotor, boolean ligado, boolean emManutencao) {
        this.codMotor = codMotor;
        this.ligado = ligado;
        this.emManutencao = emManutencao;
    }

    public String getCodMotor() {
        return codMotor;
    }

    public void setCodMotor(String codMotor) {
        this.codMotor = codMotor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }
    
    
}
