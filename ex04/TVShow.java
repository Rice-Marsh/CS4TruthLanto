/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04;

/**
 *
 * @author user
 */
public class TVShow {
    private String showtitle;
    private int numEps;
    private int relYear;
    
    public String getShowTitle(){
        return showtitle;
    }
    
    public int getNumEps(){
        return numEps;
    }
    
    public int getRelYear(){
        return relYear;
    }
    
    public TVShow(String a, int b, int c){
        showtitle = a;
        numEps = b;
        relYear = c;
        
        System.out.printf("Hello! A series just dropped (%s)\n", showtitle);
    }
}
