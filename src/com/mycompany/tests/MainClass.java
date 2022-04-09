/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tests;
import javax.swing.JFrame;
import com.mycompany.entities.Offre;
import com.mycompany.entities.Reclamation;
import com.mycompany.services.ServiceOffre;
import com.mycompany.services.ServiceReclamation;
import com.mycompany.utils.MyConnection;
import static java.sql.JDBCType.DATE;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */

public class MainClass {
    
    public static void main(String[] args) throws SQLException {
        
       // MyConnection mc = new MyConnection();
       
       //add reclam
     /* ServiceReclamation reclamation = new ServiceReclamation();
      Reclamation r2 = new Reclamation("reclam12","envoye","2002-11-26");
      reclamation.ajouterReclamation2(r2);
     System.out.println(reclamation.afficherReclamation());*/
      
 
     //displayy reclam
      
  /*  ServiceReclamation reclamation = new ServiceReclamation();
     System.out.println(reclamation.afficherReclamation());*/
      
     //delete reclam
     /* ServiceReclamation reclamation = new ServiceReclamation();
      //reclamation.deleteReclamation(12);
      reclamation.deleteReclamation(22);
      */
      
      //update reclam
     /* ServiceReclamation reclamation = new ServiceReclamation();
       Reclamation r2 = new Reclamation("reclam modifer","traite");
           r2.setId(21);
           reclamation.updateReclamation(r2);*/
     
     
     
      //add offre
     /* ServiceOffre offre = new ServiceOffre();
      Offre o = new Offre("offre12","descripjava",40,5,"2000-11-26","2002-11-26");
      offre.ajouterOffre(o);
    */
      
      //displayy offre
      
    /* ServiceOffre offre = new ServiceOffre();
     System.out.println(offre.afficherOffre());*/
    
    
    //delete offre
     /* ServiceOffre offre = new ServiceOffre();
      //reclamation.deleteReclamation(12);
      offre.deleteOffre(22);
      */
     
      //update offre
   /*  ServiceOffre offre = new ServiceOffre();
       Offre o2 = new Offre("offre21","desc21",10,5);
           o2.setId(21);
           offre.updateOffre(o2);*/
           
            /*Offre o2 = new Offre("offre9","desc9",50,5);
           o2.setId(9);
           offre.updateOffre(o2);*/
           
    
    // TrouveEtatReclam
    
   /*  ServiceReclamation reclamation = new ServiceReclamation();
        try {
            reclamation.TrouveEtatReclam(22);
            // offre.TrouveEtatReclam(22);
        } catch (SQLException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }*/
   
    //displayy offre search selon id
    /*  
     ServiceReclamation reclamation = new ServiceReclamation();
        try {
            System.out.println(reclamation.TrouveEtatReclamId(20));
        } catch (SQLException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }*/
      
    
     //displayy offre search selon etat
      
     ServiceReclamation reclamation = new ServiceReclamation();
       
            //System.out.println(reclamation.TrouveEtatReclam("envoye"));
             System.out.println(reclamation.TrouveEtatReclam("traite"));
       
    }
    
}
