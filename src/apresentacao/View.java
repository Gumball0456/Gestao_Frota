/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;

/**
 *
 * @author gumball
 */
public abstract class View extends JPanel{
    public View(){
        setLayout(new GridBagLayout());
        this.setBackground(Color.GRAY);
    }
    

    protected void addComponent(Component component, int row, int column, int width, int height){
        //constraints to set position
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = column;
        c.gridy = row;
        c.gridheight = height;
        c.gridwidth = width;
        add(component,c);
    }
    protected void addComponent(Component component, int row, int column, int width, int height, int anchor){
        //constraints to set position
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = column;
        c.gridy = row;
        c.gridheight = height;
        c.gridwidth = width;
        c.anchor = anchor;
        add(component,c);
    }
    
    protected void addComponent(Component component, int row, int column, int width, int height, Insets insets){
        //constraints to set position
        GridBagConstraints c = new GridBagConstraints();
        c.insets = insets;
        c.gridx = column;
        c.gridy = row;
        c.gridheight = height;
        c.gridwidth = width;
        add(component,c);
    }
}
