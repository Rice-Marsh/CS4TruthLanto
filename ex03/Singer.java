/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author TRUTH
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favSong;
    
    public Singer (String g, Song h){
        name = g;
        noOfPerformances = 10;
        earnings = 0.00;
        favSong = h;
    }
      
    public void perfForAudi(int i){
        noOfPerformances++; 
        earnings = earnings + 100*i;
        
    }
    
    public void changeFavSong(Song j){
        favSong = j;
    }
    
}
