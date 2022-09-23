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
    String showtitle;
    int numEps;
    int relYear;
    
    public TVShow(String a, int b, int c){
        showtitle = a;
        numEps = b;
        relYear = c;
        
        System.out.printf("Hello! A series just dropped (%s)\n", showtitle);
    }
}
