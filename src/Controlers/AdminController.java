    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Controlers;

    import apresentacao.AdminView;
    import dataManagement.DataBase;
    import entidade.Carro;
    import entidade.Moto;
    import entidade.Motorista;
    import entidade.Veiculo;
    import java.awt.Image;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.awt.event.MouseAdapter;
    import java.awt.event.MouseEvent;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.util.ArrayList;
    import javax.swing.Icon;
    import javax.swing.ImageIcon;

    /**
     *
     * @author gumball
     */
    public class AdminController {
        AdminView adminView;
        
        ArrayList<Veiculo> vehicles = DataBase.getVeiculos();
        ArrayList<Motorista> drivers = DataBase.getMotoristas();

        //0 para mostrar os veiculos, 1 para mostrar os condutores
        int selectedView = 0;

        public AdminController(AdminView adminView){
            this.adminView = adminView;
            updateView();
            //Add event listeners
            adminView.AddEventListenerShowVehicles(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent me){
                    if(selectedView != 0){
                        selectedView = 0;
                        updateView();
                    }  
                }
            });

            adminView.AddEventListenerShowDrivers(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent me){
                    if(selectedView != 1){
                        selectedView = 1;
                        updateView();
                    } 
                }
            });
        }
        public void updateView() {
            // Clear the view before adding new components
            adminView.removeAll();
            
            // Draw the navigation bar
            adminView.drawNavBar();

            // Add components based on the selected view
            if (selectedView == 1) {
                addDriversToView();
                adminView.drawAddButton("Adicionar Condutor");
                adminView.showDriversSelected();
            } else {
                addVehiclesToView();
                adminView.drawAddButton("Adicionar Veiculo");
                adminView.showVehiclesSelected();
            }

            // Revalidate and repaint the updated view
            adminView.revalidate();
            adminView.repaint();
        }

        public Icon getIconForVehicle(Veiculo veiculo){
            Path imagePath;

            if(veiculo instanceof Moto)
                imagePath = Paths.get("imagens/motorcycle.png");

            else if(veiculo instanceof Carro)
                imagePath = Paths.get("imagens/car.png");

            else
                imagePath = Paths.get("imagens/bike.png");

            return new ImageIcon( new ImageIcon(imagePath.toAbsolutePath().toString()).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        }
        public Icon getIconForDriver(Motorista driver){
            Path imagePath;

            if(driver.getSexo() == 'M')
                imagePath = Paths.get("imagens/man.png");

            else
                imagePath = Paths.get("imagens/woman.png");

            return new ImageIcon( new ImageIcon(imagePath.toAbsolutePath().toString()).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        }

        public void addVehiclesToView(){
            for (Veiculo vehicle : vehicles) {
                adminView.addVehicle(getIconForVehicle(vehicle),vehicle.getCodVeiuclo(), vehicle.getMarca(), vehicle.getModelo(), vehicle.getCor(), new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        vehicles.remove(vehicle);
                        System.out.println(DataBase.getVeiculos().size());
                        updateView();
                    }
                });
            }
        }
        
        public void addDriversToView(){
            for (Motorista driver : drivers) {
                adminView.addDriver(getIconForDriver(driver),driver.getCodCondutor(),driver.getNome(), new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        drivers.remove(driver);
                        updateView();
                    }
                });
            }
        }
    }
