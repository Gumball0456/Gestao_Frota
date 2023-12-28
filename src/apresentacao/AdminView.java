/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

/**
 *
 * @author gumball
 */
public class AdminView extends View{
    JLabel vehicle = new JLabel("Veiculos");
    JLabel driver = new JLabel("Condutores");
    JLabel profile;
    JMenuBar navBar = new JMenuBar();
    
    
    public AdminView(){
        setLayout(new GridBagLayout());
        setProfileIcon();
        
        navBar.setLayout(new GridBagLayout());
        
        //Add Vehicle Label to the navBar
        navBar.add(vehicle, new GridBagConstraints(0, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 10, 0, 10), 0, 0));
        
        //Add driver Label to the navBar
        navBar.add(driver, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        //Add profileIcon Label to the navBar
        navBar.add(profile, new GridBagConstraints(2, 0, 1, 1, 1.0, 1.0,
   GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 10), 0, 0));
        add(navBar, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
   GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
    }
    
    public void setProfileIcon(){
        Path imagePath = Paths.get("imagens/account.png");
        
        //Add image and resize it
        Icon profileIcon = new ImageIcon( new ImageIcon(imagePath.toAbsolutePath().toString()).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        
        //Attach it to the label
        profile = new JLabel(profileIcon);
    }
}
