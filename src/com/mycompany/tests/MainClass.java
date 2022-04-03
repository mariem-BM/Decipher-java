/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tests;

import com.mycompany.entities.Reclamation;
import com.mycompany.services.ServiceReclamation;
import com.mycompany.utils.MyConnection;

/**
 *
 * @author ASUS
 */
public class MainClass {
    
    public static void main(String[] args) {
        
       // MyConnection mc = new MyConnection();
       
       //add
      /*ServiceReclamation reclamation = new ServiceReclamation();
      /*Reclamation r2 = new Reclamation("testsingleton","envoye","2000-11-26");
      reclamation.ajouterReclamation2(r2);*/
      
 
     //displayy
      
   /*  ServiceReclamation reclamation = new ServiceReclamation();
     System.out.println(reclamation.afficherReclamation());*/
      
     //delete
      /*ServiceReclamation reclamation = new ServiceReclamation();
      //reclamation.deleteReclamation(12);
      reclamation.deleteReclamation(17);
      */
      
      ServiceReclamation reclamation = new ServiceReclamation();
       Reclamation r2 = new Reclamation("modif","envoye");
           r2.setId(16);
           reclamation.updateReclamation(r2);
     
    }
    
}
