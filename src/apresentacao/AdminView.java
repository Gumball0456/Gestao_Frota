/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
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
    JButton addVehicleButton = new JButton("Adicionar Veiculo");
    int row;
    
    public AdminView(){
        setLayout(new GridBagLayout());
        
        showVehicles.setToolTipText("Mostrar Veiculos");
        showDrivers.setToolTipText("Mostrar Condutores");
        setProfileIcon();
    }
   
    public void addVehicle(Icon imageIcon,String codVeiculo, String marca, String modelo, String cor, ActionListener removePanel){
        JPanel vehicleContainer = new JPanel();
        JLabel vehicleShortSpecs = new JLabel(codVeiculo + " - " + marca + " " + modelo + ", " + cor + " | ");
        JLabel icon = new JLabel("");
        icon.setIcon(imageIcon);
        JButton vehicleDetails = new JButton("Ver Detalhes");
        JButton removeVehicle = new JButton("Remover Veiculo");
        removeVehicle.addActionListener(removePanel);
        removeVehicle.setBackground(Color.red);
        removeVehicle.setForeground(Color.white);
        
        vehicleContainer.setLayout(new GridBagLayout());
        
        vehicleContainer.add(icon, new GridBagConstraints(0, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 5, 0, 0), 0, 0));
        vehicleContainer.add(vehicleShortSpecs, new GridBagConstraints(1, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 5, 0, 0), 0, 0));
        
        vehicleContainer.add(vehicleDetails, new GridBagConstraints(2, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        vehicleContainer.add(removeVehicle, new GridBagConstraints(3, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        add(vehicleContainer, new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 0), 0, 0));
    }
    public void addDriver(Icon imageIcon,String codDriver, String nome,ActionListener removerPanel){
        JPanel driverContainer = new JPanel();
        JLabel driverShortdetail = new JLabel(codDriver + " | " + nome + " | ");
        JLabel icon = new JLabel("");
        icon.setIcon(imageIcon);
        JButton driverDetails = new JButton("Ver Detalhes");
        JButton removeDriver = new JButton("Remover Motorista");
        removeDriver.addActionListener(removerPanel);
        removeDriver.setBackground(Color.red);
        removeDriver.setForeground(Color.white);
        
        driverContainer.setLayout(new GridBagLayout());
        
        driverContainer.add(icon, new GridBagConstraints(0, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 5, 0, 0), 0, 0));
        driverContainer.add(driverShortdetail, new GridBagConstraints(1, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 5, 0, 0), 0, 0));
        
        driverContainer.add(driverDetails, new GridBagConstraints(2, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        driverContainer.add(removeDriver, new GridBagConstraints(3, 0, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        
        add(driverContainer, new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 0, 0,
   GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 5, 0), 0, 0));
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

    public void drawNavBar() {
        row = 0;
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
        addComponent(navBar, row++, 0, 1, 1,1,0, GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,0, 0, 0, 0, 0, 0);
    }

    public void setProfileIcon(){
        Path imagePath = Paths.get("imagens/account.png");
        
        //Add image and resize it
        Icon profileIcon = new ImageIcon( new ImageIcon(imagePath.toAbsolutePath().toString()).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        
        //Attach it to the label
        profile = new JLabel(profileIcon);
        profile.setToolTipText("Perfil");
    }
    
    public void drawAddButton(String text) {
        addVehicleButton.setText(text);
        
        addComponent(addVehicleButton,GridBagConstraints.RELATIVE,0,1,1,0,1,GridBagConstraints.SOUTHWEST,GridBagConstraints.NONE,10,10,10,10,0,0);
        
    }

    public void addEventListenerAddVehicle(ActionListener actionListener) {
        addVehicleButton.addActionListener(actionListener);
    }
}
