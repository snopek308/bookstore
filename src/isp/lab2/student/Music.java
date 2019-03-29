/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab2.student;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author tyler
 */
public interface Music extends Products {
    

    public String getArtist();

    public Duration getPlayingTime();

    
}
