/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tests;

import com.mycompany.entities.Offre;
import com.mycompany.entities.Reclamation;
import com.mycompany.services.ServiceOffre;
import com.mycompany.services.ServiceReclamation;
import com.mycompany.utils.MyConnection;

/**
 *
 * @author ASUS
 */
public class MainClass {
    
    public static void main(String[] args) {
        
       // MyConnection mc = new MyConnection();
       
       //add reclam
      /*ServiceReclamation reclamation = new ServiceReclamation();
      /*Reclamation r2 = new Reclamation("testsingleton","envoye","2000-11-26");
      reclamation.ajouterReclamation2(r2);*/
      
 
     //displayy reclam
      
   /*  ServiceReclamation reclamation = new ServiceReclamation();
     System.out.println(reclamation.afficherReclamation());*/
      
     //delete reclam
      /*ServiceReclamation reclamation = new ServiceReclamation();
      //reclamation.deleteReclamation(12);
      reclamation.deleteReclamation(17);
      */
      
      //update reclam
     /* ServiceReclamation reclamation = new ServiceReclamation();
       Reclamation r2 = new Reclamation("modif","envoye");
           r2.setId(16);
           reclamation.updateReclamation(r2);
     */
     
     
      //add offre
      ServiceOffre offre = new ServiceOffre();
      Offre o = new Offre("offrejava","descripjava",40,5,"2000-11-26","2002-11-26");
      offre.ajouterOffre(o);
    }
    
}
