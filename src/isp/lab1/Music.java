/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab1;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author tyler
 */
public interface Music {
    
    
    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getArtist();

    public void order(int quantity);

    public Duration getPlayingTime();

    public String getFormattedReleaseDate();
    
    public String getTitle();

}
