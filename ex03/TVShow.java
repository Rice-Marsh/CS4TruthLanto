package ex03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUTH
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