/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.entities.Reclamation;
import com.mycompany.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ServiceReclamation {
    
    Connection cnx2;
    
    public ServiceReclamation(){
        cnx2 = MyConnection.getInstance().getCnx();
        
    }

    
    
    public void ajouterReclamation() {
        
        String requete = "INSERT INTO reclamation (description_reclamation,etat_reclamation,date_reclamation) "
                + "VALUES ('reclam1','envoye', DATE '2013-11-26')";
        
        try {
            Statement st = cnx2.createStatement();   //obtention de l'objet connexion en utilisant une instance de la classe myconnection
          st.executeUpdate(requete);
          System.out.println("reclamation ajoute avec succes");
       
        } catch (SQLException ex) {
          System.err.println(ex.getMessage());
        }
    }
    
    public void ajouterReclamation2(Reclamation r){
        
        String requete2 = "INSERT INTO reclamation (description_reclamation,etat_reclamation,date_reclamation) "
                 + "VALUES(?,?,?)";
        
        try {
           PreparedStatement pst = cnx2.prepareStatement(requete2);  //utilise pour les requete dynamique
           pst.setString(1, r.getDescription_reclamation());
           pst.setString(2, r.getEtat_reclamation());
           pst.setString(3, r.getDate_reclamation());
           
           pst.executeUpdate();
           
           System.out.println("votre reclam est ajoute");
        
        
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
        
    }
    
    public List<Reclamation>afficherReclamation(){
            List<Reclamation>myList = new ArrayList<>();
       
        try {
         
        String requete3 = "SELECT * FROM reclamation";
        Statement st = cnx2.createStatement();;
        ResultSet rs =  st.executeQuery(requete3);
        while(rs.next()){
            Reclamation r = new Reclamation();
            r.setId(rs.getInt(1));
            r.setDescription_reclamation(rs.getString("description_reclamation"));
            r.setEtat_reclamation(rs.getString("etat_reclamation"));
            myList.add(r);
        }
         //   st = new MyConnection().getCnx().createStatement();
        } catch (SQLException ex) {
         System.err.println(ex.getMessage());
        }
  
       return myList;
    }
    
   /* public void deleteReclamation(Reclamation re){
        String req="delete from reclamation where id=?";
        try {
            PreparedStatement pst = cnx2.prepareStatement(req);
            //pst=Connection.prepareStatement(req);
            pst.setInt(1,re.getId());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
    public void deleteReclamation(int id) {
        String req = "delete from reclamation where id=" + id;
        try {
            PreparedStatement pst = cnx2.prepareStatement(req);
           // pst = Connection.createStatement();
            pst.executeUpdate(req);
             System.out.println("votre reclam a ete bien supprime");

        } catch (SQLException ex) {
            //Logger.getLogger(ServiceReclamation.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println(ex.getMessage());
        }
    }
    
    /* public void updateReclamation(Reclamation r) {

        String req = "update reclamation set description_reclamation=" + r.getDescription_reclamation() + ",etat_reclamation = " + r.getEtat_reclamation() + ",date_reclamation = " + r.getDate_reclamation() + " where id="+ r.getId() + ";";
        try {
            PreparedStatement pst = cnx2.prepareStatement(req);
//            pst = Connection.createStatement();
            pst.executeUpdate(req);

        } catch (SQLException ex) {
            //Logger.getLogger(EventService.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }

    }*/
     
     public void updateReclamation( Reclamation r){
        String requete2="update reclamation set description_reclamation=?,etat_reclamation=? where id=?";
        try {
            
           // pst=connection.prepareStatement(req);
           //Statement st = cnx2.createStatement();
            PreparedStatement pst = cnx2.prepareStatement(requete2);
            pst.setString(1,r.getDescription_reclamation()); 
            pst.setString(2,r.getEtat_reclamation());
           // pst.setString(3,r.getDate_reclamation());
            pst.setInt(3,r.getId());
           
            System.out.println(pst);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    }
    

