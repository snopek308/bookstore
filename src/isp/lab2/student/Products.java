/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab2.student;

import java.time.LocalDate;

/**
 *
 * @author tyler
 */
public interface Products {
    
          public double getCost();

          public int getQuantityOnHand();
      
          public LocalDate getReleaseDate();

          public void order(int quantity);
       
          public String getFormattedReleaseDate();
    
         public String getTitle();


}
