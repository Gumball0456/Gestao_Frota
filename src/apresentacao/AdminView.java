/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseListener;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author gumball
 */
public class AdminView extends View{
    JLabel showVehicles = new JLabel("Veiculos");
    JLabel showDrivers = new JLabel("Condutores");
    JLabel profile;
    JMenuBar navBar = new JMenuBar();
    JButton addVehicleButton = new JButton("Adicioanr Vehiculo");
    
    
    public AdminView(){
        setLayout(new GridBagLayout());
        setProfileIcon();
        
        showVehicles.setToolTipText("Mostrar Veiculos");
        showDrivers.setToolTipText("Mostrar Condutores");
        
        //show Vehicles upon entering Admin view
        showVehiclesSelected();
        
        navBar.setLayout(new GridBagLayout());
        
        //Add Vehicle Label to the navBar
        navBar.add(showVehicles, new GridBagConstraints(0, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 10, 0, 10), 0, 0));
        
        //Add driver Label to the navBar
        navBar.add(showDrivers, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        //Add profileIcon Label to the navBar
        navBar.add(profile, new GridBagConstraints(2, 0, 1, 1, 1.0, 1.0,
   GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 10), 0, 0));
        
        //Add navBar to Panel
        addComponent(navBar, 0, 0, 1, 1,1,1, GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,0, 0, 0, 0, 0, 0);
        
        //Add button to Add a vehicle
        addComponent(addVehicleButton,1,0,1,1,1,1,GridBagConstraints.SOUTHWEST,GridBagConstraints.NONE,10,10,10,10,0,0);
    }
    
    public void setProfileIcon(){
        Path imagePath = Paths.get("imagens/account.png");
        
        //Add image and resize it
        Icon profileIcon = new ImageIcon( new ImageIcon(imagePath.toAbsolutePath().toString()).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        
        //Attach it to the label
        profile = new JLabel(profileIcon);
        profile.setToolTipText("Perfil");
    }
    
    public void showVehicle(){
        JPanel vehicleContainer = new JPanel();
        vehicleContainer.setLayout(new GridBagLayout());
        
        
    }

    public void AddEventListenerShowVehicles(MouseListener mouseListener) {
        showVehicles.addMouseListener(mouseListener);
    }

    public void AddEventListenerShowDrivers(MouseListener mouseListener) {
        showDrivers.addMouseListener(mouseListener);
    }

    public void showDriversSelected() {
        showDrivers.setText(underlineText(showDrivers.getText()));
        showVehicles.setText(removeUnderline(showVehicles.getText()));
    }

    public void showVehiclesSelected() {
        showVehicles.setText(underlineText(showVehicles.getText()));
        showDrivers.setText(removeUnderline(showDrivers.getText()));
    }
}
