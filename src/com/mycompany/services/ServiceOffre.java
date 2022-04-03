/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;


import com.mycompany.utils.MyConnection;
import java.sql.Connection;
import com.mycompany.entities.Offre;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class ServiceOffre {
    
     Connection cnx2;
    
    public ServiceOffre(){
        cnx2 = MyConnection.getInstance().getCnx();
        
    }

     public void ajouterOffre(Offre o){
        
        String requete2 = "INSERT INTO offre (nom_offre,description_offre,prix_offre,reduction,date_debut_offre,date_fin_offre) "
                 + "VALUES(?,?,?,?,?,?)";
        
        try {
           PreparedStatement pst = cnx2.prepareStatement(requete2);  //utilise pour les requete dynamique
           pst.setString(1, o.getNom_offre());
           pst.setString(2, o.getDescription_offre());
           pst.setDouble(3, o.getPrix_offre());
           pst.setDouble(4, o.getReduction());
           pst.setString(5, o.getDate_debut_offre());
           pst.setString(6, o.getDate_fin_offre());
           
           pst.executeUpdate();
           
           System.out.println("votre offre est ajoute");
        
        
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
        
    }
    
    
}
