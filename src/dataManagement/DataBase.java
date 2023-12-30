/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataManagement;

import entidade.Bicicleta;
import entidade.Carro;
import entidade.Moto;
import entidade.Motor;
import entidade.Motorista;
import entidade.Pneu;
import entidade.Veiculo;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gumball
 */
public class DataBase {
    private static ArrayList<Veiculo> veiculos = new ArrayList();
    private static ArrayList<Pneu> pneus = new ArrayList();
    private static ArrayList<Motor> motores = new ArrayList();
    private static ArrayList<Motorista> motoristas = new ArrayList();
    
   public static void load(){
       loadPneus();
       loadMotors();
       loadVehicles();
       loadMotoristas();
   } 
    public static List<String> readFile(Path pathToFile){
        List<String> lines = null;
        
        if(Files.exists(pathToFile)){
            try{
                lines = Files.readAllLines(pathToFile,Charset.defaultCharset());
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "There was an internal error! Please, contact your System Administrator", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return lines;
    }
    
    public static Pneu pneuExists(int codPneu){
        if(pneus != null){
            for (Pneu pneu : pneus) {
                if(pneu.getCod() == codPneu)
                    return pneu;
            }   
        }
        return null;
    }
    
    public static Motor motorExists(int codMotor){
        if(motores != null){
            for (Motor motor : motores) {
                if(motor.getCodMotor() == codMotor)
                    return motor;
            }   
        }
        return null;
    }
    
    private static Veiculo vehicleExists(String codVehicle) {
        if(veiculos != null){
            for (Veiculo vehicle : veiculos) {
                if(vehicle.getCodVeiuclo().compareTo(codVehicle) == 0)
                    return vehicle;
            }   
        }
        return null;
    }
    
    public static Motorista motoristaExists(String codDriver){
        if(motoristas != null){
            for (Motorista motorista : motoristas) {
                if(motorista.getCodCondutor().compareTo(codDriver) == 0)
                    return motorista;
            }   
        }
        return null;
    }
    
    public static void loadMotoristas(){
        Path pathToPneus = Paths.get("Dados","motoristas");
        List<String> lines = readFile(pathToPneus);
        Veiculo vehicle;
        if(lines != null){
            for(String line: lines){
                String[] motoristaDetails = line.split(";");
                vehicle = vehicleExists(motoristaDetails[0]);
                if(motoristaDetails.length > 4)
                 motoristas.add(new Motorista(vehicle,Integer.parseInt(motoristaDetails[1]),motoristaDetails[2],motoristaDetails[3],motoristaDetails[4],motoristaDetails[5].charAt(0)));
            }
        }
    }
    public static void loadPneus(){
        Path pathToPneus = Paths.get("Dados","pneus");
        List<String> lines = readFile(pathToPneus);
        
        if(lines != null){
            for(String line: lines){
                String[] pneuDetails = line.split(";");
                
                pneus.add(new Pneu(Float.parseFloat(pneuDetails[1]),Integer.parseInt(pneuDetails[0])));
            }
        }
    }
    public static void loadMotors(){
        Path pathToMotors = Paths.get("Dados","motores");
        List<String> lines = readFile(pathToMotors);
        
        if(lines != null){
            for(String line: lines){
                String[] pneuDetails = line.split(";");
                if(pneuDetails.length > 2)
                    motores.add(new Motor(Integer.parseInt(pneuDetails[0]),Integer.parseInt(pneuDetails[1]),Integer.parseInt(pneuDetails[2]) == 1, Integer.parseInt(pneuDetails[3]) == 1));
            }
        }
    }
    
    public static void loadVehicles(){
        Path pathToVehicle = Paths.get("Dados","veiculos");
        List<String> lines = readFile(pathToVehicle);
        Pneu pneu;
        Motor motor;
        
        if(lines != null){
            for (String line : lines) {
                String vehicleDetails[] = line.split(";");
                
                if(Integer.parseInt(vehicleDetails[0]) == 0){
                    pneu = pneuExists(Integer.parseInt(vehicleDetails[9]));
                    veiculos.add(new Bicicleta(Integer.parseInt(vehicleDetails[8]),pneu,vehicleDetails[1],vehicleDetails[2],vehicleDetails[3],vehicleDetails[4],vehicleDetails[5],vehicleDetails[6],Integer.parseInt(vehicleDetails[7]) == 1));
                }
                if(Integer.parseInt(vehicleDetails[0])  == 1){
                    pneu = pneuExists(Integer.parseInt(vehicleDetails[10]));
                    motor = motorExists(Integer.parseInt(vehicleDetails[9]));
                    veiculos.add(new Carro(Integer.parseInt(vehicleDetails[8]),motor, pneu,vehicleDetails[1],vehicleDetails[2],vehicleDetails[3],vehicleDetails[4],vehicleDetails[5], vehicleDetails[6],Integer.parseInt(vehicleDetails[7]) == 1));
                }
                if(Integer.parseInt(vehicleDetails[0])  == 2){
                    pneu = pneuExists(Integer.parseInt(vehicleDetails[10]));
                    motor = motorExists(Integer.parseInt(vehicleDetails[9]));
                    veiculos.add(new Moto(Integer.parseInt(vehicleDetails[8]),motor, pneu,vehicleDetails[1],vehicleDetails[2],vehicleDetails[3],vehicleDetails[4],vehicleDetails[5], vehicleDetails[6],Integer.parseInt(vehicleDetails[7]) == 1));
                }
            }
        }
    }
    public static boolean credentialsExist(String username, String password){
        Path pathToFile = Paths.get("Dados", "passwords");
        List<String> credentialsList = readFile(pathToFile);
        
        String credentials[];
        
        for (String string : credentialsList) {
            credentials = string.split(";");
            
            //In case there is a blank line
            if(credentials.length > 0){
                if(credentials[0].compareTo(username) == 0 && credentials[1].compareTo(password) == 0)
                    return true;
            }
        }
        return false;
    }

    public static ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public static ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public static ArrayList<Pneu> getPneus() {
        return pneus;
    }

    public static ArrayList<Motor> getMotores() {
        return motores;
    }
}
