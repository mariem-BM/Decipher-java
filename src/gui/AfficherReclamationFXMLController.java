/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.mycompany.entities.Reclamation;
import com.mycompany.services.ServiceReclamation;
import java.io.IOException;
import java.net.URL;
import static java.util.Collections.list;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AfficherReclamationFXMLController implements Initializable {

    @FXML
    private TableView<?> tableaureclam;
    @FXML
    private TableColumn<?, ?> description_reclamcol;
    @FXML
    private TableColumn<?, ?> etat_reclamcol;
    @FXML
    private TableColumn<?, ?> date_reclamcol;
    
    ObservableList myList ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       afficherReclam();
    }    
    private void afficherReclam() {
      /* ServiceReclamation sr = new ServiceReclamation();
        ObservableList<Reclamation> o = FXCollections.observableArrayList(sr.afficherReclamation());*/
       ServiceReclamation sr = new ServiceReclamation();
        List<Reclamation> reclam = sr.afficherReclamation();
        myList = FXCollections.observableList(reclam);
        tableaureclam.setItems(myList);
        
       description_reclamcol.setCellValueFactory(new PropertyValueFactory<>("description_reclamation"));
        etat_reclamcol.setCellValueFactory(new PropertyValueFactory<>("etat_reclamation"));
         date_reclamcol.setCellValueFactory(new PropertyValueFactory<>("date_reclamation"));
        
    }
    
    @FXML
    private void AjouterReclam(ActionEvent event) {
        myList.add(new Reclamation( "recl", "prenom"));
    }
       
 
  /*  private void Show(ActionEvent event) {
       ServiceReclamation sr = new ServiceReclamation();
        ObservableList<Reclamation> oc = FXCollections.observableArrayList(sr.afficherReclamation());
       description_reclamcol.setCellValueFactory(new PropertyValueFactory<>("description reclamation"));
       etat_reclamcol.setCellValueFactory(new PropertyValueFactory<>("etat reclamation"));
        date_reclamcol.setCellValueFactory(new PropertyValueFactory<>("date reclamation"));
        
        tableaureclam.setItems(oc);
    }*/
   
}
