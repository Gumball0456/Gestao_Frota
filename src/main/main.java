/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Controlers.InicioController;
import dataManagement.DataBase;
import javax.swing.JFrame;

/**
 *
 * @author gumball
 */
public class main{
    public static void main(String args[]){
       DataBase.load();
       Inicio frame = new Inicio();
       InicioController frameController= new InicioController(frame);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000,800);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       InicioController.showPanel(0);
    }
}
