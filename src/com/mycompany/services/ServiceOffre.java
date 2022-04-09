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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
        
        
      public List<Offre>afficherOffre(){
       List<Offre>myList = new ArrayList<>();
       
        try {
         
        String requete3 = "SELECT * FROM offre";
        Statement st = cnx2.createStatement();;
        ResultSet rs =  st.executeQuery(requete3);
        while(rs.next()){
            Offre o = new Offre();
            o.setId(rs.getInt(1));
            o.setNom_offre(rs.getString("nom_offre"));
            o.setDescription_offre(rs.getString("description_offre"));
            o.setPrix_offre(rs.getDouble("prix_offre"));
            o.setReduction(rs.getDouble("reduction"));
            o.setDate_debut_offre(rs.getString("date_debut_offre"));
            o.setDate_fin_offre(rs.getString("date_fin_offre"));
            myList.add(o);
        }
         //   st = new MyConnection().getCnx().createStatement();
        } catch (SQLException ex) {
         System.err.println(ex.getMessage());
        }
  
       return myList;
   
    }
      
      public void deleteOffre(int id) {
        String req = "delete from offre where id=" + id;
        try {
            PreparedStatement pst = cnx2.prepareStatement(req);
           // pst = Connection.createStatement();
            pst.executeUpdate(req);
             System.out.println("votre offre a ete bien supprime");

        } catch (SQLException ex) {
            //Logger.getLogger(ServiceReclamation.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println(ex.getMessage());
        }
    }
      
      public void updateOffre( Offre o){
        String requete2="update offre set nom_offre=?,description_offre=?,prix_offre=?,reduction=? where id=?";
        try {
            
           // pst=connection.prepareStatement(req);
           //Statement st = cnx2.createStatement();
            PreparedStatement pst = cnx2.prepareStatement(requete2);
            pst.setString(1,o.getNom_offre()); 
            pst.setString(2,o.getDescription_offre());
            pst.setDouble(3,o.getPrix_offre());
            pst.setDouble(4,o.getReduction());
            //pst.setString(5,o.getDate_debut_offre());
            //pst.setString(6,o.getDate_fin_offre());
            pst.setInt(5,o.getId());
           
            System.out.println(pst);
            pst.executeUpdate();
            System.out.println("votre offre a ete bien modife");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
    

