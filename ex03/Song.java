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
    String soTitle;
    String soSinger;
    int soRelYear;
    
    public Song(String d, String e, int f){
       soTitle = d;
       soSinger = e;
       soRelYear = f;
       
       System.out.printf("A new song has been released! (%s)\n", soTitle);
    }
    
    public void Play(String m){
        System.out.print("Lalala~ Currently Playing: " + m);
    }
}
