/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04;

/**
 *
 * @author user
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
