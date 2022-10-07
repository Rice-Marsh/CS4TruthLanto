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
public class Song {
    private String soTitle;
    private String soSinger;
    private int soRelYear;
    
    public String getSoTitle(){
        return soTitle;
    }
    
    public String getSoSinger(){
        return soSinger;
    }
    
    public int getSoRelYear(){
        return soRelYear;
    }
    
    public Song(String d, String e, int f){
       soTitle = d;
       soSinger = e;
       soRelYear = f;
       
       System.out.printf("A new song has been released! (%s)\n", soTitle);
    }
    
    public void Play(){
        System.out.println("Lalala~ Currently Playing: " + this.soTitle);
    }
}