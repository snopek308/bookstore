package isp.lab1.student;

import java.time.Duration;
import java.time.LocalDate;

public interface Book {

          public String getTitle();

          public String getISBN();

          public String getAuthor();

         public int getPages();
    
         public double getCost();

          public int getQuantityOnHand();
      
          public LocalDate getReleaseDate();

          public void order(int quantity);
       
          public String getFormattedReleaseDate();
    
     

}
