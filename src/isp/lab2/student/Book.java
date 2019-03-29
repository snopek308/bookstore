package isp.lab2.student;

import java.time.Duration;
import java.time.LocalDate;

public interface Book extends Products{

    public String getTitle();

    public String getISBN();

     public String getAuthor();

    public int getPages();
    
  

}
