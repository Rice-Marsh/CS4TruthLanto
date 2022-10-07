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
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favSong;
    private static int totalPerformances = 0;
    
    public Singer (String g, Song h){
        name = g;
        noOfPerformances = 10;
        earnings = 0.00;
        favSong = h;
        System.out.println("Current Favorite Song of This Singer is: " + favSong.getSoTitle());
    }
    
    public String getName(){
        return name;
    }
    
    public int numPerf(){
        return noOfPerformances;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public Song getFavSong(){
        return favSong;
    }
      
    public void perfForAudi(int i){
        noOfPerformances++; 
        totalPerformances += noOfPerformances; 
        earnings = earnings + 100*i;
        
        System.out.printf("%d is the new number of performances of this singer! and %f is the money", 
                noOfPerformances, earnings);
        System.out.println();
    }
    
    public void perfForAudi(Singer m, int j){
        noOfPerformances++;
        totalPerformances += noOfPerformances; 
        
        double currentEarnings = 100*j;
        this.earnings += currentEarnings/2;
        m.earnings = m.getEarnings() + currentEarnings/2;
        
        System.out.println(this.getName() + " is performing with " + m.getName() + "!"
                + "Catch them live on tv!");
        System.out.printf("Current Earnings of " + this.getName() + " is %f", this.earnings);
        System.out.println();
        System.out.printf("Current Earnings of " + m.getName() + " is %f", m.earnings);
        System.out.println();
    }
    
    public void changeFavSong(Song j){
        favSong = j;
        System.out.println("Current Favorite Song of This Singer is: " + favSong.getSoTitle());
    }
    
}